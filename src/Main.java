import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = "";
        int age = 0;
        double salary = 0.0;

        System.out.println("What's your name?");
        name = in.nextLine();
        System.out.println("Your name is: "+ name);

        System.out.println("How old are you?");
        age=in.nextInt();
        System.out.println("Your age is: "+ age);

        System.out.println("What is your salary?");
        salary = in.nextDouble();
        System.out.println("Your salary is: "+ salary);
    }
}