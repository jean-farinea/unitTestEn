package lesson11.task3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MyCinema extends CinemaHall {

    public MyCinema(String hallName, String hallType) {
        super(hallName, hallType);
    }

    public static void main(String[] args) {
        List<CinemaHall> halls = Arrays.asList(
                new CinemaHall("Hall 1", "2D"),
                new CinemaHall("Hall 2", "3D"),
                new CinemaHall("Hall 3", "2D"),
                new CinemaHall("Hall 4", "3D"),
                new CinemaHall("Hall 5", "4D"),
                new CinemaHall("Hall 6", "2D"),
                new CinemaHall("Hall 7", "3D"),
                new CinemaHall("Hall 8", "4D"),
                new CinemaHall("Hall 9", "2D"),
                new CinemaHall("Hall 10", "3D")
        );

        // Group cinema halls by room type and count them
        Map<String, Long> hallCounts = halls.stream()
                .collect(Collectors.groupingBy(CinemaHall::getHallType, Collectors.counting()));

        // Display information about how many halls there are in each type
        hallCounts.forEach((type, count) ->
                System.out.println("Number of " + type + " halls: " + count)
        );
    }

}
