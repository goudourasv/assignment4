import acm.program.ConsoleProgram;

import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class NameCounts extends ConsoleProgram {
    private static final String SENTINEL = "";
    private Map<String, Integer> namesEntered = new HashMap<String, Integer>();

    public void run() {
        while (true) {
           String name = readLine("Enter Name: ");

           if (name.equals(SENTINEL)) {
               break;
           }
           if (!namesEntered.keySet().contains(name)) {
                namesEntered.put(name,1);
           }else {
               Integer newCount = namesEntered.get(name) + 1;
               namesEntered.put(name,newCount);
           }
        }
        printNames();

    }

    private void printNames() {
        for (String key : namesEntered.keySet()) {
            println("Entry " + key + " has counts " + namesEntered.get(key));
        }
    }
}



