package com.mycompany.lab5.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfDoubles {

    public static void main(String[] args) {
        ArrayList<Double> numbers = new ArrayList<>();
        
        String answer = "Y";
        try (Scanner scanner = new Scanner(System.in)) {
            while (answer.equalsIgnoreCase("Y")) {
                System.out.println("Nhap vao so thuc: ");
                double num = scanner.nextDouble();
                numbers.add(num);
                scanner.nextLine();
                
                System.out.println("Ban co muon tiep tuc khong(Y/N): ");
                answer = scanner.nextLine();
            }
        }

        System.out.println("Cac so thuc ban da nhap la:");
        for (Double number : numbers) {
            System.out.println(number);
        }

        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }
        System.out.println("Tong cac so thuc la: " + sum);
    }
}