package page.gui;

import javafx.application.Application;

/**
 * A launcher class to workaround classpath issues.
 */
public class Launcher {
    /**
     * Launches the Page GUI application.
     *
     * @param args Command line input.
     */
    public static void main(String[] args) {
        Application.launch(Main.class, args);
    }
}
