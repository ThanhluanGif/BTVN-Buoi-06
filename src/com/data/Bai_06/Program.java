package com.data.Bai_06;

public class Program {
    public static void main(String[] args) {
        // Tạo Point thông thường
        Point p = new Point(3, 4);
        System.out.println("Điểm ban đầu: " + p);

        // Tạo MoveablePoint
        MoveablePoint mp = new MoveablePoint(3, 4, 1, 2);
        System.out.println("Trước khi di chuyển: " + mp);

        // Di chuyển
        mp.move();
        System.out.println("Sau khi di chuyển: " + mp);

        // Thay đổi tốc độ
        mp.setXSpeed(2);
        mp.setYSpeed(-1);
        mp.move();
        System.out.println("Di chuyển tiếp theo: " + mp);
    }
}
