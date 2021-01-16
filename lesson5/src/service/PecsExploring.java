package service;

import java.util.ArrayList;
import java.util.List;

public class PecsExploring {
    public static void main(String[] args) {
        List<? extends Number> numbers = new ArrayList<Number>();

       /* List<? extends Number> numbers = new ArrayList<Integer>();
        List<? extends Number> numbers = new ArrayList<Double>();*/

        Number number = numbers.get(1);

        List<? super Integer> integers = new ArrayList<Integer>();

/*        List<? extends Number> integers = new ArrayList<Number>();
        List<? extends Number> integers = new ArrayList<Object>();*/

        integers.add(1);
    }
}
