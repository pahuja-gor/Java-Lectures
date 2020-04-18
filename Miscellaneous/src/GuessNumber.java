import java.util.Random;

public class GuessNumber {

    static Random random = new Random();

    public int generation = 1;

    public static void randomGuessing() {

        boolean isRandom = true;

        int randomVal = random.nextInt(99) + 1;
        int randomVal2 = random.nextInt(99) + 1;
        int randomVal3 = random.nextInt(99) + 1;

        String number = String.valueOf(randomVal + randomVal2 + randomVal3);

        while (isRandom) {

            int randomVal4 = random.nextInt(99) + 1;
            int randomVal5 = random.nextInt(99) + 1;
            int randomVal6 = random.nextInt(99) + 1;

            String number2 = String.valueOf(randomVal4 + randomVal5 + randomVal6);

//            try {
//                System.setOut(new PrintStream(new FileOutputStream("output.txt")));
//                System.out.println(ANSI_PURPLE + "The RANDOM NUMBER is: " + randomVal + randomVal2 + randomVal3 + ANSI_RESET);
//                System.out.flush();
//                System.out.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//            System.out.println("The RANDOM NUMBER is: " + randomVal + randomVal2 + randomVal3);
            System.out.println("The RANDOM NUMBER is: " + number2);

 if (randomVal == randomVal4) {
     randomVal = randomVal4;
     if (randomVal2 == randomVal5) {
         randomVal2 = randomVal5;
         if (randomVal3 == randomVal6) {
             randomVal3 = randomVal6;
         }
     }
 }
        }
    }

    public static void main(String[] args) {
        randomGuessing();
    }

}
