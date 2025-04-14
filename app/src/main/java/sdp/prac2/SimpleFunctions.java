package sdp.prac2;

import java.util.*;

public class SimpleFunctions {
    public SimpleFunctions() {}

    public int task1 (int [] a, int [] b){
    int sum = 0;
    for (int i = 0; i < b.length; i++) {
        int index = b[i];
        if (index < a.length) {
        sum += a[index];
        }
    } 
    return sum;
    }
}
