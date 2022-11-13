public class Test25 {
    public String longestPalindrome(String s) {
        int[] rt = {0,0};
        for(int i=0;i<s.length();i++){
            int[] dp = {i,i};
            int l=i-1;int r=i+1;
            while(l>=0&&r<s.length()){
                if(s.charAt(l)==s.charAt(r)){
                    dp[0] = l;dp[1] = r;
                }
                l--;r++;
            }
            if(dp[1]-dp[0]>rt[1]-rt[0]){
                rt[0]=dp[0];rt[1]=dp[1];
            }
            if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
                dp[0]=i; dp[1]=i+1;
                l=i-1; r=i+2;
                while(l>=0&&r<s.length()){
                    if(s.charAt(l)==s.charAt(r)){
                        dp[0] = l;dp[1] = r;
                    }
                    l--;r++;
                }
                if(dp[1]-dp[0]>rt[1]-rt[0]){
                    rt[0]=dp[0];rt[1]=dp[1];
                }

            }



        }
        return s.substring(rt[0],rt[1]+1);
    }

    public static void main(String[] args) {
        Test25 t =new Test25();
        t.longestPalindrome("babsssssdad");
    }
}
