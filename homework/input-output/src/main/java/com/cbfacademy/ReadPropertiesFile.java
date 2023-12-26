package com.cbfacademy;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) {
        // Specify the path to your example.properties file
        String filePath = "C:\\Users\\GIFTY\\JAVA-GIFTY\\cbf_java\\java_course_directory\\intro-to-java-course\\homework\\input-output\\target\\classes\\example.properties";

        // Create Properties object
        Properties properties = new Properties();

        try (InputStream input = new FileInputStream(filePath)) {
            // Load properties from the file
            properties.load(input);

            // Iterate through each property and print key-value pairs
            properties.forEach((key, value) -> {
                System.out.println(key + ": " + value);
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
