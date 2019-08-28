package primer.preporties_t;

import frame.luckyframe.SysConfig;

import java.io.*;
import java.util.Properties;

/**
 * Java Properties 类基本使用
 *
 * @author 陈枫 on 2019-08-26.
 */
public class TestProperties {
    private static final Properties SYS_CONFIG = new Properties();
    private static final String SYS_CONFIG_FILE = "/sys_config.properties";

    static {
        try {
            InputStream in = new BufferedInputStream(TestProperties.class.getResourceAsStream(SYS_CONFIG_FILE));
            SYS_CONFIG.load(new InputStreamReader(in, "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private TestProperties() {
    }

    public static Properties getConfiguration() {
        return SYS_CONFIG;
    }

    public static void main(String[] args) throws IOException {
       /* Properties properties = new Properties();
        properties.load(new FileInputStream(new File("src\\main\\resources\\sys_config.properties")));
        String private = properties.getProperty("client.verison");
        System.out.println(clientVerison);*/

        String clientVersion = TestProperties.getConfiguration().getProperty("client.verison");
        System.out.println(clientVersion);


    }
}
