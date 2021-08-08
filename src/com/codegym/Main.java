package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int height;
                    int width;
                    Scanner sc = new Scanner(System.in);

                    System.out.print("height = ");
                    height = sc.nextInt();
                    System.out.print("width = ");
                    width = sc.nextInt();

                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int hight;
                    System.out.println("Nhập vào chiều cao của tam giác: ");
                    Scanner sc1 = new Scanner(System.in);
                    hight = sc1.nextInt();

                    System.out.println("Hinh 1");
                    for (int i = 1; i <= hight; ++i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\n\nHinh 2");
                    for (int i = hight; i >= 1; --i) {
                        for (int j = 1; j <= i; ++j) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                case 3:
                    int hight1;
                    System.out.println("Nhập vào chiều cao của tam giác: ");
                    Scanner sc2 = new Scanner(System.in);
                    hight1 = sc2.nextInt();

                    int k = 0;
                    for (int i = 1; i <= hight1; i++, k = 0) {
                        for (int space = 1; space <= hight1 - i; space++) {
                            System.out.print("  ");
                        }
                        while (k != 2 * i - 1) {
                            System.out.print("* ");
                            k++;
                        }
                        System.out.println();
                    }
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice!");

            }
        }

    }
}