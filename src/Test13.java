import java.util.HashMap;

public class Test13 {
    public boolean isValidSudoku(char[][] board) {
// 用于分别遍历各个块
        int x=0,y=0;
        for(int i=0;i<board.length;i++){
            HashMap<Character, Boolean> sites = new HashMap<Character, Boolean>();
            HashMap<Character, Boolean> sites2 = new HashMap<Character, Boolean>();
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]!='.'){
                    if(sites.containsKey(board[i][j])){
                        return false;
                    }
                    sites.put(board[i][j],true);

                }
                if(board[j][i]!='.'){
                    if(sites2.containsKey(board[j][i])){
                        return false;
                    }
                    sites2.put(board[j][i],true);
                }

            }
            HashMap<Character, Boolean> sites3 = new HashMap<Character, Boolean>();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(board[j+y][k+x]=='.'){
                        continue;
                    }
                    if(sites.containsKey(board[j+y][k+x])){
                        return false;
                    }
                    sites.put(board[j+y][k+x],true);
                }
            }
            if(i==2||i==5){
                y = y+3;
                x = 0;
            }else{
                x =x+3;
            }
        }
        // for(int i=0;i<board.length;i++){
        //     HashMap<Character, Boolean> sites = new HashMap<Character, Boolean>();
        //     for(int j=0;j<board[i].length;j++){
        //         if(board[j][i]=='.'){
        //             continue;
        //         }
        //         if(sites.containsKey(board[j][i])){
        //             return false;
        //         }
        //         sites.put(board[j][i],true);
        //     }
        // }

        for(int i=0;i<9;i++){
            HashMap<Character, Boolean> sites = new HashMap<Character, Boolean>();
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    if(board[j+y][k+x]=='.'){
                        continue;
                    }
                    if(sites.containsKey(board[j+y][k+x])){
                        return false;
                    }
                    sites.put(board[j+y][k+x],true);
                }
            }
            if(i==2||i==5){
                y = y+3;
                x = 0;
            }else{
                x =x+3;
            }


        }
        return true;

    }
}
