import java.math.*;
import java.math.BigInteger;
import java.util.*;

import static java.lang.Math.pow;

public class Test {
    public static void main(String[] args) {

        Test t =new Test();
        String s = "i love eating burger a";
        t.isPrefixOfWord(s,"burg");
        List<Integer> nl = new ArrayList<>();

    }
    public int climbStairs(int n) {

        int rt = 0;
        if(n>2){
            rt += climbStairs(n-1);
            rt += climbStairs(n-2);
        }
        if(n==2){rt+=2;}
        if(n==1){rt+=1;}
        return rt;
    }
    public int isPrefixOfWord(String sentence, String searchWord) {
        int l = -1;
        int rt = 0;
        boolean ispt = false;
        sentence = sentence + " ";
        for(int i=0;i<sentence.length();i++){
            if(sentence.charAt(i)=='c'){
                boolean isp = false;
                if(sentence.substring(l+1,i).length()>=searchWord.length()){
                    for(int j=0;j<searchWord.length();j++){
                        if(sentence.charAt(l+1+j)==searchWord.charAt(j)){
                            isp = true;
                        }else{
                            isp =false;
                            break;
                        }
                    }
                }
                l = i;
                rt++;
                if(isp){
                    ispt =true;
                    break;
                }

            }
        }
        if(ispt){return rt;}
        return -1;
    }


}
