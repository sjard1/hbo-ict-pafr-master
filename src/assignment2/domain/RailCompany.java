package assignment2.domain;

import java.util.ArrayList;

/**
 * Controller class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 21-12-16 @ 12:10
 */

public class RailCompany implements CommandHandler {
    private ArrayList<Train> trains = new ArrayList<Train>();
    private ArrayList<Wagon> wagons = new ArrayList<Wagon>();

    private Logger log = Logger.getInstance();

    private Train containsTrain(String id) {
        Train t = null;
        for (Train train : trains) {
            if (id.equals(train.getName())) {
                t = train;
                log.notice("Found the train.");
            }
        }

        if (trains.size() > 0 || t == null) {
            log.notice("The train with ID " + id + " was not found.");
        }

        return t;
    }

    private Wagon containsWagon(String id) {
        Wagon w = null;
        for (Wagon wagon : wagons) {
            if (id.equals(wagon.getName())) {
                w = wagon;
                log.notice("Found the wagon.");
            }
        }

        if (wagons.size() > 0 || w == null) {
            log.notice("The wagon with ID " + id + " was not found.");
        }

        return w;
    }

    @Override
    public void newTrainCommand(String id) {
        if (containsTrain(id) == null) {
            trains.add(new Train(id));
            log.notice("Created the train.");
        } else {
            log.warning("The train with ID " + id + " already exists.");
        }
    }

    @Override
    public void newWagonCommand(String id, String seats) {
        if (containsWagon(id) == null) {
            seats = seats != null ? seats : "20";
            wagons.add(new Wagon(id, Integer.parseInt(seats)));
            log.notice("Created the wagon with " + seats + " seats.");
        } else {
            log.warning("The wagon with ID " + id + " already exists.");
        }
    }

    @Override
    public void delCommand(String type, String id) {
        // Delete the object of the right type
        if ("train".equals(type.toLowerCase())) {
            Train t = containsTrain(id);
            if (t != null) {
                trains.remove(t);
                log.notice("Deleted the train.");
            } else {
                log.warning("The train with ID " + id + " does not exists.");
            }
        } else if ("wagon".equals(type.toLowerCase())) {
            Wagon w = containsWagon(id);
            if (w != null) {
                wagons.remove(w);
                if (trains.size() > 0) {
                    int counter = 0;
                    for (Train train : trains) {
                        ArrayList<Wagon> trainWagons = train.getWagons(id);
                        if (!trainWagons.isEmpty()) {
                            train.removeAll(trainWagons);
                            counter++;
                        }
                    }
                    log.notice("Removed the wagon from " + counter + " train(s).");
                }
                log.notice("Deleted the wagon.");
            } else {
                log.warning("The wagon with ID " + id + " does not exists.");
            }
        } else {
            log.error("The command applied is incorrect.");
        }
    }

    @Override
    public void addCommand(String wagon, String train) {
        Wagon w = containsWagon(wagon);
        Train t = containsTrain(train);
        if (w != null && t != null) {
            log.notice("Added the wagon to the train.");
            t.add(w);
        } else {
            log.warning("Either the wagon (ID: " + wagon + ") and/or the train (ID: " + train + ") does not exists.");
        }
    }

    @Override
    public void remCommand(String wagon, String train) {
        Wagon w = containsWagon(wagon);
        Train t = containsTrain(train);
        if (w != null && t != null) {
            log.notice("Removed the wagon from the train.");
            t.remove(w);
        } else {
            log.warning("Either the wagon (ID: " + wagon + ") and/or the train (ID: " + train + ") does not exists.");
        }
    }

    @Override
    public void getCommand(String type, String id) {

    }
}