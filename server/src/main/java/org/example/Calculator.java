package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public class Calculator {
    @WebMethod
    public double add(double a, double b) {
        return a + b;
    }
    @WebMethod
    public double sub(double a, double b) {
        return a - b;
    }
    @WebMethod
    public double mul(double a, double b) {
        return a * b;
    }
    @WebMethod
    public double div(double a, double b) {
        if(b == 0) throw new ArithmeticException();
        return a / b;
    }
}
