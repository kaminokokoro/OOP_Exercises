package OOP_Exercises.lab14.src.visitor.exercise1;

public class BusinessBook implements Book{
    public void accept(Visitor v) {
        v.visit(this);
    }

    public String getPublisher() {
        return "The publisher of business book";
    }
}
