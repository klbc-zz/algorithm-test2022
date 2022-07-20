import java.util.ArrayList;
import java.util.List;

public class Test09 {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        if(n==0){
            return res;
        }
//        剩余左括号数目
//        剩余右括号数目
        recursion("",n,n,res);
        return res;

    }
    public static void  recursion(String str,int l,int r, List<String> res){
        if (r==0&&l==0){
            res.add(str);
            return;
        }
//        剪枝
        if(l>r){
            return;
        }
        if(l>0){
            recursion(str+"(",l-1,r,res);
        }
        if(r>0){
            recursion(str+")",l,r-1,res);
        }

    }
}
