package summerAssignment;
import java.util.*;
import java.io.*;

public class WeightOnOtherPlanets {
    public static void main(String[] args) {
        String choosePlanet;

        Scanner reader = new Scanner(System.in);
        System.out.print("What is your weight on Earth? ");
        double weight = reader.nextDouble();
        System.out.println("1. Voltar");
        System.out.println("2. Krypton");
        System.out.println("3. Fertos");
        System.out.println("4. Servontos");
        System.out.print("Selection? ");
        int planet = reader.nextInt();

        switch (planet) {
            case 1:
                choosePlanet = "Voltar";
                weight = weight * 0.091;
//                System.out.println("Your weight on Voltar would be " + weight);
                break;
            case 2:
                choosePlanet = "Krypton";
                weight = weight * 0.720;
//                System.out.println("Your weight on Krypton would be " + weight);
                break;
            case 3:
                choosePlanet = "Fertos";
                weight = weight * 0.865;
//                System.out.println("Your weight on Ferton would be " + weight);
                break;
            case 4:
                choosePlanet = "Servontos";
                weight = weight * 4.612;
//                System.out.println("Your weight on Servontos would be " + weight);
                break;
            default:
                choosePlanet = "Invalid Planet";
                break;
        }
        System.out.println("Your weight on " + choosePlanet + " would be " + weight);
    }
}