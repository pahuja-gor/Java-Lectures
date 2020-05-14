package summerAssignment;
import java.util.*;
import java.io.*;

public class Square {
    //    Write a program that will prompt the user to enter an integer. The program should square the number and then print the squared number.
//    Repeat this process until 0 is entered as input. Use a do-while-loop to do this.
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        do {
            System.out.print("Enter an Integer: ");
            num = reader.nextInt();
            num = num * num;
            System.out.println("The Result is " + num);
        } while (num != 0);
    }
}