package com.data.Bai_4;

public class TestBook {
    public static void main(String[] args) {
        // Tạo đối tượng Book
        Book myBook = new Book("Dế Mèn Phiêu Lưu Ký", "Tô Hoài", 75000);

        // In thông tin sách
        System.out.println("Tên sách: " + myBook.getTitle());
        System.out.println("Tác giả: " + myBook.getAuthor());
        System.out.println("Giá: " + myBook.getPrice() + " VND");

        // Thử cập nhật giá hợp lệ
        myBook.setPrice(82000);
        System.out.println("Giá mới: " + myBook.getPrice() + " VND");

        // Thử cập nhật giá không hợp lệ
        myBook.setPrice(-5000);  // Sẽ in ra lỗi và không cập nhật
    }
}
