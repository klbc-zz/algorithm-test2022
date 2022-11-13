import java.util.*;

public class Test19 {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        permuteUnique(nums);
        String s ="dsa";
        s.length();
        s.substring(0);
        char[] a = s.toCharArray();
        Arrays.sort(a);
        a.toString();
//        s.equals();
        Map<Integer, String> map = new HashMap<>();
        List<String> mapValueList = new ArrayList<String>(map.values());

    }
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> rt = new ArrayList<>();
        List<Integer> ri= new ArrayList<>();
        List<Integer> zn= new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            zn.add(nums[i]);

        }
        dfs(rt,ri,zn,nums,0);
        return rt;

    }
    //n为返回的数组的某一下标
    public static void dfs(List<List<Integer>> rt,List<Integer> ri,List<Integer> zn,int[] nums,int n){
        if(n>0&&nums[n]==nums[n-1]){return;}
        if(zn.size()==1){
            ri.add(zn.get(0));
            List<Integer> rzn= new ArrayList<>(ri);
            rt.add(rzn);
            ri.remove(ri.size()-1);
            return;
        }

        for(int i=0;i<zn.size();i++){
            // if(i>)
            int q = zn.get(i);
            zn.remove(i);
            ri.add(q);
            dfs(rt,ri,zn,nums,i);
            ri.remove(ri.size()-1);
            zn.add(i,q);
        }
    }
}
