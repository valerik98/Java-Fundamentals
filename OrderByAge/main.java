package OrderByAge;

import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<OrderByAge.Person> personList = new ArrayList<>();

        while(!input.equals("End")){
            String name = input.split(" ")[0];
            String id = input.split(" ")[1];
            int age = Integer.parseInt(input.split(" ")[2]);

            Person person = new OrderByAge.Person(name,id,age);
            personList.add(person);
            input = scanner.nextLine();
        }
        personList.sort(Comparator.comparing(OrderByAge.Person::getAge));

        for (OrderByAge.Person person : personList) {
            System.out.printf("%s with ID: %s is %d years old.\n", person.getName(), person.getId(), person.getAge());
        }
    }
}
