package com.telus.rpn.config;

import com.telus.rpn.calculator.Calculator;
import com.telus.rpn.calculator.DummyCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
    @Bean
    public Calculator calculator() {
        return new DummyCalculator();
    }
}
