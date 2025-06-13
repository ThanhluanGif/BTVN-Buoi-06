package com.data.Bai_05;

public class Circle {
    // Thuộc tính private
    private double radius;

    // Hằng số PI
    public static final double PI = Math.PI;

    // Constructor
    public Circle(double radius) {
        setRadius(radius);
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter có kiểm tra hợp lệ
    public void setRadius(double radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            System.out.println("Lỗi: Bán kính không được âm!");
        }
    }

    // Phương thức tính diện tích
    public double getArea() {
        return PI * radius * radius;
    }
}
