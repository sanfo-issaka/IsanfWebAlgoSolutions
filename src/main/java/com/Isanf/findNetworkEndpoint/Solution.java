package com.Isanf.findNetworkEndpoint;

import java.io.PrintStream;
import java.util.*;

class Solution { 
    public static int findNetworkEndpoint(int startNodeId, int[] fromIds, int[] toIds) { 
        Map<Integer, Integer> network = new HashMap<>();
        for (int i = 0; i < fromIds.length; i++) {
            network.put(fromIds[i], toIds[i]);
        }
        
        Set<Integer> visited = new HashSet<>();
        int currentNode = startNodeId;
        
        while (!visited.contains(currentNode) && network.containsKey(currentNode)) {
            visited.add(currentNode);
            currentNode = network.get(currentNode);
        }
        
        return currentNode;
    } 

    /* Ignore and do not change the code below */ 
    public static void main(String args[]) { 
        Scanner in = new Scanner(System.in); 
        int startNodeId = in.nextInt(); 
        int n = in.nextInt(); 
        int[] fromIds = new int[n]; 
        for (int i = 0; i < n; i++) { 
            fromIds[i] = in.nextInt(); 
        } 
        int[] toIds = new int[n]; 
        for (int i = 0; i < n; i++) { 
            toIds[i] = in.nextInt(); 
        } 
        PrintStream outStream = System.out; 
        System.setOut(System.err); 
        int endPointId = findNetworkEndpoint(startNodeId, fromIds, toIds); 
        System.setOut(outStream); 
        System.out.println(endPointId); 
    } 
    /* Ignore and do not change the code above */ 
}

