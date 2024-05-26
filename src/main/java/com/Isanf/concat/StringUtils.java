package com.Isanf.concat;

class StringUtils { 
    /** 
     * Concatenates the given array of strings. 
     */ 
    static String concat(String[] strings) { 
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    } 
}

