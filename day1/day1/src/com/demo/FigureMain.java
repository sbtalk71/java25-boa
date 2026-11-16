package com.demo;



public class FigureMain {

  public static void main(String[] args) {

      Triangle t= new Triangle(10,20);
      Rectangle r= new Rectangle(10,10);

      Figure figure=t;

    double result1= figure.area();

    figure=r;

    double result2=figure.area();

    showArea(t);
    showArea(r);
    }


    public static void showArea(Figure f){
        System.out.println(" The area : "+f.area());
    }
}
