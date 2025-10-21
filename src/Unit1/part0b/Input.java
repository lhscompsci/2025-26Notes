package Unit1.part0b;


import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = kb.nextLine();
        //String name = kb.next();

        System.out.println("Enter your age: ");
        int age = kb.nextInt();
        System.out.println("Enter your average:  ");
        double average = kb.nextDouble();
        System.out.println("Enter your height: ");
        double height = kb.nextDouble();
        //clear out the input buffer
        kb.nextLine();
        System.out.println("Where are you from?");
        String from = kb.nextLine();

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your average: " + average);
        System.out.println("Your height: " + height);
        System.out.println("You're from: " + from);

    }

}
