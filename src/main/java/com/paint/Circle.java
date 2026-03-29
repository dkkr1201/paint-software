/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author 91941
 */
public class Circle extends Shape {
    private float radius;       // from diagram: - radius : float
    private int   centerX;      // from diagram: - center : unsigned int (x component)
    private int   centerY;      // from diagram: - center : unsigned int (y component)

    public Circle(float radius, int centerX, int centerY) {
        this.radius  = radius;
        this.centerX = centerX;
        this.centerY = centerY;
    }

    // Getters & Setters
    public float getRadius()             { return radius; }
    public void  setRadius(float radius) { this.radius = radius; }
    public int   getCenterX()            { return centerX; }
    public int   getCenterY()            { return centerY; }

    /** +setCenter() from diagram */
    public void setCenter(int x, int y) {
        this.centerX = x;
        this.centerY = y;
    }

    /** +area(in radius : float) : double from diagram */
    public double area(float r) {
        return Math.PI * r * r;
    }

    /** +circumference() from diagram */
    public double circumference() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Circle: center=(" + centerX + "," + centerY
                + "), radius=" + radius);
    }

    @Override
    public void erase() {
        System.out.println("Erasing Circle at center=(" + centerX + "," + centerY + ")");
    }

    @Override
    public void move(int x, int y) {
        setCenter(x, y);
        System.out.println("Moved Circle center to (" + x + "," + y + ")");
    }

    @Override
    public void resize(double factor) {
        this.radius = (float)(radius * factor);
        System.out.println("Circle resized. New radius=" + radius);
    }

    @Override
    public String toString() {
        return "Circle(center=(" + centerX + "," + centerY + "), radius=" + radius + ")";
    }
}

