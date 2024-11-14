package jsonHelper;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Paths;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import utils.GenericMethods;

public class json {
    private static Object getTestDataJsonObject(String foldername, String fileName) {
        String path;
        if (foldername.equals("testdata"))
            path = Paths.get(GenericMethods.getProjectRootDirectory(), "src", "test", "java", "testdata").toString();
        else
            path = Paths.get(GenericMethods.getProjectRootDirectory(), "src", "test", "java", "testdata", foldername).toString();
        String jsonPath = path + "/" + fileName + ".json";
        Reader reader = null;
        try {
            reader = new FileReader(jsonPath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null; // Return null in case of an error
        }
        JSONParser parser = new JSONParser();
        try {
            Object parsedObject = parser.parse(reader);
            return parsedObject;
        } catch (IOException | ParseException e) {
            e.printStackTrace();
            return null; // Return null in case of an error
        }
    }
  
    public static String getTestDataString(String foldername, String fileName, String key) {
        JSONObject jsonObject = (JSONObject) getTestDataJsonObject(foldername, fileName);
        return (String) jsonObject.get(key);
    }

}
