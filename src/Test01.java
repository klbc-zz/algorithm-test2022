
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
   15.三数之和
        给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
        使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
        注意：答案中不可以包含重复的三元组。

 */
public class Test01 {
    public static void main(String[] args) {

        int[] nums =  {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));


    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> zeronums = new ArrayList<>();

        if(nums.length<3||nums==null){
            return zeronums;
        }
        int maxnum = nums[0]; ;
        //冒泡排序
        for (int i=0;i<nums.length;i++) {
            for (int j=0;j<nums.length-i-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j + 1] = temp;
                }
            }
        }
        int leftp,rightp;
        //Arrays.sort();


        for (int i=0;i<nums.length;i++) {
            leftp = i+1;
            rightp = nums.length-1;
            if(nums[i]>0){
                break;
            }

            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }

            while (leftp<rightp){
            //for (int j=0;j<nums.length-i-1;j++) {
                int sum = nums[leftp]+nums[rightp]+nums[i];
                if(rightp==leftp){
                    break;
                }
                if(sum==0){


                    List<Integer> zeronum = new ArrayList<>();
                    zeronum.add(nums[i]);
                    zeronum.add(nums[leftp]);
                    zeronum.add(nums[rightp]);
                    zeronums.add(zeronum);
                    //去重
                    while (leftp<rightp && nums[leftp] == nums[leftp+1]) leftp++;
                    while (leftp<rightp && nums[rightp] == nums[rightp-1]) rightp--;
                    leftp++;
                    rightp--;

                }
                if(sum>0){
                    rightp--;
                }else if (sum<0){
                    leftp++;
                }




            }


        }
        return zeronums;


    }
}
