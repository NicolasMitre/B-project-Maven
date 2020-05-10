package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        System.out.println(isPalindrome("144212441"));
    }

    public static Boolean isPalindrome(String word) {
        String str = word.toLowerCase().replace(" ", "");
        return str.equalsIgnoreCase(new StringBuffer(word).reverse().toString());
    }
}
