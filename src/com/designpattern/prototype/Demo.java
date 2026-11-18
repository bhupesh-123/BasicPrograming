package com.designpattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle=new Circle();
        circle.x=10;
        circle.y=20;
        circle.color="Red";
        circle.radius=15;
        shapes.add(circle);

        Circle copyCircle= (Circle) circle.clone();
        shapesCopy.add(copyCircle);

        Rectangle rectangle=new Rectangle();
        rectangle.x=30;
        rectangle.y=40;
        rectangle.height=10;
        rectangle.width=20;
        rectangle.color="Blue";
        shapes.add(rectangle);

        Rectangle copyRectangle= (Rectangle) rectangle.clone();
        shapesCopy.add(copyRectangle);
        System.out.println("shapes: "+shapes);
        System.out.println("shapesCopy: "+shapesCopy);
        System.out.println("-------------------------------------------------------------");
        cloneAndCompare(shapes, shapesCopy);


    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
