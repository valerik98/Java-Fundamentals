package MapsLambdaStreamAPI;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String input = scanner.nextLine();
        List<String> students = new ArrayList<>();

        while (!input.equals("end")) {
            String courseName = input.split(" : ")[0];
            String studentName = input.split(" : ")[1];

            if (!courses.containsKey(courseName)) {
                courses.put(courseName, new ArrayList<>());
            }
            courses.get(courseName).add(studentName);
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            String courseName = entry.getKey();

            students = entry.getValue();

            System.out.printf("%s: %d\n", courseName, students.size());
            students.forEach(name -> System.out.printf("-- %s\n", name));
        }
    }
}
