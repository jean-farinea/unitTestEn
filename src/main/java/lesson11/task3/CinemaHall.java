package lesson11.task3;

public class CinemaHall {
    private String hallName;
    private String hallType;

    public CinemaHall(String hallName, String hallType) {
        this.hallName = hallName;
        this.hallType = hallType;
    }

    public String getHallName() {
        return hallName;
    }

    public String getHallType() {
        return hallType;
    }

    @Override
    public String toString() {
        return "CinemaHall{" +
                "hallName='" + hallName + '\'' +
                ", hallType='" + hallType + '\'' +
                '}';
    }

}
