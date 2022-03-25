package com.promineotech;

// create a AsteriskLogger class that implements the Logger interface
public class AsteriskLogger implements Logger {

    @Override
    public void log(String log) {
//        the log method should print out the String it receives between 3 asterisks on either side of the String
        System.out.println("***" + log + "***");
    }

    @Override
    public void error(String error) {
//        the error method should print the String it receives inside a box of asterisks, preceded by the word "Error:"
        System.out.println(boxStars(error));
        System.out.println("***ERROR: " + error + "***");
        System.out.println(boxStars(error));
//        prints out extra line above and below `***ERROR: boogie oogie oogie***`
//        System.out.println(boxStars(error));
//        System.out.println("\n***ERROR: " + error + "***\n");
//        System.out.println(boxStars(error));
    }

    public static String boxStars(String string) {
        int num = string.length() + 13;
        return "*".repeat(Math.max(0, num));
    }

}
