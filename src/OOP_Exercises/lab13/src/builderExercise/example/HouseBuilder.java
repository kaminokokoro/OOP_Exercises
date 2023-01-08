package OOP_Exercises.lab13.src.builderExercise.example;

public interface HouseBuilder {

    void buildBasement();

    void buildStructure();

    void buildRoof();

    void buildInterior();

    House getHouse();
}
