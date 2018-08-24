package com.telus.rpn;

import com.telus.rpn.calculator.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RpnController {

    @Autowired
    Calculator calculator;

    @RequestMapping("/")
    public String greetings() {
        return "Hello, please inject a valid Calculator in order to calculate reverse polish notation :)";
    }

    @RequestMapping("/calculate")
    public String calculate(@RequestParam("expression") final String expression) {
        return calculator.calculate(expression);
    }

    @RequestMapping("/history")
    public String[] history(@RequestParam(value = "order-by", required = false) final String orderBy) {
        if(orderBy == null || "latest".equals(orderBy)) {
            return new String[] {"This", "should", "return", "the", "array", "sorted", "by", "latest"};
        }
        return new String[] {"This", "should", "return", "the", "array", "sorted", "alphabetically"};
    }
}
