package akc.test02;

public class Test204 {
    public static void main(String[] args) {
        System.out.println(hf(4,3));
    }
    public static int hf(int n,int m){
        if(m==1 || m==n) return 1;
        return hf(n-1,m-1)+m*hf(n-1,m);
    }

}
