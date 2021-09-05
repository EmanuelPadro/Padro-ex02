package Package1;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 first_name last_name
 */


import java.util.Scanner;

/* My plan for this exercise is to prompt user for input
will then put that string in avariable
will
and finally print the number of characters as output
*/
public class Solution02 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("What is the Input String? ");
        //evaluate section
        String word = Input.next();
        int length = word.length();

        System.out.println(word + " has " + length + " characters.");

    }
}
