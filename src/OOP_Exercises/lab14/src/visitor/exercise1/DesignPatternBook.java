package OOP_Exercises.lab14.src.visitor.exercise1;

public class DesignPatternBook implements ProgramingBook{
    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }

    @Override
    public String getResource() {
        return "https://github.com/gpcodervn/Design-Pattern-Tutorial/";
    }

    public String getBestSeller() {
        return "The best Seller of design pattern book";
    }
}