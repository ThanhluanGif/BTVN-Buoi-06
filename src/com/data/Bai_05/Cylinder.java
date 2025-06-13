package com.data.Bai_05;

public class Cylinder extends Circle{
    // Thuộc tính private
    private double height;

    // Constructor
    public Cylinder(double radius, double height) {
        super(radius); // gọi constructor lớp cha
        setHeight(height);
    }

    // Getter
    public double getHeight() {
        return height;
    }

    // Setter có kiểm tra hợp lệ
    public void setHeight(double height) {
        if (height >= 0) {
            this.height = height;
        } else {
            System.out.println("Lỗi: Chiều cao không được âm!");
        }
    }

    // Phương thức tính thể tích
    public double getVolume() {
        return getArea() * height; // dùng getArea() kế thừa từ Circle
    }
}
