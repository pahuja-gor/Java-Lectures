//import statements go here...

import java.util.*;

public class test {

//    public void dosomething (int n) {
//        if (n > 0) {
//            dosomething(n - 1);
//            System.out.print(n);
//        }
//    }

    public static void main(String[] args) {
//        /*String tester = "Hello World!";
//        String equal = "Hello World!";
//        String notEqual = "Hello World";
//        String updated = tester.replace("!", "?");
//
//        for (int x = 0; x < tester.length(); x ++) {
//            System.out.println(x + ": " + tester.charAt(x));
//        }
//        System.out.println("\n");
//        System.out.println(tester.length());
//        System.out.println(tester.substring(6));
//        System.out.println(tester.substring(0, 5));
//        System.out.println(tester.contains("ell"));
//        System.out.println(tester.equals(notEqual));
//        System.out.println(tester.equals(equal));
//        System.out.println(tester.equals(updated));*/
//
//        int[] integerArray = new int[10];
//        int randomNum;
//        for (int x = 1; x <= 10; x ++) {
//            randomNum = (int) Math.random() * 10 + 1;
//            integerArray[x - 1] = randomNum;
//        }
//        System.out.println(integerArray[0]);
//        System.out.println(integerArray[1]);
//        System.out.println(integerArray[2]);
//        System.out.println(integerArray[3]);
//        System.out.println(integerArray[4]);
//        System.out.println(integerArray[5]);
//        System.out.println(integerArray[6]);
//        System.out.println(integerArray[7]);
//        System.out.println(integerArray[8]);
//        System.out.println(integerArray[9]);
//        boolean x = false;
//        boolean y = true;
//        boolean z = true;
//
//        System.out.println( (!x && y) || (x || !z) );
//
//        int[] nums = {0, 1, 2, 3, 4};
//        for (int number : nums)
//        {
//            System.out.print(number + " ");
//            System.out.println(number < 3 ? "is less than 3." : "is more than 3.");
//        }
//        String date = "April 1, 2001";
//        String[] mY = date.split(",");
//        String[] mD = mY[0].split(" ");
//        String[] monthDayYear = new String[3];
//        monthDayYear[0] = mD[0];
//        monthDayYear[1] = mD[1];
//        monthDayYear[2] = mY[1];
//        System.out.println(monthDayYear[0]);
//        System.out.println(monthDayYear[1]);
//        System.out.println(monthDayYear[2].strip());
//        int[] days = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(days.length);
//        ArrayList<Integer> listOfInts = new ArrayList<Integer>(10);
//        //System.out.println(listOfInts.size());
//        listOfInts.add(0);
//        listOfInts.add(1);
//        listOfInts.add(2);
//        listOfInts.add(3);
//        listOfInts.add(4);
//        //listOfInts.trimToSize();
//        //System.out.println(listOfInts.size());
//        System.out.println(listOfInts);
//        for (int x = 0; x < listOfInts.size(); x ++) {
//            listOfInts.set(x, listOfInts.get(x) + 1) ;
//        }
//        System.out.println(listOfInts);

//        HashMap<Integer, String> integerStringHashMap = new HashMap<Integer, String>();
//        integerStringHashMap.put(0, "Zero");
//        integerStringHashMap.put(1, "One");
//        integerStringHashMap.put(2, "Two");
//        integerStringHashMap.remove(1);
//        if (integerStringHashMap.containsKey(0)) {
//            System.out.println("Key Found!");
//        }
//        if (!integerStringHashMap.containsKey(1)) {
//            System.out.println("Key Not Found!");
//        }
//        System.out.println(integerStringHashMap);
//    }
//        int[][] int2 = new int[2][2];
//        int2[0][0] = 0;
//        int2[0][1] = 1;
//        //int2[0][2] = 2;
//        int2[1][0] = 3;
//        int2[1][1] = 4;
//        //int2[1][2] = 5;
//        i//nt2[2][0] = 6;
//        //int2[2][1] = 7;
//        //int2[2][2] = 8;
//        System.out.println(int2[0][0]);
        // Scanner userInput = new Scanner(System.in);
        //String name = userInput.next();
        //System.out.println("Hey " + name);
//        Scanner textInput = new Scanner("2 Varun!");
//        int hey = textInput.nextInt();
//        System.out.println(hey);

//        String hW = "HelloWorld!";
//        String hello = hW.substring(0, 5);
//        System.out.println(hello);
//        String world = hW.substring(5, hW.length());
//        System.out.println(world);
//        String str = "kitten";
//
//        //String twoChar = str.charAt(0) + str.charAt(1);
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(str.charAt(0)).append(str.charAt(1));
//        System.out.println(stringBuilder + str + stringBuilder);
//        ArrayList<String> names = new ArrayList<>();
//        names.add("joe");
//        names.add("nick");
//        names.add("jim");
//        System.out.println(names);
//        names.remove("nick");
//        System.out.println(names);

        shapeNameColor("red circle");
        shapeNameColor("blue square");
//        shapeNameColor("red dog");
        shapeNameColor("dog circle");
    }

    private static void shapeNameColor(String input) {
        if (!input.contains("red") && !input.contains("blue")) {
            throw new IllegalArgumentException(
                    "input doesn't contain the correct color for the shape");
        }

        if (!input.contains("circle") && !input.contains("square")) {
            throw new IllegalArgumentException(
                    "input doesn't contain the correct type of shape");
        }
        System.out.println("Correct");
    }
}