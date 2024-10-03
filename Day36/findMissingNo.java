import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;

public class findMissingNo{
    public static HashSet <Integer> findMissingNo(int arr[]){
        HashSet <Integer> set= new HashSet <> (Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        
        for (int x : arr){
            if(set.contains(x)){
                set.remove(x);
            }
        }
        return set;
    }
    public static void main(String[] args){
           int[] arr = {1, 2, 3, 5, 7}; 
        HashSet<Integer> missingNumbers = findMissingNo(arr);
        
        System.out.println("Missing numbers: " + missingNumbers);
    }
}