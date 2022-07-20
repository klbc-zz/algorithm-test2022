import java.util.*;
import java.util.stream.IntStream;
import java.util.Arrays;
public class Test07 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//        int[] both = (int[]) Arrays.copyOf(nums1,nums2);
        int[] both = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray();
//        System.
        Arrays.sort(both);
        //循环输出看
        for (int i = 0;i<both.length;i++){
            System.out.println(both[i]);
        }

        double r;
        int zhon = both.length/2;
        if(both.length%2==0){
            r = ((double) both[zhon-1]+(double)both[zhon])/2;
        }else {
            r = both[zhon];
        }
        System.out.println("r:"+r);


        return r;
    }

    public static void main(String[] args) {
        int[] n1 = {1,2,4};
        int[] n2 = {3,5};

        findMedianSortedArrays(n1,n2);


    }
}
