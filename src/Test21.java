import java.util.*;

public class Test21 {
    public static void main(String[] args) {
        Test21 t = new Test21();
        String[] strs ={"eat", "tea", "tan", "ate", "nat", "bat"};
//        Arrays.sort(strs);
        t.groupAnagrams(strs);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> rt = new ArrayList<>();
        List<String> ri = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<String, List<String>>();
//        String cp = strs[0];
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            char[] array = str.toCharArray();
            Arrays.sort(array);

//            map.put(array.toString(),str);
//            boolean isC = true;
//            for(int z=0;z<strs[j].length();z++){
//                if(!cp.contains(strs[j].substring(z,z+1))){
//                    isC = false;
//                    break;
//                }
//            }
//            if(isC){
//                ri.add(strs[j]);
//            }else {
//                cp = strs[j];
//                List<String> rs = new ArrayList<>(ri);
//                rt.add(rs);
//                ri.clear();
//            }
        }

        return rt;

    }

}
