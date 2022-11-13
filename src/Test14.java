import java.util.*;

public class Test14 {
    public static void main(String[] args) {
        countAndSay(4);

    }
    public static String countAndSay(int n ) {
        String str = "1";
        if(n==1){
            return str;
        }
        str =  says(n,str);
        return str;


    }
    public static String  says(int n,String str){
        if(n>0){
            //用于计数每个连续的数的个数
            int k = 0;
            //用于判断连续的数
            char c = str.charAt(0);
            //存取连续的数与个数
//            Map<Character,Integer> map = new LinkedHashMap<>();
            List<Character> listc = new ArrayList<>();
            List<Integer> listi = new ArrayList<>();

            for(int i=0;i < str.length();i++) {
//                System.out.println(str.charAt(i));
                if(c==str.charAt(i)){
                    k++;
                }else {
                    listc.add(c);
                    listi.add(k);
                    c=str.charAt(i);
                    k=1;
                }
            }
            if(c==str.charAt(str.length()-1)){
                listc.add(c);
                listi.add(k);
            }
            str = "";
            for (int i=0;i<listc.size();i++) {
//                System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
                str += listi.get(i).toString()+listc.get(i).toString();
            }
            System.out.println(str);
            return says(--n,str);
        }
        return str;

    }
}
