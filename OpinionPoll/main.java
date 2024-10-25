package OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();

            String name = input.split(" ")[0];
            int age = Integer.parseInt(input.split(" ")[1]);

            String id = null;
            Person person = new Person(name, id, age);

            people.add(person);
            
        }
        for (Person person : people) {
            if (person.getAge()>30){
                System.out.println(person.getName() + " - " + person.getAge());
            }
        }
    }
}
