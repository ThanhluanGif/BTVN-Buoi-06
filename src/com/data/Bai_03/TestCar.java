package com.data.Bai_03;

public class TestCar {
    public static void main(String[] args) {
        // Khởi tạo đối tượng Car
        Car myCar = new Car("Toyota", "Corolla", 2020);

        // Hiển thị thông tin xe
        System.out.println("Xe của bạn là: " + myCar.getMake() + " " + myCar.getModel() + ", sản xuất năm " + myCar.getYear());

        // Cập nhật thông tin hợp lệ
        myCar.setYear(2023);
        System.out.println("Năm sản xuất mới: " + myCar.getYear());

        // Cập nhật thông tin không hợp lệ
        myCar.setYear(2035);  // Giả sử hiện tại là 2025 → sẽ báo lỗi
    }
}
