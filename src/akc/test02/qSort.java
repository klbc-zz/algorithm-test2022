package akc.test02;

public class qSort {
    static Comparable[] a;
    public static void main(String[] args) {
        a = new Comparable[]{2, 1, 2, 5, 7, 34, 4, 2, 1, 5};
        qS(0,a.length-1);
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
    }
    public static void qS(int p,int r){
        if(p<r){
            int q = partition(p,r);
            qS(p,q-1);
            qS(q+1,r);
        }

    }
    private static int partition (int p,int r){
        int i=p,j=r+1;
        Comparable x=a[p];
        while (true){
            while (a[++i].compareTo(x)<0&&i<r);
            while (a[--j].compareTo(x)>0);
            if(i>=j) break;
            swap(a,i,j);
        }
        a[p]=a[j];
        a[j]=x;
        return j;
    }
    public static void swap(Comparable[] a,int i,int j){
        Comparable s = a[i];
        a[i] = a[j];
        a[j] = s;

    }
}
