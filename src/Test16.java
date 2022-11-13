import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test16 {
    public static void main(String[] args) {
        int[] a = {2,4,2,2,1,1};
        combinationSum2(a,6);
    }
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {

        Arrays.sort(candidates);
        List<List<Integer>> re = new ArrayList<>();
        List<Integer> item = new ArrayList<>();
        //本题采用回溯算法加剪枝
        dfs(re,candidates,target,item,0);

        return re;
    }
    public static void dfs(List<List<Integer>> re,int[] c, int target,List<Integer> item,int begin){
        if(target==0){
            //判断所有数是否还小于target
            boolean isbig =true;
            List<Integer> ri = new ArrayList<>(item);
            for(List<Integer> i:re){
                if(i.containsAll(ri)){
                    isbig=false;
//                    i.equals()
                }
            }
            if(isbig){ re.add(ri);}
            item.remove(item.size()-1);
            return;
        }else if(target<0){
            item.remove(item.size()-1);
            return;
        }

        for(int i=begin;i<c.length;i++){

            if(target>=c[i]){
                item.add(c[i]);

                dfs(re,c,target-c[i],item,i+1);
            }
        }
        if(item.size()>0){
            item.remove(item.size()-1);
        }




    }
}
