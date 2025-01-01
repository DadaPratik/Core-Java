package inheritance;

import objects.Rectangle;
import org.w3c.dom.css.Rect;

public class InheritanceTester {
    public static void main(String[] args) {
        // Person person = new Person();
       // Employee employee = new Employee();

        Square square = new Square();
        square.setLength(25);
        square.calculatePerimeter();
        //System.out.println(square.calculatePerimeter());

        Rectangle rectangle = new Rectangle();
        rectangle.print();

        square.print("square");





    }
}
