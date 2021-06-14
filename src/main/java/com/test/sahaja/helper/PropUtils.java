package com.test.sahaja.helper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.System.out;

public class PropUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(PropUtils.class);
    private static Properties environmentProps;
    private static Properties successProps;

    /**
     * Gets the key from application.properties related
     *
     * @param key
     * @return String
     **/
    public static String getProp(String key) {
        if ((key == null) || key.isEmpty()) {
            return "";
        } else {
            return environmentProps.getProperty(key);

        }
    }


    /**
     * Gets the key from application.properties related
     *
     * @param action
     * @return String
     **/
    public static String getMessage(String action) {
        if ((action == null) || action.isEmpty()) {
            return "";
        } else {
            return successProps.getProperty(action);

        }
    }


    /**
     * Load application properties file
     *
     * @param configPropertyFileLocation
     **/

    public static void loadRunConfigProps(String configPropertyFileLocation) {
        environmentProps = new Properties();
        try (InputStream inputStream = PropUtils.class.getClassLoader().getResourceAsStream(configPropertyFileLocation)) {
            if(configPropertyFileLocation.contains("application.properties")){
                environmentProps.load(inputStream);
                environmentProps.list(out);
            }else{
                successProps.load(inputStream);
                successProps.list(out);
            }

        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
