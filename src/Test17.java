import java.util.ArrayList;
import java.util.List;

public class Test17 {
    public static void main(String[] args) {
        int[] nums = {3,3,1};

        System.out.println(jump(nums));
    }
    public static int jump(int[] nums) {
        // 跳转步数
        int step=0;
        for(int i=0;i<nums.length;i++){
            int max = i+1;
            int end = nums[i];
            if(max>=nums.length){break;}
            if(i+nums[i]+1>nums.length){end =nums[i]-(i+nums[i]+1-nums.length);}
            for(int j=0;j<end;j++){
                if(nums[i+j+1]>nums[max]){
                    max = i+j+1;
                }
            }
            step++;i=max-1;

        }
        return step;

    }

}
