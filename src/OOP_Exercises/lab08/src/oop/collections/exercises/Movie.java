package OOP_Exercises.lab08.src.oop.collections.exercises;

import java.util.Comparator;

class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    public int compareTo(Movie movie) {
        return this.year - movie.year;
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
}

class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        return left.getName().compareTo(right.getName());
    }
}

class RatingCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        if (left.getRating() < right.getRating()) {
            return -1;
        } else if (left.getRating() > right.getRating()) {
            return 1;
        } else {
            return 0;
        }
    }
}

