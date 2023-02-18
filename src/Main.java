import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
    String text = "Vasya Pupkin The";
        List<Person> person = new ArrayList<>();
        person.add(new Person("Василий","Пупейший",23));
        person.add(new Person("Бублик","Супер знатный",15));
        person.add(new Person("Тралл","Пупейший",45));
        person.add(new Person("Бублейший","Супер очень знатный",15));
        person.add(new Person("Ситрипио","Супер очень знатный",78));
        person.sort(new ComparatorSurnameAndAgePerson());
        Collections.sort(person,new ComparatorSurnameAndAgePerson());
        System.out.println(person);

    }
}
