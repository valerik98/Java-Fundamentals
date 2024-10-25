//package StudentTwo;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//
//        List<Student> studentList = new ArrayList<>();
//
//        while (!input.equals("end")) {
//            //John Smith 15 Sofia
//            String firstName = input.split(" ")[0];
//            String lastName = input.split(" ")[1];
//            int age = Integer.parseInt(input.split(" ")[2]);
//            String hometown = input.split(" ")[3];
//
//
////            if (IsStudentExisting(studentList, firstName, lastName)) {
////                int index = getExistingIndex(studentList, firstName, lastName);
////                studentList.get(index).setAge(age);
////                studentList.get(index).setHometown(hometown);
////            } else {
////                Student student = new Student(firstName,lastName,age,hometown);
////                studentList.add(student);
////            }
//
//        }
//
//
//        input = scanner.nextLine();
//    }
//
////    String city = scanner.nextLine();
////
////        for(Student student :studentList)
////
////    {
////        if (student.getHometown().equals(city)) {
////            System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
////        }
////    }
////}
////
////private static boolean IsStudentExisting(List<Student> studentList, String firstName, String lastName) {
////    for (Student student : studentList) {
////        if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
////            return true;
////        }
////    }
////    return false;
////}
////
////public static int getExistingIndex(List<Student> studentsList, String firstName, String lastName) {
////    int index = -1;
////    for (int i = 0; i < studentsList.size(); i++) {
////        Student student = studentsList.get(i);
////        if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
////            index = i;
////        }
////    }
////    return index;
////}
