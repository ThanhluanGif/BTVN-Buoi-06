package com.data.Bai_03;

public class Car {
    // Các thuộc tính private
    private String make;
    private String model;
    private int year;

    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        setYear(year); // dùng setter để kiểm tra hợp lệ
    }

    // Getter và Setter cho make
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    // Getter và Setter cho model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter và Setter cho year, có kiểm tra hợp lệ
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentYear = java.time.Year.now().getValue();
        if (year <= currentYear) {
            this.year = year;
        } else {
            System.out.println("Lỗi: Năm sản xuất không hợp lệ! (năm phải nhỏ hơn hoặc bằng " + currentYear + ")");
        }
    }
}
