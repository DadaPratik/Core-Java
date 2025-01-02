package streams;

import java.util.List;

public class SumAndMultiplyUsingReduce {
    public static void main(String[] args) {
        integerReduce();
    }
    public static void integerReduce(){
        List<Integer> numbers = List.of(1,2,3,4,5);
        System.out.println(numbers.stream().reduce(0,(a,b)->a+b));
        System.out.println(numbers.stream().reduce(1,(a,b)->a*b));


    }
}
