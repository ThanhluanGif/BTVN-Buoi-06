package com.data.Bai_01;

public class Bai01 {
        private String name;
        private int age;

        // Getter cho name
        public String getName() {
            return name;
        }

        // Setter cho name
        public void setName(String name) {
            this.name = name;
        }

        // Getter cho age
        public int getAge() {
            return age;
        }

        // Setter cho age
        public void setAge(int age) {
            if (age >= 0) { // kiểm tra điều kiện hợp lệ
                this.age = age;
            } else {
                System.out.println("Tuổi không hợp lệ!");
            }
        }
    }

