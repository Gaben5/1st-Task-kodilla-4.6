package com.example.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);

        Calculator calk1 = new Calculator(10,5);
        System.out.println("subtraction: "+calk1.getX()+" - "+calk1.getY()+" = "+calk1.minus());
        System.out.println("addition: "+calk1.getX()+" + "+calk1.getY()+" = "+calk1.plus());
    }

}
