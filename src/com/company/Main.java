package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	//Variables
        String userStringInput = "";
        int stringLengthReturn = 0;
        char lastCharacter;

    //Block 1: Requesting UI
        System.out.println("Please enter a string:");
        userStringInput = input.nextLine();

    //Block 2: Code to return length and last character of UI string.
        stringLengthReturn = userStringInput.length();
        System.out.println(stringLengthReturn);
        //Had an issue with charAt because the index was out of bounds.
        //The initial code was: userStringInput.charAt(stringLengthReturn);
        //Got - 1 from charAt document. Says index needs to be less than the length of this string.
        lastCharacter = userStringInput.charAt(stringLengthReturn - 1);

    //Block 3: Result
        System.out.println("The length of your string is " + stringLengthReturn + ", including " +
                "whitespaces. The final character of the string is: " + lastCharacter);

    }
}
