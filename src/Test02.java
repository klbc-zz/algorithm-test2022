import java.util.ArrayList;
import java.util.List;
/*
给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。

        给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。


 */

public class Test02 {
    public static void main(String[] args) {

        System.out.println(letterCombinations("238"));

    }
    public static List<String> letterCombinations(String digits) {

//        String[] two = {"a","b","c"};
//        String[] three = {"d","e","f"};
//        String[] four = {"g","h","i"};
//        String[] five = {"j","k","l"};
//        String[] six = {"m","n","o"};
//        String[] seven = {"p","q","r","s"};
//        String[] eight = {"t","u","v"};
//        String[] nine = {"w","x","y","z"};
        List<String> re = new ArrayList<>();
        if(digits.equals("")) return re;
        String[] num = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        //System.out.println(digits.substring(0,1));
        int n = Integer.parseInt(digits.substring(0,1));

        if(digits.length()>1){
            for (int i=0;i< num[n-2].length();i++){
                for (String j : letterCombinations(digits.substring(1))){
                    re.add(num[n-2].substring(i,i+1)+j);
                }
            }

        }else if(digits.length()==1){
            for (int z=0;z< num[n-2].length();z++){
                re.add(num[n-2].substring(z,z+1));
            }
        }

        return re;



    }
}
