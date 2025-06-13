package com.data.Bai_06;

public class Point {
    private double x;
    private double y;

    // Constructor không tham số
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor có tham số
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getter và Setter
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
