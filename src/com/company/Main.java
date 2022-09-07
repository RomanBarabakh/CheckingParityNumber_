package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введіть число:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n % 2 == 0 && n >= 1) {
            System.out.println("Число " + n + " парне");
        }
        else if (n % 1 == 0 && n >= 1){
            System.out.println("Число " + n + " не парне");
        }
        else {
            System.out.println("введіть додатнє значення");
        }
    }
}
