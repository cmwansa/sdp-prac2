package sdp.prac2;
import java.util.ArrayList;
import java.util.List;

public class SimpleFunctions {
    // public SimpleFunctions() {}

    //Task 2
    public static List<String> Task2(List<String> lst){
        
        List<String> result = new ArrayList<>();
        
        //loop through list of elemets and remove first character
        for (String s : lst){
            if (s.length()> 1){
                result.add(s.substring(1));
                //if string has more than two characters remove the first and append to result
                //if the input string s is one character the output will be empty thus removing from output
            }

        }return result;

    }
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
    public static List<Integer> Task6(List<Integer> numbers) {
        // Create a new list to store the rounded numbers
        List<Integer> roundedNumbers = new ArrayList<>();

        // Iterate through each number in the input list
        for (Integer num : numbers) {
            // Check if the number is already a multiple of 100
            if (num % 100 == 0) {
                // If yes, add it directly to the new list
                roundedNumbers.add(num);
            } else {
                // Otherwise, round it up to the next multiple of 100
                int rounded = ((num / 100) + 1) * 100;
                roundedNumbers.add(rounded);
            }
        }

        // Return the new list
        return roundedNumbers;
    }
}
