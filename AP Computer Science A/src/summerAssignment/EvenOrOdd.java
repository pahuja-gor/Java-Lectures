package summerAssignment;
import java.io.*;
import java.util.*;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = reader.nextInt();
        if (num % 2 == 0) {
            System.out.println("The integer " + num + " is even.");
        } else {
            System.out.println("The integer " + num + " is odd.");
        }
    }
}