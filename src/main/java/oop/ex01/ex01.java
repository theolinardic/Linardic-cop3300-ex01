package oop.ex01;
import java.util.Scanner;

public class ex01 {

    public static void main(String[] args)
    {
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String userName = userInputScanner.nextLine();

        String finalOutput = "Hello, " + userName + ", nice to meet you!";

        System.out.print(finalOutput);

    }

}
