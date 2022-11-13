import java.util.ArrayList;
import java.util.List;

public class Test23 {
    public static void main(String[] args) {
        int n=2;
        List<String> logs = new ArrayList<>();

//        ["0:start:0","0:start:2","0:end:5","1:start:6","1:end:6","0:end:7"]
        logs.add("0:start:0");
        logs.add("0:start:2");
        logs.add("0:end:5");
        logs.add("1:start:6");
        logs.add("1:end:6");
        logs.add("0:end:7");
        Test23 t = new Test23();
        t.exclusiveTime(n,logs);

    }
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] rt = new int[n];
        //存放函数起始时间戳
        int si = 0;
        for(int i=1;i<logs.size();i++){
            String str = logs.get(i);
            String sstr = logs.get(i-1);
            int fn = str.indexOf(":");
            int tn = str.indexOf("t:");
            int dn = str.indexOf("d:");
            int sn = sstr.indexOf("t:")!=-1? sstr.indexOf("t:"):sstr.indexOf("d:");
//            int sdn = sstr.indexOf("d:");
            int j = Integer.parseInt(str.substring(0,fn));
            if(str.indexOf("s")!=-1){
                rt[j]+=Integer.parseInt(str.substring(tn+2))-Integer.parseInt(sstr.substring(sn+2));
            }
            if(str.indexOf("e")!=-1){
                rt[j]+=Integer.parseInt(str.substring(dn+2))-Integer.parseInt(sstr.substring(sn+2))+1;
            }
        }
        return rt;

    }
}
