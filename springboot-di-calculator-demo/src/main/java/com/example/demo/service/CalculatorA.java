package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.service.Calculator;

@Service("calculatorA")
public class CalculatorA implements Calculator {

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}