package lmn.example;

import java.util.logging.Logger;

public class HardcodedCredentialsExample {

    private static final Logger logger = Logger.getLogger(HardcodedCredentialsExample.class.getName());

    public static void main(String[] args) {
        String username = "admin";
        String password = System.getenv("APP_PASSWORD"); // Đọc từ biến môi trường
        if (authenticate(username, password)) {
            logger.info("Access granted");
        } else {
            logger.warning("Access denied");
        }
    }

    private static boolean authenticate(String user, String pass) {
        String expectedUser = "admin";
        String expectedPass = System.getenv("APP_PASSWORD");
        return user.equals(expectedUser) && pass.equals(expectedPass);
    }
}
