package com.bridgelabz;

@FunctionalInterface
public interface MathOperation {
    double operate(double num1,double num2);
    static void print_result(double num1,double num2,String function,MathOperation m_obj){
        System.out.println("Result of "+function+" is "+m_obj.operate(num1,num2));
    }
}
