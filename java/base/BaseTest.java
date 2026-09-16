package base;

import com.microsoft.playwright.*;

public class BaseTest {
protected Playwright playwright;
protected Browser browser;
public Page page;
public void setUp() {
playwright = Playwright.create();
browser = playwright.chromium().launch(
new BrowserType.LaunchOptions().setHeadless(false));
page = browser.newPage();
page.navigate("https://demoqa.com/login");
}
public void tearDown() {
browser.close();
playwright.close();
}
}