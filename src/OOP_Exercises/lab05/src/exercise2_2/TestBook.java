package OOP_Exercises.lab05.src.exercise2_2;

import exercise2_1.Author;

public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        authors[1] = new Author("Paul Tan", "pauTan@nowhere.com", 'm');

        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);
    }
}
