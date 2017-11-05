package pl.sdacademy.java7krkr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wpisz liczbe calkowita z ktorej zbuduje schody");
        int flors = scanner.nextInt();

        for (int i = 0; i < flors; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.printf("# ");
            }
            System.out.println();
        }
    }
}
