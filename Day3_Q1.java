public class Day3_Q1 {

        public static void main(String[] args) {
            int arr[]={23,1,67};
            
            boolean flag=false;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]>arr[i]){
                flag=true;
            }
            else{
                flag = false;
                break;
            }
           
        }
        if(flag){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }
        // Best Case = Ω(1)
        // Worst Case = o(n) n---> array length
}

}
