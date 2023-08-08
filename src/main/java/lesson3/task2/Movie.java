package lesson3.task2;

public class Movie {
    private String title;
    private String director;
    private int durationInMinutes;
    private int yearOfProduction;

    public Movie(String title, String director, int durationInMinutes, int yearOfProduction) {
        this.title = title;
        this.director = director;
        this.durationInMinutes = durationInMinutes;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }
}
