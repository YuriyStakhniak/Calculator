package com.yuriystakhniak;

import java.util.Scanner;

public class ScannerUtil {

    private static Scanner scanner;

    private ScannerUtil() throws
            IllegalStateException {
        throw new IllegalStateException("Can't create instance of ScannerUtil");
    }

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }


    public static int getInt() {
        String string;
        while (true) {
            string = getScanner().nextLine();
            if (string.matches("\\d+")) {
                return Integer.parseInt(string);
            }
        }
    }

    public static char getOperation() {
        System.out.println("Choose operation");
        char operation;
        if (scanner.hasNext()) {
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Invalid input. Please try again");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }
}
