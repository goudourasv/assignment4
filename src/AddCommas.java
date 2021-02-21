///*
// * File: AddComas.java
// * ------------------
// * This program implements section assignment AddComas in lecture 13
// */
//
//import acm.program.*;
//import acm.util.*;
//
//import java.awt.*;
//import java.util.StringTokenizer;
//
//public class AddCommas extends ConsoleProgram {
//
//    public void run() {
//        while (true) {
//            String digits = readLine("Enter a number: ");
//            if (digits.length() == 0) break;
//            println(addCommasToNumericString(digits));
//        }
//    }
//
//    private String addCommasToNumericString(String str) {
//        String result = "";
//        if (str.length() <= 3) {
//            return str;
//        }
//        for (int i = str.length()-1; i>=0; i--) {
//            char ch =  str.charAt(i);
//            result =ch + result;
//            if (result.length() % 3 == 0){
//                result = "," +result;
//            }
//        }
//        return result;
//    }
//}
//
//
//
