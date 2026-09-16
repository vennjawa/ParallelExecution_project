package tests;

import com.microsoft.playwright.*;
public class CrossBrowserExample {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            BrowserType[] browsers = {
                    playwright.chromium(),
                    playwright.firefox(),
                    playwright.webkit()
            };
            String[] browserNames = {
                    "Chromium",
                    "Firefox",
                    "WebKit"
            };

            for (int i = 0; i < browsers.length; i++) {

                Browser browser = browsers[i].launch(
                         new BrowserType.LaunchOptions().setHeadless(false));
                Page page = browser.newPage();

                page.navigate("https://practicetestautomation.com/practice-test-login/");
                        page.fill("#username", "student");
                        page.fill("#password", "Password123");
                        page.click("#submit");
                        String message = page.locator(".post-title").textContent();
                        System.out.println(browserNames[i] + " : " + message);
                        browser.close();
                    }
                }
            }
        }
