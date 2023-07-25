import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {3,4,5,6,2};
        List intersection = new ArrayList();
        // is the array sorted.
        //
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println("arr1: "+Arrays.toString(arr1));
        System.out.println("arr2: "+Arrays.toString(arr2));
        int j = 0;
        for(int i=0;i < arr1.length && j < arr2.length; i++) {
            int num = arr1[i];
            while(j < arr2.length && num > arr2[j]) {
                j++;
            }
            if(j < arr2.length && num == arr2[j]) {
                intersection.add(num);
            }
        }

        System.out.println(intersection);
    }
}
