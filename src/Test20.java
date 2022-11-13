public class Test20 {
    public static void main(String[] args) {
        int[][] m= {{1,2,3},{4,5,6},{7,8,9}};
        rotate(m);

    }
    public static void rotate(int[][] matrix) {
        // 层次遍历，向下取余，从外到里
        for(int i=0;i<matrix.length/2;i++){
            // j为
            for(int j=i;j<matrix.length-i-2;j++){
                // 遍历上行 暂时存放
                // ri.add(matrix[i][j]);
                int ri = matrix[i][j];
                // 遍历左列，往上，存上行
                matrix[i][j] = matrix[matrix.length-1-j][i];
                System.out.println(matrix[i][j]);
                // 遍历下行，存左行
                matrix[matrix.length-1-j][i] = matrix[matrix.length-i-1][matrix.length-1-j];
                System.out.println(matrix[matrix.length-1-j][i]);
                // 遍历右列，存下行
                matrix[matrix.length-i-1][matrix.length-1-j] =matrix[j][matrix.length-i-1];
                System.out.println(matrix[matrix.length-i-1][matrix.length-1-j]);
                // 放回去
                matrix[j][matrix.length-i-1] = ri;
                System.out.println(matrix[matrix.length-1-j][i]);
            }

        }
    }
}
