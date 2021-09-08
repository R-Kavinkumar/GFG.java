package com.company;
import java.util.Arrays;
import java.util.Scanner;

class threadA extends Thread{
    public void run(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to sort:");
        String a =sc.nextLine();
        char arr[]=new char[a.length()];
        for (int i=0;i<a.length();i++){
            arr[i]=a.charAt(i);
        }
        Arrays.sort(arr);
        System.out.println(arr);
}

}
class threadB extends Thread{
    public void run(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the charrecters to sort:");
        String a =sc.nextLine();
        char arr[]=new char[a.length()];
        for (int i=0;i<a.length();i++){
            arr[i]=a.charAt(i);
        }
        Arrays.sort(arr);
        System.out.println(arr);
    }
}
public class thread_ex {
    public static void main(String[] args){
        threadA obj1=new threadA();
        threadB obj2=new threadB();
        try{
            obj1.start();
            obj1.start();
        }
        catch (IllegalThreadStateException exception){
            System.out.println("sorry you can't start the same thread with same object more then once  :(");
        }
        finally {
            System.out.println(" \n HAPPY CODING :)");
        }
    }
}


