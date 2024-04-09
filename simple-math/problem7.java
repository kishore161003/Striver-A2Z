
import java.util.ArrayList;
import java.util.Arrays;
public class problem7 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        Integer[] array = arrayList.toArray(new Integer[arrayList.size()]);
        
        System.out.println(Arrays.toString(array));

        // convert array to arraylist

        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(array));
        System.out.println(arrayList2);
    }
    
}
