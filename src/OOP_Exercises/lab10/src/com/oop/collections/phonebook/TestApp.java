package OOP_Exercises.lab10.src.com.oop.collections.phonebook;

public class TestApp {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBookMap();
        //PhoneBook pb = new PhoneBookArray();
        pb.addPerson(new Student("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Student("Marco", "Rizzo", "45243"));
        pb.addPerson(new Student("Luisa", "Poppi", "24564"));

        System.out.println(pb.searchByName("Marco"));
        System.out.println(pb.searchByNumber("1111"));

        pb.deleteByNumber("24564");
        System.out.println(pb.searchByLastname("Poppi"));
    }
}
