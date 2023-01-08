package OOP_Exercises.lab10.src.com.oop.library;

public class Library {
    Rent[] rents;

    public Library(Rent[] rents) {
        this.rents = rents;
    }

    public Rent getLongestRent() {
        long longest = 0;
        Rent longestRent = null;
        for (Rent rent : rents) {
            long time = rent.end.getTime() - rent.begin.getTime();
            if (time > longest) {
                longest = time;
                longestRent = rent;
            }
        }
        return longestRent;
    }
}
