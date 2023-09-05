package org.example.client;

public class Client {
    public static void main(String[] args) {
        CalculatorService cal = new CalculatorService();
        Calculator port = cal.getCalculatorPort();
        double a = 36;
        double b = 12;
        System.out.println(a + " + " + b + " = " + port.add(a, b));
        System.out.println(a + " - " + b + " = " + port.sub(a, b));
        System.out.println(a + " * " + b + " = " + port.mul(a, b));
        System.out.println(a + " / " + b + " = " + port.div(a, b));
    }
}
