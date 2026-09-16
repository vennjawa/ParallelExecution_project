package tests;
import com.microsoft.playwright.Page;

import base.BaseTest;
import pages.LoginPage;
import pages.ProfilePage;
public class LoginTest extends BaseTest {
    Page page;

	public static void main(String[] args) {
        LoginTest test = new LoginTest();
        test.setUp();
        LoginPage login = new LoginPage(test.page);
        login.login("TestUser", "Test@123");
        ProfilePage profile = new ProfilePage(test.page);
        System.out.println(profile.getPageTitle());
        System.out.println(profile.isLogoutDisplayed());
        test.tearDown();
    }

	public void tearDown() {
		// TODO Auto-generated method stub
		
	}

	public void setUp() {
		// TODO Auto-generated method stub
		
	}
}
