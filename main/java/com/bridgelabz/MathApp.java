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
            return num1 / num2;
        };
        MathOperation mul=(num1,num2)->num1*num2;

        MathOperation.print_result(1,2,"additoin",addition);
        MathOperation.print_result(1,4,"division",div);
        MathOperation.print_result(2,2,"multilication",mul);
        MathOperation.print_result(11,21,"Substractoin ",subs);
    }
}
