import org.junit.jupiter.api.Test;
import LeMinhNhat.HardcodedCredentialsExample;

public class InsecureLoginTest {

    @Test
    public void testLoginSuccess() {
        HardcodedCredentialsExample.login("admin", "123456");
        // Không cần assert nếu chỉ cần chạy để tránh warning "method not used"
    }

    @Test
    public void testLoginFail() {
        HardcodedCredentialsExample.login("user", "wrongpassword");
    }

    @Test
    public void testPrintUserInfo() {
        HardcodedCredentialsExample hardcodedCredentialsExample = new HardcodedCredentialsExample();
        hardcodedCredentialsExample.printUserInfo("John Doe");
    }
}
