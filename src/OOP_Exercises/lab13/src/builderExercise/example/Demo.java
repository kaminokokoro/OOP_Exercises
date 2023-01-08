package OOP_Exercises.lab13.src.builderExercise.example;

public class Demo {
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        CivilEngineer engineer = new CivilEngineer(iglooBuilder);

        engineer.constructHouse();
        House house = engineer.getHouse();

        System.out.println("Builder constructed: " + house);
    }
}
