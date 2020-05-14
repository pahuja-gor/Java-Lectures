package summerAssignment;
import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class RadiusOfCircle {
    public static void main(String[] args) {
        //area = pi * r^2
        //r = sqrt(area/pi)
        Scanner reader = new Scanner(System.in);
        System.out.print("What is the area? ");
        double area = reader.nextDouble();
        System.out.println("The Radius of the Circle is " + (sqrt(area / PI)));
    }
}