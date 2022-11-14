package akc.test02;

import java.util.Collection;

import static java.util.Collections.copy;

public class MergeSort {

    public static void main(String[] args) {
//
        Comparable[] a = {2,1,2,5,7,34,4,2,1,5};
        mergeS(a);
        for(int i=0;i<a.length;i++) System.out.print(a[i]+" ");
    }
    public static void mergeS(Comparable []a){
        Comparable []b =new Comparable[a.length];
        int s =1;
        while (s<a.length){
            mergePass(a,b,s);
            s+=s;
            mergePass(b,a,s);
            s+=s;

        }

    }
    public static void mergeSD(Comparable []a,int left,int right){
        if(left<right){
            int i=(left/right)/2;
            mergeSD(a,left,i);
            mergeSD(a,i+1,i);
//            merge(a,b,left,i,right);
        }

    }

    public static void mergePass(Comparable [] x,Comparable [] y,int s){
        int i=0;
        while (i<=x.length-2*s){
            merge(x,y,i,i+s-1,i+2*s-1);
            i=i+2*s;
        }
        if(i+s<x.length){
            merge(x,y,i,i+s-1,x.length-1);
        }else for(int j=i;j<x.length;j++) y[j]=x[j];
    }
    public static void merge(Comparable []c ,Comparable []d,int l,int  m,int r){
        int i=l, j=m+1,k=l;
        while ((i<=m)&&(j<=r)){
            if(c[i].compareTo(c[j])<=0){
                d[k++]= c[i++];
            }else d[k++]=c[j++];

        }
        if(i>m)
            for(int q=j;q<=r;q++) d[k++] = c[q];
        else for(int q=i;q<=m;q++) d[k++]= c[q];

    }

}
