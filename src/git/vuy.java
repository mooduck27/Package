package git;

import java.util.Scanner;

public class vuy
{
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.println("Simple Calcultor!");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);

        System.out.print("Type num_1: ");
        int num_1 = sc.nextInt();

        System.out.print("Type num_2: ");
        int num_2 = sc.nextInt();

        int sum = num_1 + num_2;
        int min = num_1 - num_2;
        int umn = num_1 * num_2;
        int del = num_1 / num_2;

        System.out.println(num_1 + " + " + num_2 + " = " + sum);
        System.out.println(num_1 + " - " + num_2 + " = " + min);
        System.out.println(num_1 + " * " + num_2 + " = " + umn);
        System.out.println(num_1 + " / " + num_2 + " = " + del);
    }
}
