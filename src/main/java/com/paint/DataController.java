/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author 91941
 */

public class DataController {
    public void save(Shape s) {
        System.out.println("Saving shape: " + s.getClass().getSimpleName());
    }
    public void load() {
        System.out.println("Loading shapes from data store.");
    }
}
