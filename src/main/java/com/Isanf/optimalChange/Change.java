package com.Isanf.optimalChange;

import java.util.*; 
import java.math.*; 

// Do not modify Change 
class Change { 
    long coin2 = 0; 
    long bill5 = 0; 
    long bill10 = 0; 

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Change change = (Change) obj;
        return coin2 == change.coin2 && bill5 == change.bill5 && bill10 == change.bill10;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coin2, bill5, bill10);
    }

    @Override
    public String toString() {
        return "Change{" + "coin2=" + coin2 + ", bill5=" + bill5 + ", bill10=" + bill10 + '}';
    }
} 