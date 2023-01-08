package OOP_Exercises.lab13.src.iteratorExercise.example;

public class ProductCatalog implements java.lang.Iterable {
    private String[] productCatalog;

    public ProductCatalog() {
        productCatalog = new String[]{"product1", "product2", "product3", "product4"};
    }

    @Override
    public Iterator getIterator() {
        return new ProductIterator();
    }

    private class ProductIterator implements Iterator {
        int position;

        public ProductIterator() {
            position = 0;
        }

        @Override
        public boolean hasNext() {
            return (position < productCatalog.length);
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return productCatalog[position++];
            }
            return null;
        }
    }
}
