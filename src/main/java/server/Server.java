package main.java.server;

import main.java.server.myExceptions.HundredException;
import main.java.server.myExceptions.NullException;
import main.java.server.myExceptions.NonPairException;
import main.java.server.myExceptions.PalindromeException;

public class Server {

    public void retrieveString(String str) throws PalindromeException {
        isPalindrome(str);
    }

    public void retrieveInt(int num) throws NonPairException, HundredException {
        if (num <= 100) {
            if (num % 2 == 0) {
                System.out.println("Its pair number");
            } else {
                throw new NonPairException("Sorry, its not a pair number");
            }
        } else {
            throw new HundredException("Error, number is more then 100");
        }
    }


    public void retrieveObject(Object o) throws NullException {
        if (o == null) {
            throw new NullException("Object is empty");
        } else {
            System.out.println("It's ok");
        }
    }


    private void isPalindrome(String str) throws PalindromeException {
        int n = str.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (str.charAt(i) != str.charAt(n - i - 1)) {
                throw new PalindromeException("Error. Incorrect word");
            }
        }
        System.out.println("Its palindrome");

    }

}

//retrieveString
//retrieveInt
//retrieveObject
