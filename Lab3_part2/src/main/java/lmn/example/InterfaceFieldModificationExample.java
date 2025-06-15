package lmn.example;

import java.util.logging.Logger;

 final class Constants {
    public static final int MAX_USERS = 100;

    private Constants() {
        // Prevent instantiation
    }
}

public class InterfaceFieldModificationExample {

    private static final Logger logger = Logger.getLogger(InterfaceFieldModificationExample.class.getName());

    public static void main(String[] args) {
        logger.info("Max users allowed: " + Constants.MAX_USERS);
    }
}
