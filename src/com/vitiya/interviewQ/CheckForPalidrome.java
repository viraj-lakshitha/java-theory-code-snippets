package com.vitiya.interviewQ;

public class CheckForPalidrome {

    public static void main(String[] args) {
//        System.out.println(checkPalindrom("Tenet"));

        if ("tenet" == "tenet") {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static boolean checkPalindrom(String str) {

        str = str.toLowerCase();

        if (str == reverseWord(str)) {
            return false;
        }
        return true;
    }

    public static String reverseWord(String str) {
        char[] letterStr = str.toLowerCase().toCharArray();
        String reverseStr = "";
        for (int i = letterStr.length-1; i >= 0; i--) {
            reverseStr = reverseStr+letterStr[i];
        }
        return reverseStr;
    }

}
