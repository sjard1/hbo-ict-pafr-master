package assignment2.domain;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 20-12-16 @ 16:07
 */

public class Wagon {
    private String name;
    private int seats;

    public Wagon(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

}