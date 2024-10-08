package com.bridgelabz;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Num_list_consumer implements Consumer<Integer>{
    public void accept(Integer num){
        System.out.println("Numner is :- "+num);
    }
}
public class MathApp {
    public static void main(String[] args) {

        // lambda expression for math operation
//        MathOperation addition = (num1, num2) -> num1 + num2;
//        MathOperation subs = (num1, num2) -> num1 - num2;
//        MathOperation div = (num1, num2) -> {
//            if (num2 == 0) {
//                throw new ArithmeticException("cannot devide by zero");
//            }
//            return num1 / num2;
//        };
//        MathOperation mul=(num1,num2)->num1*num2;
//
//        MathOperation.print_result(1,2,"additoin",addition);
//        MathOperation.print_result(1,4,"division",div);
//        MathOperation.print_result(2,2,"multilication",mul);
//        MathOperation.print_result(11,21,"Substractoin ",subs);
//

        List<Integer> numbers= Arrays.asList(1,2,4,6,7,8,9);
        System.out.println("This method is using the proper class which is Consumer interface");
        numbers.forEach(new Num_list_consumer());

        System.out.println("Using anonymous class:");
        numbers.forEach(new Num_list_consumer(){
            @Override
            public void accept(Integer num) {
                System.out.println("Number using anonymouse class :-"+num);
            }
        });

        System.out.println("using lambda function");
        numbers.forEach(num-> System.out.println("number is :- "+num));





    }
}
