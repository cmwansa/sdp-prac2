/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

class AppTest {

    // Test when the list is sorted in ascending order
    @Test
    public void testTask5_sortedList() {
        
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5); //Create a sorted list;    
        boolean result = SimpleFunctions.Task5(sortedList); //Call Task5 with the sorted list

        assertTrue(result); //Check if list is sorted
    }

    // Test when the list is NOT sorted
    @Test
    public void testTask5_unsortedList() {
        
        List<Integer> unsortedList = Arrays.asList(5, 3, 2, 4); //Create an unsorted list 
        boolean result = SimpleFunctions.Task5(unsortedList);   //Call Task5 with the unsorted list

        assertFalse(result); //Check that the list is not sorted 
    }

    // Test when the list is empty (should be considered sorted)
    @Test
    public void testTask5_emptyList() {
        
        List<Integer> emptyList = new ArrayList<>(); //Create empty list
        boolean result = SimpleFunctions.Task5(emptyList);  //Call Task5 with the empty list

        assertTrue(result); //Check that the empty list is "sorted"
    }

    // Test when the list has all identical elements (should be considered sorted)
    @Test
    public void testTask5_identicalElements() {
        List<Integer> identicalList = Arrays.asList(5, 5, 5, 5); //Create a list with identical numbers
        boolean result = SimpleFunctions.Task5(identicalList);  //Call Task5 with the identical elements list

        assertTrue(result); //Check that the identical list is not sorted
    }
}

