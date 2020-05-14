package summerAssignment;
import java.util.*;
import java.io.*;

public class NameReversal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter your name. ");
        String s = reader.nextLine();
        int size = s.length();
        System.out.println("The Length of this String is " + size);

        String reverse = "";
        for (int x = size - 1; (x >= 0) && (size >= 0); x -= 1) {
            reverse += s.substring(x, size);
            size--;
        }
        String lowercase = reverse.toLowerCase();
        System.out.println(lowercase);
    }
}