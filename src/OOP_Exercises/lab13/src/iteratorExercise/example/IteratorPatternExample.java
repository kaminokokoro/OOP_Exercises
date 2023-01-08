package OOP_Exercises.lab13.src.iteratorExercise.example;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        for (Iterator iterator = productCatalog.getIterator(); iterator.hasNext(); ) {
            String product = (String) iterator.next();
            System.out.println("Product: " + product);
        }
    }
}
