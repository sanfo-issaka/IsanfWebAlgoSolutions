package com.Isanf.locateUniverseFormula;

import java.io.File;

class A { 
    /** 
     * Locates the universe-formula file. 
     * @return the absolute path to the universe-formula file or null if not found.
     */ 
    static String locateUniverseFormula() { 
        File root = new File("/tmp/documents");
        return findFile(root, "universe-formula");
    }
    
    private static String findFile(File directory, String fileName) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    String result = findFile(file, fileName);
                    if (result != null) {
                        return result;
                    }
                } else if (file.isFile() && file.getName().equals(fileName)) {
                    return file.getAbsolutePath();
                }
            }
        }
        return null;
    }
}