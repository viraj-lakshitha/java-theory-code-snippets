package com.vitiya.interviewQ;

/*

Pseudocode
1. Convert String into char[] array
2. Apply 'for' loop to the array and print elements in reverse order

*/

public class ReverseString {

    public static void main(String[] args) {
        String str = "viraj";

        char[] letterStr = str.toCharArray();
        System.out.println(letterStr);

        for (int i = letterStr.length-1; i >= 0; i--) {
            System.out.print(letterStr[i]);
        }
    }

}
