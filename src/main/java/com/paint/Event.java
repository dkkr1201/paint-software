/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;

/**
 *
 * @author 91941
 */

public class Event {
    private String type;
    public Event(String type) { this.type = type; }
    public String getType()   { return type; }
    @Override
    public String toString()  { return "Event(" + type + ")"; }
}
