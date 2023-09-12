package lesson11.task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doctors {

    public static void main(String[] args) {
        List<String> specialtiesList = Arrays.asList(
                "Hospital:Surgeon:Radiologist:Maxillofacial Surgeon:Pediatrician",
                "Clinic:Pediatrician", "Clinic:Internist:Laryngologist:Pediatrician"
        );

        List<String> uniqueSpecialties = specialtiesList.stream()
                .flatMap(s -> Arrays.stream(s.split(":")))
                .filter(s -> !s.equals("Hospital") && !s.equals("Clinic"))
                .filter(specialty -> !specialty.isEmpty())
                .distinct()
                .collect(Collectors.toList());

        String result = String.join(", ", uniqueSpecialties);
        System.out.println(result);
    }

}
