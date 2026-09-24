package tests;
import base.BaseTest;
import pages.LoginPage;

import java.io.IOException;
import java.nio.file.Paths;

import org.junit.jupiter.api.*;

import com.microsoft.playwright.Page;
public class LoginTwoTest extends BaseTest {
    @BeforeEach
    void start() throws IOException {
        setup();
    }
    @AfterEach
    void end() {
        tearDown();
    }
    @Test
    void loginTest2() {
        LoginPage login = new LoginPage(page);
        login.openWebsite();
        login.login("student", "Password123");

        System.out.println("Test2 : " + login.getSuccessMessage());
        page.screenshot(
        		new Page.ScreenshotOptions()
        		.setPath(Paths.get("target/screenshots/LoginTwoTest.png"))
        		);
    }
}
