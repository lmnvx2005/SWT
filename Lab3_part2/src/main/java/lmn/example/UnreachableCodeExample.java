package lmn.example;

import java.util.logging.Logger;

public class UnreachableCodeExample {
    private static final Logger logger = Logger.getLogger(UnreachableCodeExample.class.getName());

    public static int getNumber() {
        return 42;

    }

    public static void main(String[] args) {
        String message=String.valueOf(getNumber());
        logger.info(message);
    }
}



