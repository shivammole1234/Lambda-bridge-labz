package com.bridgelabz;

public class MathApp {
    public static void main(String[] args) {

        // lambda expression for math operation
        MathOperation addition = (num1, num2) -> num1 + num2;
        MathOperation subs = (num1, num2) -> num1 - num2;
        MathOperation div = (num1, num2) -> {
            if (num2 == 0) {
                throw new ArithmeticException("cannot devide by zero");
            }
            ;
            return num1 / num2;
        };
        MathOperation mul=(num1,num2)->num1*num2;

        System.out.println("additon :- "+addition.operate(3,4));
        System.out.println("substraction :- "+subs.operate(5,2));
    }
}
