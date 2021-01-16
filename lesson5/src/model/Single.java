package model;

public class Single<T extends Pair & Cloneable> {

    private T value;

    public Single(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
