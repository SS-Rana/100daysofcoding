import java.util.HashSet;
public class returnCommon{

    public static HashSet <Integer> retruncommon(int arr1[], int arr2[]){
        HashSet <Integer> set = new HashSet <>();
        HashSet <Integer> set1 = new HashSet <>();

        for (int x : arr1){
           set.add(x);
        }

        for (int x : arr2){
            if(set.contains(x)){
                set1.add(x);
            }
        }
        return set1;
    }
    public static void display(int arr[]){
        for( int x : arr){
            System.out.print(x+"\t");
        }
        System.out.println();
    }
    public static void main(String [] args){
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        System.out.print("Array1: ");
        display(arr1);
        System.out.print("Array2: ");
        display(arr2);
        System.out.print("Common number in both Array: "+ retruncommon(arr1, arr2));
    }
}