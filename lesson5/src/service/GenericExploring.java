package service;

import javafx.util.Pair;
import model.Pair2;
import model.Single;

public class GenericExploring {
    public static void main(String[] args) {
        Single<Pair2> single = new Single<>(new Pair2(3, "apple"));

        // Pair<Integer, String> pair = new Pair<>(4d, "lemon");

        // String value = single.getValue();

        // System.out.println(value);

        // Single<Integer> single1 = new Single<>(3);
        // Integer value1 = new GenericExploring().get(single1);
    }


/*    public <T> T get (Single<T> single){
        return single.getValue();
    }*/

    public <T,K> void test (Pair<T,K> single){
        //T value = single.getValue();
        System.out.println(single.getValue());
    }

}
