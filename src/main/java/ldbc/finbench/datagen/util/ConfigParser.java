package ldbc.finbench.datagen.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ConfigParser {

    public static Map<String, String> readConfig(String paramsFile) {
        try (FileInputStream fis = new FileInputStream(paramsFile)) {
            return readConfig(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Map<String, String> readConfig(InputStream paramStream) {
        Properties properties = new Properties();
        Map<String, String> res = new HashMap<>();
        try {
            properties.load(new InputStreamReader(paramStream, StandardCharsets.UTF_8));
            for (String s : properties.stringPropertyNames()) {
                res.put(s, properties.getProperty(s));
            }
            return res;
        } catch (IOException e) {
            System.err.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static Map<String, String> scaleFactorConf(String scaleFactorId) {
        Map<String, String> conf = new HashMap<>();
        // todo
        return conf;
    }


}
