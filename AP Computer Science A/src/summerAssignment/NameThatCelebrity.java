package summerAssignment;
public class NameThatCelebrity {
    public static void main(String[] args) {
        //Allan Alda >>> lan A
        String s1 = "Allan Alda";
        int firstLength = s1.length();
//        System.out.println("The length of String 1 is " + firstLength);
        String sub1 = s1.substring(2, 5);
        String sub2 = s1.substring(5, 7);
        System.out.println(s1 + ">>>" + sub1 + sub2);

        //John Wayne >>> hn Wa
        String s2 = "John Wayne";
        int secondLength = s2.length();
//        System.out.println("The length of String 2 is " + secondLength);
        String sub3 = s2.substring(2, 4);
        String sub4 = s2.substring(5, 7);
        System.out.println(s2 + ">>>" + sub3 + " " + sub4);

        //Gregory Peck >>> egory P
        String s3 = "Gregory Peck";
        int thirdLength = s3.length();
//        System.out.println("The length of String 3 is " + thirdLength);
        String sub5 = s3.substring(2, 8);
        String sub6 = s3.substring(8, 9);
        System.out.println(s3 + ">>>" + sub5 + sub6);
    }
}