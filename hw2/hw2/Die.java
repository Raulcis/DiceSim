import edu.princeton.cs.algs4.StdOut;

import java.util.Random;

// A data type representing a six-sided die.
public class Die implements Comparable<Die> {
    private int value; // face value

    // Roll the die.
    public void roll() {

        Random rand = new Random();
        value = rand.nextInt(6) + 1;
    }

    // Face value of the die.
    public int value() {
        return value;
    }

    // Does the die have the same face value as that?
    public boolean equals(Die that) {

        if (compareTo(that) != 1) {
            return false;
        } else
            return true;
    }

    // A negative integer, zero, or positive integer depending on whether this
    // die's value is less than, equal to, or greater than the that die's value.
    public int compareTo(Die that) {
        if (this.value < that.value) {
            return 0;
        } else if (this.value > that.value) {
            return -1;
        } else return 1;
    }

    // A string representation of the die giving the current face value.
    public String toString() {
        // Code Here
        String star = "*";
        
        if (value() == 1) {
            return star;

        } else if (value() == 2) {
            star = "* \n\t\b*";
            return star;

        } else if (value() == 3) {
            star = "* \n  * \n    *";
            return star;

        } else if (value() == 4) {

            star = "*   *\n*   *";
            return star;

        } else if (value() == 5) {
            star = "*   *\n  *\n*   * ";
            return star;

        } else
            star = "*   *\n*   *\n*   * ";
        return star;
    }

    // Test client. [DO NOT EDIT]
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);
        Die a = new Die();
        a.roll();
        while (a.value() != x) {
            a.roll();
        }
        Die b = new Die();
        b.roll();
        while (b.value() != y) {
            b.roll();
        }
        Die c = new Die();
        c.roll();
        while (c.value() != z) {
            c.roll();
        }
        StdOut.println(a);
        StdOut.println(a.equals(b));
        StdOut.println(b.equals(c));
        StdOut.println(a.compareTo(b));
        StdOut.println(b.compareTo(c));
    }
}
