package akc.test02;

import java.util.Arrays;

public class Test201 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,8,9};
        Arrays.sort(a);
        System.out.println(binarySearch(a,1));
    }
    public static int binarySearch(int[] a,int x){
        if(a==null||x<a[0]) return -1;
        int left=0,right=a.length-1;
        while (left<right){
            int middle = (left+right+1)/2;
            if(x==a[middle]) return middle;
            if(x<a[middle]) right=middle-1;
            else left=middle;
        }
        if(x==a[left]) return left;
        return -1;

    }

}
