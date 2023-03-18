import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Василий", "Пупейший", 23));
        person.add(new Person("Бублик", "Супер знатный", 15));
        person.add(new Person("Друндель", "Супер знатный", 29));
        person.add(new Person("Тралл", "Пупейший", 45));
        person.add(new Person("Бублейший", "Супер очень знатный", 15));
        person.add(new Person("Ситрипио", "Супер очень знатный", 78));
        person.add(new Person("Надоудалить", "Полностьюего", 16));
        //Collections.sort(person, new ComparatorSurnameAndAgePerson(3));
        System.out.println(person);
        person.removeIf(i -> i.getAge() < 18);
        System.out.println(person);
    }
}
