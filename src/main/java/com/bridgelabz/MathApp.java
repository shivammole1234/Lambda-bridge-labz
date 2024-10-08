package com.bridgelabz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

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

        List<Integer> numbers= Arrays.asList(1,2,4,6,7,8,9,11,10,12,14,13,19,18);
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


        Function<Integer,Double> to_double_fun= num->num*2.0;
        System.out.println("using function interface to convert to double:");
        numbers.forEach(num-> System.out.println("original number:- "+num+", double x2:- "+to_double_fun.apply(num)));

        converter_double<Integer,Double> int_convert_double=num->num*2.0;
        System.out.println("using the custon fucntional interface");
        numbers.forEach(num-> System.out.println("Original num :- "+num+" DOuble num:- " + int_convert_double.convert(num)));

        // even number using predicate with help of forEach loop

        Predicate<Integer> is_even=num->num%2==0;
        List<Integer> even_list= new ArrayList<>();
        System.out.println("Even number in list ");
        numbers.forEach(num->{
            if(is_even.test(num)){
                System.out.println(num);
                even_list.add(num);
            }
        });
        System.out.println("even list number are \n"+even_list);
        
    }


}
