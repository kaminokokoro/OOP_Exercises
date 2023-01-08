package OOP_Exercises.lab05.src.exercise2_1;

public class TestAuthor {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);
        ahTeck.setEmail("pauTan@nowhere.com");
        System.out.println("name is: " + ahTeck.getName());
        System.out.println("email is:" + ahTeck.getEmail());
        System.out.println("gender is: " + ahTeck.getGender());
    }
}
