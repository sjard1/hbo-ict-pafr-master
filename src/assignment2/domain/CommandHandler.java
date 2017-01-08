package assignment2.domain;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 21-12-16 @ 12:01
 */

public interface CommandHandler {
    void newTrainCommand(String id);

    void newWagonCommand(String id, String seats);

    void delCommand(String type, String id);

    void addCommand(String wagon, String train);

    void remCommand(String wagon, String train);

    void getCommand(String type, String id);
}
