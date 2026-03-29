/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author 91941
 */
public abstract class Shape {
    public abstract void draw();
    public abstract void erase();
    public abstract void move(int x, int y);
    public abstract void resize(double factor);
}
