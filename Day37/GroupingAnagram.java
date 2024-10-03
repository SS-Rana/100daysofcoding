import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
public class GroupingAnagram {

    public static HashMap <String , String> GroupingAnagram(String [] words) {
        HashMap <String , String> map = new HashMap<>();

        for (String x : words) {
           char arr[] = x.toCharArray();
           Arrays.sort(arr);
           String temp = new String(arr);
           if(map.containsKey(temp)){
                map.put(temp, map.get(temp)+ " " + x);
           }
           else{
                map.put(temp, x);
           }
        }
        return map;
    }
    public static void main(String[] args) {
        String words [] =  {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.print("The Words: ");
        for (String x : words){
            System.out.print(x+ " ");
        }
        System.out.println();
        HashMap <String , String> map = GroupingAnagram(words);
       
        System.out.println("The Anagram words : ");
         for (String value : map.values()) {
            System.out.println(value);
        }
    }
}