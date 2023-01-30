package com.example.calculator;

public class Calculator {
    private double x;
    private double y;

    public Calculator(int x, int y){
        this.x = x;
        this.y = y;
    }

    public double minus(){
        return x-y;
    }
    public double plus(){
        return x+y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
