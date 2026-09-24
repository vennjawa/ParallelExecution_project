package base;
import com.microsoft.playwright.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BaseTest {
    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;
  
    public void setup() throws IOException {
    	Files.createDirectories(Paths.get("target/screenshots"));
    	Files.createDirectories(Paths.get("target/videos"));
    	playwright = Playwright.create();

        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false));

        context = browser.newContext(
        		new Browser.NewContextOptions()
        		.setRecordVideoDir(Paths.get("target/videos"))
        		);

        		page = context.newPage();
    }

    public void tearDown() {
    	context.close();
        browser.close();
        playwright.close();
    }
}
