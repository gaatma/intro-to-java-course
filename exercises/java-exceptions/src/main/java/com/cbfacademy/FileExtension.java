package com.cbfacademy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {
    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("File name is null or empty");
        }
        return filename.endsWith(".java");
    }

    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();

        for (String filename : filenames) {
            try {
                boolean result = check(filename);
                resultMap.put(filename, result ? 1 : 0);
            } catch (FilenameException e) {
                resultMap.put(filename, -1);
            }
        }

        return resultMap;
    }

    public static void main(String[] args) {
        FileExtension fileExtension = new FileExtension();
        List<String> filenames = Arrays.asList("App.java", "App.txt", null, "App.md");


        Map<String, Integer> resultMap = fileExtension.map(filenames);

        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println("{" + entry.getKey() + ", " + entry.getValue() + "}");
        }
    }
}


