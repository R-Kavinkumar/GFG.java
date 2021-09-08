package com.company;

class Shape{
    public void print_shape(){
        System.out.println("This is shape");
    }
}

// Rectangle class is subclass of Shape class
class Rectangle extends Shape{
    public void print_rect(){
        System.out.println("This is rectangular shape");
    }
}

// Circle class is subclass of Shape class
class Circle extends Shape{
    public void print_circle(){
        System.out.println("This is circular shape");
    }
}

// Square class is subclass of Rectangle class
class Square extends Rectangle{
    public void print_square(){
        System.out.println("Square is a rectangle");
    }
}

class Test{
    public static void main(String[] args){
        Square sq = new Square();
        sq.print_shape();
        sq.print_rect();
    }
}