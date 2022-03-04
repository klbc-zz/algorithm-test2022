import java.util.Stack;

public class Test05 {
    //给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
    //
    //有效字符串需满足：
    //
    //    左括号必须用相同类型的右括号闭合。
    //    左括号必须以正确的顺序闭合。
    //

    public static void main(String[] args) {
        System.out.println(isValid("()"));


    }
    public static boolean isValid(String s) {
        Stack<String> stack = new Stack();
        String n="",popn="";
        for (int i=0;i<s.length();i++){
            n = s.substring(i,i+1);
            if(n.equals("(")||n.equals("{")||n.equals("[")){
                stack.push(n);
            }
            if(n.equals(")")||n.equals("}")||n.equals("]")){
                popn = stack.pop();
                if (n.equals(")")){
                    if(!popn.equals("(")){
                        return false;
                    }
                }
                if (n.equals("}")){
                    if(!popn.equals("{")){
                        return false;
                    }
                }
                if (n.equals("]")){
                    if(!popn.equals("[")){
                        return false;
                    }
                }
            }
        }
        if(!stack.empty()){
            return false;
        }
        return true;

    }
}
