package model;

import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Iterator;

public class FindOldest {
    public Person find(Collection<Person> collection){
        LocalDate sought;
        Person person = null;
        if (collection != null && !collection.isEmpty()) {
            Iterator<Person> iterator = collection.iterator();
            Person element = iterator.next();
            person = element;
            sought = element.getDateOfBirth();
            while (iterator.hasNext()) {
                Person current = iterator.next();
                LocalDate currentValue = current.getDateOfBirth();
                if(currentValue.compareTo(sought) < 0) {
                    sought = currentValue;
                    person = current;
                }
            }
        }
        return person;
    }
}
