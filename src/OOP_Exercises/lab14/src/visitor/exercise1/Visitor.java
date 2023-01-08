package OOP_Exercises.lab14.src.visitor.exercise1;

public interface Visitor {
    void visit(BusinessBook book);

    void visit(DesignPatternBook book);

    void visit(JavaCoreBook book);
}

