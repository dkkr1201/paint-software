/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author 91941
 */
public class Rectangle extends Shape {
    private Point topLeft;
    private Point bottomRight;

    public Rectangle(Point topLeft, Point bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    public double getWidth()  { return Math.abs(bottomRight.getX() - topLeft.getX()); }
    public double getHeight() { return Math.abs(bottomRight.getY() - topLeft.getY()); }
    public double area()      { return getWidth() * getHeight(); }
    public double perimeter() { return 2 * (getWidth() + getHeight()); }

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle: topLeft=" + topLeft + ", bottomRight=" + bottomRight);
    }

    @Override
    public void erase() {
        System.out.println("Erasing Rectangle");
    }

    @Override
    public void move(int x, int y) {
        int dx = x - topLeft.getX();
        int dy = y - topLeft.getY();
        topLeft.setX(x); topLeft.setY(y);
        bottomRight.setX(bottomRight.getX() + dx);
        bottomRight.setY(bottomRight.getY() + dy);
        System.out.println("Moved Rectangle. New topLeft=" + topLeft);
    }

    @Override
    public void resize(double factor) {
        int newW = (int)(getWidth() * factor);
        int newH = (int)(getHeight() * factor);
        bottomRight.setX(topLeft.getX() + newW);
        bottomRight.setY(topLeft.getY() + newH);
        System.out.println("Rectangle resized to " + newW + "x" + newH);
    }
}

