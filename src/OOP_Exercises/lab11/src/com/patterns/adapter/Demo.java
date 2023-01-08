package OOP_Exercises.lab11.src.com.patterns.adapter;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(hole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        // hole.fits(smallSqPeg); // Won't compile.

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println(hole.fits(smallSqPegAdapter));
        System.out.println(hole.fits(largeSqPegAdapter));
    }
}
