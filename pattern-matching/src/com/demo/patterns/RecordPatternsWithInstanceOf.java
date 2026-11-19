package com.demo.patterns;

import com.demo.patterns.records.ColouredPoint;
import com.demo.patterns.records.Point;

public class RecordPatternsWithInstanceOf {
    static void main() {

        Point p = new Point(15,20);

        ColouredPoint cp= new ColouredPoint(p,"red");

        if(p instanceof Point(int x, int y) && x>10){
            System.out.println("Point : X="+x+" and Y="+y);
        }

        //with var
        if(p instanceof Point(var x, var y) && x>10){
            System.out.println("Point : X="+x+" and Y="+y);
        }

        if(cp instanceof ColouredPoint(Point(var x, var y), String colour)){
            System.out.println("Point : X="+x+" and Y="+y+ " with color "+ colour);
        }
    }
}
