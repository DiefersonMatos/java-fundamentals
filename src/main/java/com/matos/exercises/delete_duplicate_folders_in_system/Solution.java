package com.matos.exercises.delete_duplicate_folders_in_system;

import java.util.*;

class Solution {
    class Node {
        String name;
        Map<String, Node> children = new HashMap<>();
        boolean deleted = false;

        Node(String name) {
            this.name = name;
        }
    }

    private Node root = new Node("");

    public List<List<String>> deleteDuplicateFolder(List<List<String>> paths) {
        // 1. Build the directory tree
        for (List<String> path : paths) {
            Node curr = root;
            for (String folder : path) {
                curr = curr.children.computeIfAbsent(folder, k -> new Node(folder));
            }
        }

        // 2. Serialize subtrees and count frequencies
        Map<String, Integer> countMap = new HashMap<>();
        serialize(root, countMap);

        // 3. Mark duplicates
        mark(root, countMap);

        // 4. Collect non-deleted paths
        List<List<String>> result = new ArrayList<>();
        collectPaths(root, new ArrayList<>(), result);

        return result;
    }

    private String serialize(Node node, Map<String, Integer> countMap) {
        if (node.children.isEmpty()) return "";

        List<String> serials = new ArrayList<>();
        for (Node child : node.children.values()) {
            String serial = serialize(child, countMap);
            serials.add("(" + child.name + serial + ")");
        }

        Collections.sort(serials); // Important for consistent structure comparison
        String serial = String.join("", serials);
        countMap.put(serial, countMap.getOrDefault(serial, 0) + 1);
        return serial;
    }

    private void mark(Node node, Map<String, Integer> countMap) {
        if (node.children.isEmpty()) return;

        List<String> serials = new ArrayList<>();
        for (Node child : node.children.values()) {
            mark(child, countMap);
            String serial = serialize(child, new HashMap<>()); // Independent serialization
            serials.add("(" + child.name + serial + ")");
        }

        Collections.sort(serials);
        String serial = String.join("", serials);
        if (countMap.getOrDefault(serial, 0) > 1) {
            node.deleted = true;
        }
    }

    private void collectPaths(Node node, List<String> path, List<List<String>> result) {
        for (Node child : node.children.values()) {
            if (!child.deleted) {
                path.add(child.name);
                result.add(new ArrayList<>(path));
                collectPaths(child, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Solution finder = new Solution();

        List<List<String>> input = Arrays.asList(
                Arrays.asList("a"), Arrays.asList("c"), Arrays.asList("d"),
                Arrays.asList("a", "b"), Arrays.asList("c", "b"), Arrays.asList("d", "a")
        );

        List<List<String>> result = finder.deleteDuplicateFolder(input);
        for (List<String> path : result) {
            System.out.println(path);
        }
    }
}

