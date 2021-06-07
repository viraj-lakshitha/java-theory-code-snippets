package com.vitiya.interviewQ;

public class CheckVowels {

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(findVowels(str));
    }

    private static boolean findVowels(String str) {
        if (str.toLowerCase().matches(".*[aeiou].*")) { // Using Regex
            return true;
        } else {
            return false;
        }
    }

}
