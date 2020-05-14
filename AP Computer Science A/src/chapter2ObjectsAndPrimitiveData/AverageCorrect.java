package chapter2ObjectsAndPrimitiveData;
import java.util.*;
import java.io.*;

public class AverageCorrect {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int num = reader.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = reader.nextInt();
        System.out.print("Enter 3rd Final Number: ");
        int num3 = reader.nextInt();
        double total = (num + num2 + num3);
        double average = (total / 3);
        System.out.print("The Incorrect Average is " + average);
    }

}
