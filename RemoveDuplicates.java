
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        int[] arr={4,5,6,2,7,4,2,7};
        Set<Integer> set=new LinkedHashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
    }
}
