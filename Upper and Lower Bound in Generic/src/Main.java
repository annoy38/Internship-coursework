import java.util.Arrays;
import java.util.List;

public class Main {

    /* Suppose, we want to write the method for the list of Number
    and its subtypes (like Integer, Double). Using List<? extends Number>
    is suitable for a list of type Number or any of its subclasses */
    public static void upperBound(List<? extends Number> list){
        for(Number n: list){
            System.out.print(n+" ");
        }
    }

    /* Suppose, we want to write the method for the list of Integer
    and its supertype (like Number, Object). Using List<? super Integer>
    is suitable for a list of type Integer or any of its superclasses */
    public static void lowerBound(List<? super Integer> list){
        for (Object n: list){
            System.out.print(n+" ");
        }
    }

    public static void main(String[] args) {
        List<Number> list = Arrays.asList(4.5,5.0,2.6,6.1);
        upperBound(list);
        System.out.println();
        lowerBound(list);
    }
}