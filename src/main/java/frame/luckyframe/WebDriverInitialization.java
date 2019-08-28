package frame.luckyframe;

import java.io.File;
import java.io.IOException;

/**
 * @author 陈枫 on 2019-08-25.
 */
public class WebDriverInitialization {
    private static final String os = System.getProperty("os.name").toLowerCase();

    public static void main(String[] args) throws IOException {
        System.out.println(os);
        File directory = new File("");
        String drivenPath = directory.getCanonicalPath() + File.separator + "BrowserDriven" + File.separator;
        System.out.println(drivenPath);

    }
}
