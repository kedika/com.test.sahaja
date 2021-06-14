package com.test.sahaja.helper;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileReader;

public class JsonUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonUtils.class);


    /**
     * Load Json file in resources
     *
     * @param jsonLocation
     * @return JSONObject
     **/
    public static JSONObject loadJson(String jsonLocation) {

        JSONObject jsonObject = new JSONObject();
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader(JsonUtils.class.getClassLoader().getResource(jsonLocation).getFile()));
            jsonObject = (JSONObject) obj;
            return jsonObject;
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        return jsonObject;
    }

}