/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author 91941
 */

public class DrawingContext extends Window {
    private Point currentPoint;
    private int verticalSize   = 600;
    private int horizontalSize = 800;

    public DrawingContext(String title) { super(title); }

    public void setPoint(Point p)   { this.currentPoint = p; }
    public Point getPoint()         { return currentPoint; }
    public void clearScreen()       { System.out.println("Screen cleared."); }
    public int getVerticalSize()    { return verticalSize; }
    public int getHorizontalSize()  { return horizontalSize; }
}
