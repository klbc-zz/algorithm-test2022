import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test18 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        permute(nums);
    }
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> rt = new ArrayList<>();
        List<Integer> ri= new ArrayList<>();
        List<Integer> zn= new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            zn.add(nums[i]);
        }
        dfs(rt,ri,zn,nums);
        return rt;

    }
    //n为返回的数组的某一下标
    public static void dfs(List<List<Integer>> rt,List<Integer> ri,List<Integer> zn,int[] nums){
//        if(n==-1){
//            for(int i=0;i<nums.length;i++){
//                dfs(rt,ri,zn,nums,i);
//            }
//        }
        if(zn.size()==1){
            ri.add(zn.get(0));
            List<Integer> rzn= new ArrayList<>(ri);
            rt.add(rzn);
            ri.remove(ri.size()-1);
            return;
        }
        for(int i=0;i<zn.size();i++){
            int q = zn.get(i);
            zn.remove(i);
            ri.add(q);
            dfs(rt,ri,zn,nums);
            ri.remove(ri.size()-1);
            zn.add(i,q);
        }
    }
}
