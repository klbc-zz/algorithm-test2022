public class Test22 {
    public static void main(String[] args) {
        Test22 m = new Test22();
        m.myPow(2.00000 ,-2147483648);
    }
    public double myPow(double x, int n) {
        if(x == x*x){return x;}
        if(n>0){
            double y = x;
            for(int i=1;i<n;i++){
                x= x*y;
            }
        }else if(n<0){
            double y = x;
            if(-n>1000){return 0*x;};
            for(int i=-1;i<-n;i++){
                x= x/y;
            }
        }else{x = x/x;}
        return x;
    }
}
