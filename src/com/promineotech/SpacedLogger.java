package com.promineotech;

// create a SpacedLogger class that implements the Logger interface
public class SpacedLogger implements Logger {

//  the SpacedLogger adds spaces between each character of the String argument passed into its methods
//  if the log method received "Hello" as an argument, it should print H e l l o
    @Override
    public void log(String log) {
        System.out.println(addSpaces(log));
    }

    public static String addSpaces(String string) {
        String spaces = " ";
        int num = string.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append(string.charAt(i)).append(spaces);
        }
        return sb.toString().trim();
    }

//    the error method should also add spaces but with "ERROR:" preceding the spaced out input
    @Override
    public void error(String error) {
        System.out.println("ERROR: " + addSpaces(error));
    }

}
