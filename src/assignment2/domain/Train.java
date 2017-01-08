package assignment2.domain;

import java.util.ArrayList;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 20-12-16 @ 16:07
 */

public class Train {
    private String name;
    public static ArrayList<Wagon> wagons = new ArrayList<Wagon>();

    private Logger log = Logger.getInstance();

    public Train(String name) {
        this.name = name;
        System.out.print(name + " trein aangemaakt \n");
    }

    public String getName() {
        return name;
    }

    public void add(Wagon wagon) {
        this.wagons.add(wagon);
    }

    public void remove(Wagon wagon) {
        this.wagons.remove(wagon);
    }

    public void removeAll(ArrayList<Wagon> wagons) {
        this.wagons.removeAll(wagons);
    }

    public ArrayList<Wagon> getWagons() {
        return this.wagons;
    }

    public ArrayList<Wagon> getWagons(String id) {
        int counter = 1;
        ArrayList<Wagon> w = new ArrayList<Wagon>();
        for (Wagon wagon : this.wagons) {
            if (id.equals(wagon.getName())) {
                w.add(wagon);
                counter++;
            }
        }

        if (wagons.size() > 0 || w.isEmpty()) {
            log.notice("There are no wagons with ID " + id + " hooked to the train (ID: " + this.name + ").");
        } else {
            log.notice("Found " + counter + " wagon(s) at the train.");
        }

        return w;
    }
    public String toString(){
        return name.toString();
    }
}