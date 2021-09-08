package com.company;
import java.util.Scanner;

class Intrest {
    double ammount;
    int year,rate;
     Scanner sc=new Scanner(System.in);
     void read(){
        System.out.println("ENTER THE AMMOUNT: ");
        ammount=sc.nextDouble();
        System.out.println("ENTER THE YEAR: ");
        year=sc.nextInt();
        System.out.println("ENTER THE RATE OF INTREST: ");
        rate=sc.nextInt();
    }
    double simple_intrest(){
        double si=ammount*year*rate/100;
        return si;
    }
    double compound_intrest(){
        double ci=(ammount * Math.pow(1.0 + rate / 100.0, year) - ammount);
        return ci;
    }

}


public class InterestCalculation {
    public static void main(String[] args){
        Intrest obj= new Intrest();
        obj.read();
        System.out.println("THE COMPUND INTREST IS :"+obj.compound_intrest());
        System.out.println("THE SIMPLE INTRREST IS: "+obj.simple_intrest());
    }
}
