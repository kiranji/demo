import java.util.ArrayList;
import java.util.List;


public class hhh {
    public static List<Integer> findDuplicates(int[] arr)
    {
        List<Integer> duplicates = new ArrayList<>();
        int n = arr.length;

        // First check all the values that are present in
        // the array then go to those values as indices and
        // increment by the size of the array
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }

        // Now check which value exists more than once by
        // dividing with the size of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] / n >= 2) {
                duplicates.add(i);
            }
        }
        return duplicates;
    }

    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, 4 ,3};

        System.out.println("The repeating elements are: ");
        List<Integer> ans = findDuplicates(arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
