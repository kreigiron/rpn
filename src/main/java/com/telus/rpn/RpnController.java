package com.telus.rpn;

import com.telus.rpn.calculator.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RpnController {

    @Autowired
    Calculator calculator;

    @RequestMapping("/")
    public String greetings() {
        return "Hello, please inject a valid Calculator in order to calculate reverse polish notation :)";
    }

    @RequestMapping("/calculate/{expression}")
    public String calculate(@PathVariable("expression") final String expression) {
        return calculator.calculate(expression);
    }
}
