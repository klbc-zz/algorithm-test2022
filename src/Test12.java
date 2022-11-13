
import java.util.Arrays;

public class Test12 {
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        nextPermutation(nums);
//        System.out.println(nums[-1]);
        for (int i=0;i<nums.length;i++){
            System.out.println("i="+nums[i]);
        }
    }
    public static void nextPermutation(int[] nums) {
        boolean isC  = false;
//        用于指定
        int p = 0;
//        往前进行比较，比较至该位小于后面一位的数
        int q = nums.length-1;
        //然后使用该位进行查找后面比它大的数，有则提出来做第一位，无则直接将后面几位进行排序
        while (q!=0){
//            if(nums[p]<nums[i]){
//                isNotMax = true;
//            }
//            p++;
            if(nums[q-1]<nums[q]){
                q--;
                isC = true;
                break;
            }
            q--;
        }
        if(isC){
            for(int i=nums.length-1;i>q;i--){
                if(nums[q]<nums[i]){
//                交换
                    int z = nums[q];
                    nums[q] = nums[i];
                    nums[i] = z;
                    break;
                }
            }
            Arrays.sort(nums,q+1,nums.length);
        }else {
            Arrays.sort(nums,q,nums.length);
        }






//        if(isNotMax){
//            int z = nums[nums.length-1];
//            nums[nums.length-1] = nums[nums.length-2];
//            nums[nums.length-2] = z;
//
//        }else {
//        在第N位以后从小到大排序，注意不是下标为N:Arrays.sort(num,N,num.length);
//            Arrays.sort(nums);
//        }



    }

}
