package com.yuriystakhniak;


public class CalculatorException extends ArithmeticException {

    public CalculatorException() {
        super("You cant divide by zero");
    }
}
