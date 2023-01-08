package OOP_Exercises.lab10.src.com.oop.library;

public abstract class Item {
    String title;
    int year;

    public Item(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Item[" +
                "title='" + title + '\'' +
                ", year=" + year +
                ']';
    }
}
