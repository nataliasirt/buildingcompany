package com.solvd.laba.buildingcompany;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


    public class FileReaderSample  {

    private static final Logger LOGGER = LogManager.getLogger(FileReaderSample.class);
    public static void main(String[] args) throws IOException {
        // read text from input.txt
        File file = new File("src//main//resources//input.txt");
        String text = FileUtils.readFileToString(file, "UTF-8");

        // split the text into words and count the unique ones
        String[] words = StringUtils.split(text);
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        int count = uniqueWords.size();

        // write the results to output.txt
        File outputFile = new File("src//main//resources//output.txt");
        FileWriter writer = new FileWriter(outputFile);
        writer.write("Number of unique words: " + count);
        writer.close();

        LOGGER.info("Number of unique words saved to output.txt");
        LOGGER.info("Number of unique words: " + count);
    }
}

