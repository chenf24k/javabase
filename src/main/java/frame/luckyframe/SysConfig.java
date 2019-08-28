package frame.luckyframe;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

/**
 * @author 陈枫 on 2019-08-21.
 */
public class SysConfig {
    private static final Properties SYS_CONFIG = new Properties();
    private static final String SYS_CONFIG_FILE = "/sys_config.properties";

    static {
        System.out.println("正在执行类初始化...");
        try {
            InputStream in = new BufferedInputStream(SysConfig.class.getResourceAsStream(SYS_CONFIG_FILE));
            SYS_CONFIG.load(new InputStreamReader(in, "UTF-8"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private SysConfig() {
    }

    private static Properties getConfiguration() {
        return SYS_CONFIG;
    }

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(SysConfig.class);
        String clientVerison = SysConfig.getConfiguration().getProperty("client.verison");
        System.out.println(clientVerison);
        PropertyConfigurator.configure("C:\\Users\\陈枫\\IdeaProjects\\base\\src\\main\\resources\\bootlog4j.conf");
        try {
            String host = InetAddress.getLocalHost().getHostAddress();
            logger.info("启动客户端监听,请稍后......监听IP:{}", host);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
