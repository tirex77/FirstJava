package com.akolesnik.FirstJava;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);
    private static final String FILENAME = "README.md";

    public static void main(String[] args) {
        logger.info("App started!");
        logger.debug("Message for debug level.");

        try {
            Files.readAllBytes(Paths.get(FILENAME));
        } catch (IOException ioex) {
            logger.error("Failed to read file {}.", FILENAME, ioex);
        }

	    Person p = new Person();
	    Person ivan = new Person("Ivan", "Ivanov");
	    System.out.println(p);
        System.out.println(ivan);
    }
}
