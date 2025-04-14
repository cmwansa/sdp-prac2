package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}
    //Task 4
    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
        if (a.size() != b.size()) { // Check if lists are the same size 
            return null;    //If not, return null
        }

        List<Integer> result = new ArrayList<>(); // List to store the result of the multiplications

        for (int i = 0; i < a.size(); i++) {
            int product = a.get(i) * b.get(b.size() - 1 - i); // Multiply a[i] with the element from the end of b
            result.add(product);    // Add product to the result list
        }

        return result;
    }
}
