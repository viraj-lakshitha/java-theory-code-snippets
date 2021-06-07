package com.vitiya.interviewQ;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {
//        System.out.println(removeWhiteSpace("Hello World"));

        String str = " Hello World \t";
        str = str.trim(); // Remove heading and trailing spaces and \t
        System.out.println(str);
    }

    public static String removeWhiteSpace(String str) {
        char[] letterChar = str.toCharArray();
        String output = "";
        for (char c : letterChar) {
            if (!Character.isWhitespace(c)) {
                output = output+c;
            }
        }
        return output;
    }

}
