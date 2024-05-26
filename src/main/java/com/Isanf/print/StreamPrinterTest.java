package com.Isanf.print;

import static org.junit.Assert.*;
import java.io.StringReader;
import java.io.IOException;
import java.io.Reader;

import org.junit.Test;

public class StreamPrinterTest {

    @Test
    public void testPrintNormal() throws IOException {
        StringReader reader = new StringReader("Hello, World!");
        StreamPrinter printer = new StreamPrinter();
        
        // Redirect stdout to capture the output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        
        printer.print(reader);
        
        assertEquals("Hello, World!", outContent.toString());
    }

    @Test
    public void testPrintEmpty() throws IOException {
        StringReader reader = new StringReader("");
        StreamPrinter printer = new StreamPrinter();
        
        // Redirect stdout to capture the output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        
        printer.print(reader);
        
        assertEquals("", outContent.toString());
    }

    @Test
    public void testPrintSpecialCharacters() throws IOException {
        StringReader reader = new StringReader("Hello\nWorld!\tTest");
        StreamPrinter printer = new StreamPrinter();
        
        // Redirect stdout to capture the output
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));
        
        printer.print(reader);
        
        assertEquals("Hello\nWorld!\tTest", outContent.toString());
    }

    @Test
    public void testPrintWithException() {
        Reader reader = new Reader() {
            private boolean readOnce = false;
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                if (!readOnce) {
                    readOnce = true;
                    return "Hello".length();
                } else {
                    throw new IOException("Simulated IO exception");
                }
            }
            @Override
            public void close() throws IOException {
                // No-op
            }
        };
        
        StreamPrinter printer = new StreamPrinter();
        
        // Redirect stderr to capture the output
        java.io.ByteArrayOutputStream errContent = new java.io.ByteArrayOutputStream();
        System.setErr(new java.io.PrintStream(errContent));
        
        try {
            printer.print(reader);
            fail("Expected an IOException to be thrown");
        } catch (IOException e) {
            assertEquals("Simulated IO exception", e.getMessage());
        }
        
        assertTrue(errContent.toString().contains("Error reading from reader: Simulated IO exception"));
    }
}

