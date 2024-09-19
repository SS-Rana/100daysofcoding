public class Day16_Q4 {
    public static boolean isSorted(int arr[], int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]<arr[index + 1]){
            return isSorted(arr, index+1);
        }
        else{
            return false;
        }
    }
    public static void printArray(int arr[]){
        System.out.print("The array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main (String [] args){
        int arr1[] = {1,2,3,4,5,6,7,8};
        int arr2[] = {1,2,3,3,4,5};
        printArray(arr1);
        if(isSorted(arr1, 0)){
            System.out.println("The array is strictly increasing");
        }
        else{
            System.out.println("The array  is not strictly increasing");
        }
        printArray(arr2);
        if(isSorted(arr2, 0)){
            System.out.println("The array is strictly increasing");
        }
        else{
            System.out.println("The array is not strictly increasing");
        }
    }
}
