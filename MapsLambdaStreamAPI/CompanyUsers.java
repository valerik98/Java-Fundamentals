package MapsLambdaStreamAPI;

import java.util.*;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyUsers = new LinkedHashMap<>();

        //{companyName} -> {employeeId}
        String input = scanner.nextLine();

        while (!input.equals("End")){
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (!companyUsers.containsKey(companyName)){
                companyUsers.put(companyName,new ArrayList<>());
            }
            if (!companyUsers.get(companyName).contains(employeeId)){
                companyUsers.get(companyName).add(employeeId);
            }

            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : companyUsers.entrySet()) {
            System.out.println(entry.getKey());
            for (String i : entry.getValue()) {
                System.out.println("-- " + i);
            }
        }


    }
}
