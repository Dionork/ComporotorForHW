import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Василий", "Пупейший", 23));
        person.add(new Person("Бублик", "Супер знатный", 15));
        person.add(new Person("Друндель", "Супер знатный", 29));
        person.add(new Person("Тралл", "Пупейший", 45));
        person.add(new Person("Бублейший", "Супер очень знатный", 15));
        person.add(new Person("Ситрипио", "Супер очень знатный", 78));
        // Collections.sort(person, new ComparatorSurnameAndAgePerson(3));
        Collections.sort(person,(Person o1, Person o2)->{
            int maxValue=3;
            StringTokenizer st1 = new StringTokenizer(o1.getSurname());
            StringTokenizer st2 = new StringTokenizer(o2.getSurname());
            if (st1.countTokens() >= maxValue || st2.countTokens() >= maxValue) {
                if (st1.countTokens() < st2.countTokens()) {
                    return -1;
                } else if (st1.countTokens() > st2.countTokens()) {
                    return 1;
                }
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        System.out.println(person);
    }
}
