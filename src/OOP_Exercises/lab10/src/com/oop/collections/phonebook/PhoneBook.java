package OOP_Exercises.lab10.src.com.oop.collections.phonebook;

public interface PhoneBook {
    void addPerson(Student p);

    Student searchByName(String name);

    Student searchByLastname(String lastname);

    Student searchByNumber(String phone);

    void deleteByNumber(String phone);

}
