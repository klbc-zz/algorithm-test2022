import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test03 {
    public static void main(String[] args) {
        int[] a = {2,2,2,2};
        System.out.println(fourSum(a,8));

    }
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> re = new ArrayList<>();
        int l2,r2;
        if(nums.length<4) return re;
        Arrays.sort(nums);

        for(int i=0;i< nums.length-3;++i){
            // 由于nums[i]对应的元素值已经枚举过了，不需要再次枚举了
            if(i>0&&nums[i]==nums[i-1]) continue;
            for (int j=i+1;j<nums.length-2;++j){
                // 由于nums[i]对应的元素值已经枚举过了，不需要再次枚举了
                if(j>i+1&&nums[j]==nums[j-1]) continue;
                l2=j+1;
                r2=nums.length-1;
                while (l2<r2){
                    int t2 = nums[i]+nums[j]+nums[l2]+nums[r2];
                    if(t2==target){
                        List<Integer> num = new ArrayList<>();
                        num.add(nums[i]);
                        num.add(nums[l2]);
                        num.add(nums[j]);
                        num.add(nums[r2]);
                        re.add(num);
                        //去重
                        l2++;
                        r2--;
                        while (l2<r2 && nums[l2] == nums[l2-1]) l2++;
                        while (l2<r2 && nums[r2] == nums[r2+1]) r2--;

                    }
                    else if (t2>target){
                        r2--;
                    }
                    else if (t2<target){
                        l2++;
                    }

                }
            }
        }


        return re;

    }



}
