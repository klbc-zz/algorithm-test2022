import java.util.ArrayList;
import java.util.List;

public class Test15 {
    public static void main(String[] args) {
        int[] a = {2,3,6,7};
        combinationSum(a,7);

    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> re = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        //本题采用回溯算法加剪枝
        dfs(re,candidates,target,item,0);
        return re;

    }
    public static void dfs(List<List<Integer>> re,int[] c, int target,List<Integer> item,int begin){
        if(target==0){
            List<Integer> ri = new ArrayList<>();
            for(Integer i : item){
                ri.add(i);
            }
            re.add(ri);
            item.remove(item.size()-1);
            return;
        }else if(target<0){
            item.remove(item.size()-1);
            return;
        }
        //判断所有数是否还小于target
        boolean isbig =true;
        for(int i=begin;i<c.length;i++){
            if(target>=c[i]){
                isbig =false;
                item.add(c[i]);
                dfs(re,c,target-c[i],item,i);
            }
        }
        //剪枝
        if(item.size()>0){
            item.remove(item.size()-1);
        }

    }
}
