package sdp.prac2;
import java.lang.Comparable;
import java.util.*;

public class SimpleFunctions {
    // public SimpleFunctions() {}

    public static <T extends Comparable<T>> boolean Task5 (List<T> lst) {
        // A loop that will iterate through the list
        for (int i =0; i < lst.size() - 1; i++) {
            // Checking if the item in the current index is smaller than the item at index + 1...
            // If not, return false
            if (lst.get(i).compareTo(lst.get(i + 1)) > 0)
                return false;
        }
        // if the list is sorted, it will return true
        return true;
    }
}
