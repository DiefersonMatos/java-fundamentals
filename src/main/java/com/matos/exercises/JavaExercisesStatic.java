package com.matos.exercises;

import java.util.*;
import java.util.stream.Collectors;

public class JavaExercisesStatic {
    public static void main(String[] args) {

        System.out.println("1. Reverse String: " + reverseString("Dieferson"));
        System.out.println("2.1 Palindrome: " + isPalindrome("rotator"));
        System.out.println("2.2 Palindrome: " + isPalindrome("Theodoro"));
        System.out.println("3.1 Fibonnacci: " + fibonacciInteractive(1));
        System.out.println("3.2 Fibonnacci: " + fibonacciInteractive(3));
        System.out.println("3.3 Fibonnacci: " + fibonacciInteractive(5));
        System.out.println("3.4 Fibonnacci: " + fibonacciInteractive(6));
        System.out.println("4. Factorial: " + factorial(5));
        System.out.println("5.1 Prime: " + isPrime(13));
        System.out.println("5.2 Prime: " + isPrime(10));

        int[] array = {1, 3, 8, 4, 2};
        bubbleSort(array);
        System.out.println("6.1 Bubble Sort: " + Arrays.toString(array));

        int[] array2 = {1, 2, 3, 4, 5};
        bubbleSort(array2);
        System.out.println("6.2 Bubble Sort: " + Arrays.toString(array2));

        int[] array3 = {5, 3, 2, 0, 0};
        bubbleSort(array3);
        System.out.println("6.3 Bubble Sort: " + Arrays.toString(array3));

        System.out.println("7. Remove Duplicates: " + removeDuplicates(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println("8.1 Count same chars in a string: " + countSameChars("banana"));
        System.out.println("8.2 Count Chars: " + countChars("banana"));
        System.out.println("9.1 Min/Max: " + Arrays.toString(findMinMax(new int[]{5, 2, 9, 1, 6})));
        int[] result = findMinMax(new int[]{5, 2, 9, 1, 6});
        System.out.println("9.2 Min: " + result[0] + ", Max: " + result[1]);
        System.out.println("10. Anagram: " + isAnagram("listen", "silent"));
        System.out.println("10. Anagram: " + isAnagram("amor", "roma"));
        System.out.println("10. Anagram: " + isAnagram("java", "script"));
        System.out.println("11.1 Binary Search: " + binarySearch(new int[]{1, 3, 5, 7, 9}, 5));
        System.out.println("11.2 Binary Search: " + binarySearch(new int[]{1, 3, 5, 7, 9, 10}, 10));
        System.out.println("11.3 Binary Search: " + binarySearchUnorderArr(new int[]{1, 10, 3, 5, 7, 9}, 10));
        fizzBuzz(15);
        System.out.println("13. Reverse Words: " + reverseWords("Java is fun"));
        System.out.println("14.1 Arrays Equal: " + arraysEqual(new int[]{1, 2}, new int[]{1, 2}));
        System.out.println("14.2 Arrays Equal: " + arraysEqual(new int[]{1, 2}, new int[]{1, 3}));
        System.out.println("15.1 Remove Nulls: " + removeNulls(new ArrayList<>(Arrays.asList("a", null, "b", null))));
        System.out.println("15.2 Remove Nulls: " + removeNulls(new ArrayList<>(Arrays.asList("a", "b", "c", "null"))));
        System.out.println("15.3 Remove Nulls: " + removeNulls(new ArrayList<>(Arrays.asList(null, null, null, null))));
        System.out.println("16. Unique Words: " + countUniqueWords("This is is a test"));
        System.out.println("16. Unique Words: " + countUniqueWords("This is a test"));
        System.out.println("16. Unique Words: " + countUniqueWords("This is a test guy"));
        System.out.println("17.1 Decimal to Binary: " + toBinary(10));
        System.out.println("17.2 Decimal to Binary: " + toBinary(100));
        System.out.println("18. Sum Digits: " + sumDigits(12345));
        System.out.println("18. Sum Digits: " + sumDigits(55555));

        System.out.println("19.1 Has Duplicates: " + hasDuplicates(new int[]{1, 2, 3, 1}));
        System.out.println("19.2 Has Duplicates: " + hasDuplicates(new int[]{1, 1 , 2, 2, 3, 3, 4, 4}));
        System.out.println("19.3 Has Duplicates: " + hasDuplicates(new int[]{1, 2, 3, 4}));

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 3);
        map.put("b", 1);
        map.put("c", 2);
        System.out.println("20.1 Sort Map by Value: " + sortByValue(map));
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("a", 1);
        map2.put("b", 2);
        map2.put("c", 3);
        System.out.println("20.2 Sort Map by Value: " + sortByValue(map2));
        Map<String, Integer> map3 = new HashMap<>();
        map3.put("a", 3);
        map3.put("b", 2);
        map3.put("c", 2);
        System.out.println("20.3 Sort Map by Value: " + sortByValue(map3));
    }

    /**
     * Receive a string and return a reverse string
     * @param str a string
     * @return a string reversed
     */
    public static String reverseString(final String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Receive a string and return if a palindrome
     * @param str a string
     * @return true if is palindrome
     */
    public static boolean isPalindrome(final String str) {
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }

    /**
     * Receives an int that represent the number of times should interactive in the Fibonacci scale
     * @param n the number of times should interactive
     * @return a final result in the fibonacci scale
     */
    public static int fibonacciInteractive(final int n) {
        if (n <= 1) return n;
        int a = 0;
        int b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    /**
     * Receives number of times should calculate factorial
     * @param n the  number of times
     * @return return the factorial result
     */
    public static long factorial(final int n) {
        if (n == 0 || n == 1 ) return 1;
        return n * factorial(n - 1);
    }

    /**
     * Receives a number and verify if it is prime
     * @param n a number
     * @return true if it is prime
     */
    public static boolean isPrime(final int n) {
        if (n <= 1 ) return false;
        for (int i = 2; i <=  Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /**
     * Order an array using burble sort technic
     * @param arr array of int
     */
    public static void bubbleSort(final int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n -1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Receives an array of int and add only once a int in Set object.
     * @param arr an array of int
     * @return a not repeated list of int
     */
    public static Set<Integer> removeDuplicates(final int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);
        return set;
    }

    /**
     * Count how same chars have in the string
     * @param str a String
     * @return a Map with key a Char and value times repeated
     */
    public static Map<Character, Integer> countSameChars(final String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    /**
     * Returned the length of String
     * @param str a string
     * @return an int
     */
    public static int countChars(final String str) {
        return str.length();
    }

    /**
     * Calculates what are min and max in the array
     * @param arr an array of int
     * @return an int array with min/max
     */
    public static int[] findMinMax(final int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    /**
     * Compare if two string is a anagram.
     * @param s1 a string
     * @param s2 a string
     * @return true if they are anagram
     */
    public static boolean isAnagram(final String s1, final String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }

    /**
     * Need to receive an ordered array to search a target position
     * @param arr an int array
     * @param target that will return array postion
     * @return a position of target
     */
    public static int binarySearch(final int[] arr, final int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    /**
     * Sorted array before call method to search target.
     * @param arr an int array
     * @param target a value that will search
     * @return a position of target
     */
    public static int binarySearchUnorderArr(final int[] arr, final int target) {
        Arrays.sort(arr);
        return binarySearch(arr, target);
    }

    /**
     * Receives a number and print Fizz is multiple of 3
     * print Buzz is multiple of 5
     * print FizzBuzz are multiple of both
     * @param n a number (int)
     */
    public static void fizzBuzz(final int n) {
        for (int i = 1; i <= n; i ++) {
            System.out.print("12." + i +" FizzBuzz Result: ");
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    /**
     * Receives a sentence and return reversed.
     * @param sentence a sentence
     * @return a reversed sentence as a string
     */
    public static String reverseWords(final String sentence) {
        String[] words = sentence.split( " ");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    /**
     * Verify if two arrays are equal.
     * @param a an array
     * @param b other array
     * @return true if both are equal.
     */
    public static boolean arraysEqual(final int[] a, final int[] b) {
        return Arrays.equals(a, b);
    }

    /**
     * Receives a list and remove null elements and return the same list.
     * @param list a List
     * @return a list without null
     */
    public static List<String> removeNulls(final List<String> list) {
        list.removeIf(Objects::isNull);
        return list;
    }

    /**
     * Count a number of unique words appear in the text.
     * @param text a string
     * @return a number.
     */
    public static int countUniqueWords(final String text) {
        String[] words = text.toLowerCase().split("\\W+");
        return new HashSet<>(Arrays.asList(words)).size();
    }

    /**
     * Recives an int and return a binary in form of String.
     * @param n an int
     * @return a string
     */
    public static String toBinary(final int n) {
        return Integer.toBinaryString(n);
    }

    /**
     * Receives int and return a sum of all digits of the nnumber.
     * @param n an int
     * @return an int
     */
    public static int sumDigits(final int n) {
        int number = n;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    /**
     * Verify if it has duplicates element in a array.
     * @param arr an int array.
     * @return true if it has
     */
    public static boolean hasDuplicates(final int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if (!set.add(num)) return true;
        }
        return false;
    }

    /**
     * Orders a list by value from map.
     * @param map a map of key - String and value - int
     * @return an ordered map by value
     */
    public static  LinkedHashMap<String, Integer> sortByValue(final Map<String, Integer> map) {
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
    }
}
