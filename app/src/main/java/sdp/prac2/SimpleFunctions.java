package sdp.prac2;
import java.util.ArrayList;
import java.util.List;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public static int task1 (int [] a, int [] b){
    int sum = 0;
    //created for loop to iterate through list b(indices)
    for (int i = 0; i < b.length; i++) {
        int index = b[i];

    //check if the current item of list b is in list a
        if (index < a.length) {
    //sums the specific number
        sum += a[index];
        }
    } 
    //returns the sum of all elements in list a that correspond with list b
    return sum;
    }
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


    //Task3
    public static boolean Task3(String text){
        boolean check = false; //check variable for if the string has a matching set of brackets or not
        int count = 0; //counts the number of brackets. must be 0 to indicate a balance in opening and closing brackets.

        for (int x = 0; x < text.length();x++){
            if (text.charAt(x) == '('){
                count++;
                check = true;
            } else{
                if (text.charAt(x) == ')'){
                    count--;
                    check = true;

                    if (count < 0){ //if count is negative, then there is an unmatched closing bracket 
                        return false;
                    } 
                }
            }
        }

       
        return (check == true && count == 0);   //indicates that a string has brackets AND that they are matched
    }

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
