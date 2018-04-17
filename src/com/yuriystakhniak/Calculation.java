package com.yuriystakhniak;


public class Calculation {

    public static int calculation(int num1, int num2, char operation) {
        int result;
        switch (operation) {
            case '+':
                result = Operation.sum(num1, num2);
                break;
            case '-':
                result = Operation.diff(num1, num2);
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = Operation.div(num1, num2);
                break;
            default:
                System.out.println("Invalid input. Please try again");
                result = calculation(num1, num2, ScannerUtil.getOperation());
        }
        return result;
    }
}
