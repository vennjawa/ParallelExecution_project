package tests;
import base.BaseTest;
import pages.LoginPage;

import java.io.IOException;
import java.nio.file.Paths;

import org.junit.jupiter.api.*;

import com.microsoft.playwright.Page;

public class LoginTest extends BaseTest {
	
    @BeforeEach
    void start() throws IOException {
        setup();
    }
    @AfterEach
    void end() {
        tearDown();
    }
    @Test
    void loginTest1() {
        LoginPage login = new LoginPage(page);
        login.openWebsite();
        login.login("student", "Password123");

        System.out.println("Test1 : " + login.getSuccessMessage());
        page.screenshot(
        		new Page.ScreenshotOptions()
        		.setPath(Paths.get("target/screenshots/LoginTest.png"))
        		);
        
    }
}

