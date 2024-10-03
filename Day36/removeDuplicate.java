import java.util.HashSet;
public class removeDuplicate{

    public static HashSet <String> removeDuplicate(String[] words){
        HashSet <String> set = new HashSet <> ();
        for (String x : words){
                set.add(x);
        }
        return set;
    }
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "apple", "orange", "banana"};
        System.out.print("The words: ");
        for(String x : words){
            System.out.print(x+" ");
        }
        System.out.println();

        System.out.println("The unique words: "+ removeDuplicate(words));
    }
} 