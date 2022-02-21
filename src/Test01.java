import java.util.ArrayList;
import java.util.List;
/*
   15.三数之和
        给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
        使得 a + b + c = 0 ？请你找出所有和为 0 且不重复的三元组。
        注意：答案中不可以包含重复的三元组。

 */
public class Test01 {
    public static void main(String[] args) {
        List<List<Integer>> zeronums = new ArrayList<>();
        int[] nums =  {-1,0,1,2,-1,-4};
        if(nums.length<3||nums==null){
//            return zeronums;
        }
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                for (int k=j+1;k<nums.length;i++) {
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> zeronum = new ArrayList<>();
                        zeronum.add(nums[i]);
                        zeronum.add(nums[j]);
                        zeronum.add(nums[k]);
                        zeronums.add(zeronum);
                    }

                }

            }



        }
        System.out.println(zeronums);


    }
}
