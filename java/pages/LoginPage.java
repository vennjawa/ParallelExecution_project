package pages;
import com.microsoft.playwright.Page;
public class LoginPage {
    private Page page;
    public LoginPage(Page page) {
        this.page = page;
    }
    // Locators
    private String username = "#userName";
    private String password = "#password";
    private String loginBtn = "#login";
    // Actions
    public void enterUsername(String user) {
        page.locator(username).fill(user);
    }
    public void enterPassword(String pass) {
        page.locator(password).fill(pass);
    }
    public void clickLogin() {
        page.locator(loginBtn).click();
    }
    public void login(String user, String pass) {
        enterUsername(user);
        enterPassword(pass);
        clickLogin();
    }
}

