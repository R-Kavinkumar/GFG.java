package com.company;

import java.util.Scanner;

public class VOTE {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER YOR AGE: ");
        int age = sc.nextInt();
        if (age>=18) {
            System.out.println("HURREY! YOU ARE ELIGIBLE FOR VOTING");
        }
        else{
            System.out.println("OOPS! YOU ARE NOT ELIGGIBLE FOR VOTING");
        }
    }

}
