package summerAssignment;
import java.io.*;
import java.util.*;

public class WhatIsMyName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("What is your first name? ");
        String firstName = reader.nextLine();
        System.out.print("What is your last name? ");
        String lastName = reader.nextLine();
        System.out.print("Your full name is " + firstName + " " + lastName + ".");
    }
}