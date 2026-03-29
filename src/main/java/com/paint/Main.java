/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author 91941
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Paint Software Prototype ===\n");

        // DrawingContext (main window)
        DrawingContext dc = new DrawingContext("Main Drawing Canvas");
        dc.open();
        dc.setPoint(new Point(0, 0));
        System.out.println("Canvas size: " + dc.getHorizontalSize() + "x" + dc.getVerticalSize());

        // Circle
        Circle circle = new Circle(5.0f, 10, 10);
        circle.draw();
        System.out.println("Circle area (r=5): " + circle.area(5.0f));
        System.out.println("Circle circumference: " + circle.circumference());
        circle.move(20, 20);
        circle.resize(2.0);

        // Rectangle
        Rectangle rect = new Rectangle(new Point(0, 0), new Point(10, 5));
        rect.draw();
        System.out.println("Rectangle area: " + rect.area());
        rect.move(5, 5);

        // Polygon
        Polygon poly = new Polygon();
        poly.addVertex(new Point(0, 0));
        poly.addVertex(new Point(5, 0));
        poly.addVertex(new Point(2, 4));
        poly.draw();
        poly.resize(1.5);

        // DialogBox & DataController
        DialogBox dlg = new DialogBox("Save Dialog");
        dlg.open();
        DataController dc2 = new DataController();
        dc2.save(circle);
        dc2.save(rect);
        dlg.close();

        // Event handling
        Event evt = new Event("MouseClick");
        dc.handleEvent(evt);

        System.out.println("\n=== Done ===");
    }
}

