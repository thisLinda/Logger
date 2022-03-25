package com.promineotech;

import java.util.List;

// create a class named App that has a main method
public class App {

    public static void main(String[] args) {

//        instantiate an instance of each of your logger classes that implement the Logger interface
//        test both methods on both instances passing in Strings of your choice
        Logger Asterisk = new AsteriskLogger();
        Asterisk.log("boogie oogie oogie");
        Asterisk.error("boogie oogie oogie");

        Logger Spaced = new SpacedLogger();
        Spaced.log("WXPN");
        Spaced.error("WXPN");
    }

}
