package OOP_Exercises.lab13.src.builderExercise.example;

public class IglooHouseBuilder implements HouseBuilder {
    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    public void buildBasement() {
        house.setBasement("Ice Bars");
    }

    public void buildStructure() {
        house.setStructure("Ice Blocks");
    }

    public void buildInterior() {
        house.setInterior("Ice Carvings");
    }

    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    public House getHouse() {
        return this.house;
    }
}

