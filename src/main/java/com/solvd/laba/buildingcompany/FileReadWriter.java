package com.solvd.laba.buildingcompany;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;

public class FileReadWriter {

    public static String wordCounter(String word, HashMap<String, Integer> unique){
        String temp;
        temp = StringUtils.lowerCase(word).replaceAll("\\p{P}", "");
        if(unique.containsKey(temp)){
            return "The word: " + temp + " was found " + unique.get(temp) + " amount of times.";
        }
        return "Word was not found.";
    }

    public static void main(String[] args) throws IOException {

        File input = FileUtils.getFile("../buildingcompany/src/main/resources/input.txt");
        File output = FileUtils.getFile("../buildingcompany/src/main/resources/output.txt");

        String str = FileUtils.readFileToString(input, StandardCharsets.UTF_8);


        str = StringUtils.lowerCase(str).replaceAll("\\p{P}", "");
        String[] words = StringUtils.split(str);


        HashMap<String, Integer> unique = new HashMap<>();

        Arrays.stream(words).forEach((word-> {
            if (unique.containsKey(word)) {
                unique.put(word, unique.get(word) + 1);
            } else {
                unique.put(word, 1);
            }
        }));

        FileUtils.write(output, unique + "\nThere are " + unique.size() + " unique words.\n" +
                wordCounter("over!!!!", unique), StandardCharsets.UTF_8);
    }
}
