package com.company.lesson10.magaz.dostup;

import java.util.Scanner;

public class vvodParol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your login and password please:");
        String login = in.nextLine();
        String password = in.nextLine();
        System.out.printf("Hello:" + login + password);
    }
}
