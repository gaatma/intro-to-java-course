package com.cbfacademy;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) {
        // Create Properties object
        Properties properties = new Properties();

        // Set properties
        properties.setProperty("db.url", "localhost");
        properties.setProperty("db.port", "5353");
        properties.setProperty("db.user", "cbfacademy");
        properties.setProperty("db.password", "password");

        // Specify the path to save the configuration.properties file
        String filePath = "C:\\Users\\GIFTY\\JAVA-GIFTY\\cbf_java\\java_course_directory\\intro-to-java-course\\homework\\input-output\\configuration.properties";

        try (OutputStream output = new FileOutputStream(filePath)) {
            // Save properties to the file
            properties.store(output, "Database Configuration");

            System.out.println("Configuration file created successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
