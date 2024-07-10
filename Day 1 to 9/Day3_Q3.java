public class Day3_Q3 {
    static int  minElement(int arr[], int size){
        int min  = arr[0];
        for(int i=0; i<size; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
        // Time Complexity = 0(n)

    }
    static int  maxElement(int arr[], int size){
        int max  = arr[0];
        for(int i=0; i<size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
        // Time Complexity = 0(n)

    }
    public static void main(String[] args) {
        int arr[] = {45,85,69,36,45,85,69,45,15};
        int min = minElement(arr, arr.length);
        int max = maxElement(arr, arr.length);
        System.err.printf("The minimum value of array is %d\n",min);
        System.err.printf("The max value of array is %d\n",max);
        

    }
}
