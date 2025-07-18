public class Twodarr {
    public static void main(String[] args){
        //int [][]matrix = new int[][];
        int [][]matrix = {{2,4,5},
                          {4,9,8},
                          {6,7,3}};
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        //System.out.print("row length :" + matrix.length);
        //System.out.println("col length :" + matrix[0].length);     
        for(int i = 0;i < rowlen;i++){
            int rowsum = 0;
            for(int j = 0;j < collen;j++){
                System.out.print(matrix[i][j]+" ");
                rowsum = rowsum + matrix[i][j];
            }
            System.out.print(" : rowsum = " + rowsum);
            System.out.println();
        }
        for(int j = 0;j < collen;j++){
            int colsum = 0;
            for(int i = 0;i < rowlen;i++){
            colsum = colsum + matrix[i][j];
            }
            System.out.println("colsum = " + colsum);
        }
    }
}

