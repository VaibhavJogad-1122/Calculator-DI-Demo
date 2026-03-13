package com.example.demo.model;

import com.example.demo.service.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {

    private Calculator calculator;

    @Autowired
    public User(@Qualifier("calculatorB") Calculator calculator) {
        this.calculator = calculator;
    }

    public int performCalculation(int a, int b) {
        return calculator.calculate(a, b);
    }
}
