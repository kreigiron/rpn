package com.telus.rpn.calculator;

public class DummyCalculator implements Calculator {
    @Override
    public String calculate(String expression) {
        return "Received " + expression + ", but I'm dummy, cannot calculate :P";
    }
}
