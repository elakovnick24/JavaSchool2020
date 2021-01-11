package service;

import model.FindOldest;
import model.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ExampleExploring {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Vasya");
        person1.setDateOfBirth(LocalDate.of(1980,3,20));

        Person person2 = new Person();
        person1.setName("Ivan");
        person1.setDateOfBirth(LocalDate.of(1990,3,20));

        List<Person> persons = Arrays.asList(person1,person2);

        new ExampleExploring().print(new FindOldest(),persons);
    }

    public void print (FindOldest finder, Collection<Person> collection){
        System.out.println(finder.find(collection));
    }
}
