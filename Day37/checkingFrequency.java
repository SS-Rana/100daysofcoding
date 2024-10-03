import java.util.HashMap;

public class checkingFrequency {
    
    public static HashMap<Integer, Integer> checkingFrequency(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        return map;
    }
    
    public static void main(String[] args) {
        int arr[] = {12, 45, 78, 36, 25, 78, 12, 45, 36, 45, 22, 15, 35};

        System.out.println("Original array:");
        for (int x : arr) {
            System.out.print(x + "\t");
        }
        System.out.println();
        
        HashMap<Integer, Integer> map = checkingFrequency(arr);
        
        System.out.println("Frequency of elements:");
        for(HashMap.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
        System.out.println();
    }
}
