mport java.util.*;
import java.io.*;
public class ques_5{
public static void main(String args[])
        {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(95);
        stack.push(45);
        stack.push(35);
        stack.push(29);
        stack.push(50);
        stack.push(11);
        stack.push(15);
        stack.push(33);
        stack.push(20);
        stack.push(10);
        System.out.println("Initial Stack: " + stack);
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop operation " + stack);
        }
        }