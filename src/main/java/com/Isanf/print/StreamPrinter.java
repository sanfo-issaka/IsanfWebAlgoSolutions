package com.Isanf.print;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

class StreamPrinter { 
    /** 
     * Reads from the given reader and prints to stdout. 
     */ 
    void print(Reader reader) throws IOException { 
        try (BufferedReader bufferedReader = new BufferedReader(reader)) {
            int code;
            while ((code = bufferedReader.read()) != -1) {
                System.out.print((char) code); 
            }
        } catch (IOException e) {
            System.err.println("Error reading from reader: " + e.getMessage());
            throw e; // Re-throw the exception to signal that an error occurred
        }
    } 
}

