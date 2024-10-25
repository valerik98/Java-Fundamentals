package MapsLambdaStreamAPI;

import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String studentName = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if (!studentsMap.containsKey(studentName)) {
                studentsMap.put(studentName, new ArrayList<>());
            }
            studentsMap.get(studentName).add(grade);

        }
        double sum = 0;
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            // Option 1
            sum = grades.stream().mapToDouble(Double::doubleValue).sum();

            // Option 2
//            double sum = 0;
//            for (Double grade : grades) {
//                sum  += grade;
//            }
            double averageGrade = sum / grades.size();
            if (averageGrade >= 4.50) {
                System.out.printf("%s -> %.2f\n", studentName, averageGrade);
            }
        }
    }
}
