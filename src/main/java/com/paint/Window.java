/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author 91941
 */

public abstract class Window {
    protected String title;
    protected int x, y;

    public Window(String title) { this.title = title; }

    public void open()  { System.out.println(title + " opened."); }
    public void close() { System.out.println(title + " closed."); }
    public void move(int x, int y) {
        this.x = x; this.y = y;
        System.out.println(title + " moved to (" + x + "," + y + ")");
    }
    public void display() { System.out.println("Displaying: " + title); }
    public void handleEvent(Event e) {
        System.out.println(title + " handling event: " + e.getType());
    }
}
