package com.data.Bai_05;

public class Program {
    public static void main(String[] args) {
        // Tạo đối tượng hình tròn
        Circle circle = new Circle(5.0);
        System.out.println("Diện tích hình tròn: " + circle.getArea());

        // Tạo đối tượng hình trụ
        Cylinder cylinder = new Cylinder(5.0, 10.0);
        System.out.println("Thể tích hình trụ: " + cylinder.getVolume());

        // Thử thay đổi bán kính và chiều cao
        cylinder.setRadius(7.5);
        cylinder.setHeight(12.0);
        System.out.println("Thể tích mới của hình trụ: " + cylinder.getVolume());
    }
}
