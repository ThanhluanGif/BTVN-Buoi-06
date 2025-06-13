package com.data.Bai_06;

public class MoveablePoint extends Point{
    private double xSpeed;
    private double ySpeed;

    // Constructor không tham số
    public MoveablePoint() {
        super();
        this.xSpeed = 0;
        this.ySpeed = 0;
    }

    // Constructor có tham số riêng
    public MoveablePoint(double xSpeed, double ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor đầy đủ
    public MoveablePoint(double x, double y, double xSpeed, double ySpeed) {
        super(x, y); // gọi constructor lớp cha
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter và Setter
    public double getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(double xSpeed) {
        this.xSpeed = xSpeed;
    }

    public double getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(double ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Phương thức move(): cập nhật vị trí dựa trên tốc độ
    public void move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
    }

    // Ghi đè toString
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ") with speed (" + xSpeed + ", " + ySpeed + ")";
    }
}
