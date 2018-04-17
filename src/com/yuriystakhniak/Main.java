package com.yuriystakhniak;

public class Main {

    public static void main(String[] args) {
        while (true) {
            System.out.println("Please input first number");
            int num1 = ScannerUtil.getInt();
            System.out.println("Please input second number");
            int num2 = ScannerUtil.getInt();
            char operation = ScannerUtil.getOperation();
            int result = Calculation.calculation(num1, num2, operation);
            System.out.println("Result: " + result);
        }
    }
}
