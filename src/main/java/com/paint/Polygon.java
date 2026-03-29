/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.paint;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 91941
 */




/**
 * Polygon shape defined by a list of Points.
 */
public class Polygon extends Shape {
    private List<Point> vertices;

    public Polygon() {
        this.vertices = new ArrayList<>();
    }

    public void addVertex(Point p) { vertices.add(p); }
    public List<Point> getVertices() { return vertices; }
    public int getVertexCount() { return vertices.size(); }

    @Override
    public void draw() {
        System.out.println("Drawing Polygon with " + vertices.size() + " vertices: " + vertices);
    }

    @Override
    public void erase() {
        System.out.println("Erasing Polygon");
    }

    @Override
    public void move(int x, int y) {
        if (vertices.isEmpty()) return;
        int dx = x - vertices.get(0).getX();
        int dy = y - vertices.get(0).getY();
        for (Point p : vertices) {
            p.setX(p.getX() + dx);
            p.setY(p.getY() + dy);
        }
        System.out.println("Polygon moved.");
    }

    @Override
    public void resize(double factor) {
        for (Point p : vertices) {
            p.setX((int)(p.getX() * factor));
            p.setY((int)(p.getY() * factor));
        }
        System.out.println("Polygon resized by factor " + factor);
    }
}

