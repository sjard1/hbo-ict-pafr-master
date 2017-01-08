package assignment2.domain;

/**
 * Describe this class
 *
 * @author Luuk S. van Houdt <info@lsvh.org>
 * @version 0.1
 * @since 20-12-16 @ 22:56
 */

public class Logger {
    private static final Logger instance = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public void notice(String message) {
        message = "\u001B[1m[NOTICE]\u001B[0m " + message;
        System.out.println(message);
    }

    public void warning(String message) {
        message = "\u001B[1m[WARNING]\u001B[0m " + message;
        System.out.println(message);
    }

    public void error(String message) {
        message = "\u001B[1m[ERROR]\u001B[0m " + message;
        System.out.println(message);
    }
}