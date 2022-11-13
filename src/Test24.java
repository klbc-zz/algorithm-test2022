public class Test24 {
    public static void main(String[] args) {
        Test24 t =new Test24();
//        t.solveEquation("x+5=6");
        System.out.println(t.solveEquation("x+5-3+x=6+x-2"));
    }
    public static int[] xnm(String sstr,int xn,int nn){
        if(sstr.indexOf("x")!=-1){
            String xr = sstr.substring(0,sstr.indexOf("x"));
            if(sstr.length()>1&&!xr.equals("-")){
                int n=Integer.parseInt(sstr.substring(0,sstr.indexOf("x")));
                xn = xn+n;
            }
            else if(sstr.length()>1&&xr.equals("-")){
                xn = xn-1;
            }
            else{
                xn = xn+1;
            }
        }else if(sstr.length()>0){
            int n=Integer.parseInt(sstr);
            nn = nn+n;
        }
        return new int[]{xn,nn};
    }
    public String solveEquation(String equation) {
        int xn = 0;
        int nn = 0;
        boolean isright = false;
        //分割1字符串的起始位
        int strf = 1;
        // equation = equation.replaceAll("-","\\+-");
        int d = equation.indexOf("=");
        String equa = "+"+equation.substring(0,d);
        String tion = "+"+equation.substring(d+1);
        tion = tion.replaceAll("\\-","\\+-").replaceAll("\\+","\\+-").replaceAll("\\+--","\\+");
        equation = equa.replaceAll("-","\\+-") +tion;
        System.out.println(equation);
        for(int i=1;i<equation.length();i++){
            char s = equation.charAt(i);
//            char r = equation.charAt(i+1);
            if(s=='+'){
                String sstr = equation.substring(strf,i);
                int [] rt = xnm(sstr,xn,nn);
                xn =rt[0];nn=rt[1];
                strf = i+1;
            }
            if(i==equation.length()-1){
                String sstr = equation.substring(strf,i+1);
                if(sstr.indexOf("x")!=-1){
                    if(sstr.length()>1){
                        int n=Integer.parseInt(sstr.substring(0,sstr.indexOf("x")));
                        xn = xn+n;
                    }else{xn = xn+1;}
                }else{
                    int n=Integer.parseInt(sstr);
                    nn = nn+n;
                }
            }
        }
        if(xn==0){return "Infinite solutions";}
        return "x="+nn/xn;

    }
}
