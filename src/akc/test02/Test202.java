package akc.test02;

public class Test202 {
    int[][] board =new int[1][1];
    public static void main(String[] args) {

    }
    public  void chessBoard(int tr,int tc,int dr,int dc, int size){
        if(size==1) return;
//        int t = t++;
        int s = size/2;
//        覆盖左上角子棋盘
        if(dr<tr+s&&dc<tc+s) chessBoard(tr,tc,dr,dc,s);//特殊方格在此棋盘中
        else {
//            此棋盘无特殊方格
//            board[tr+s-1][tc+s-1]=t;
//            覆盖其余方格
            chessBoard(tr,tc,tr+s-1,tc+s-1,s);

        }



    }
}
