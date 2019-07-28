package main.java.server;

import main.java.server.myExceptions.HundredException;
import main.java.server.myExceptions.NullException;
import main.java.server.myExceptions.NonPairException;
import main.java.server.myExceptions.PalindromeException;

public class Main  {
    public static void main(String[] args) {
        Server server = new Server();
        String str = "nagan";
        int number = 101;
        Object obj = server;

        try {
            server.retrieveString(str);
        } catch (PalindromeException e) {
            System.err.println(e.getMessage());
        }


        try {
            server.retrieveInt(number);
        } catch (NonPairException | HundredException e) {
            System.err.println(e.getMessage());
        }

        try {
            server.retrieveObject(obj);
        } catch (NullException e) {
            System.err.println(e.getMessage());
        }
    }
}
