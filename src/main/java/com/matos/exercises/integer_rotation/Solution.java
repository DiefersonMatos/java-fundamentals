package com.matos.exercises.integer_rotation;

public class Solution {

    public static boolean isRotation(int A, int B) {
        String aStr = String.valueOf(A);
        String bStr = String.valueOf(B);
        System.out.println("a: " + aStr + "length: " + aStr.length());
        System.out.println("b: " + bStr + "length: " + bStr.length());

        if (aStr.length() != bStr.length()) {
            return false;
        }

        System.out.println();
        String doubled = aStr + aStr;

        System.out.println("doubled: " + doubled + " b: " + bStr);
        return doubled.contains(bStr);
    }

    public static void main(String[] args) {
        System.out.println(isRotation(1234, 3412)); // true
        System.out.println(isRotation(1234, 4123)); // true
        System.out.println(isRotation(1234, 4321)); // false
        System.out.println(isRotation(1234, 123));  // false
    }
}
