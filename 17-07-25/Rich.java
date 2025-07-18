// //to check

public class Rich {
//     public static void main(String[] args){
//         //int [][]matrix = new int[][];
//         int [][]matrix = {{1,2,3},
//                           {3,2,1}};
//         int rowlen = matrix.length;
//         int collen = matrix[0].length;
//         //System.out.print("row length :" + matrix.length);
//         //System.out.println("col length :" + matrix[0].length);     
//         for(int i = 0;i < rowlen;i++){
//             int rowsum = 0;
//             for(int j = 0;j < collen;j++){
//                 System.out.print(matrix[i][j]+" ");
//                 rowsum = rowsum + matrix[i][j];
//             }
//             System.out.print(" : rowsum = " + rowsum);
//             System.out.println();
//         }
//     }
public int maximumwealth (int[][] accounts) {
    int rowlen = accounts.length;
    int collen = accounts[0].length;
    int maxwealth = 0;
    for(int i = 0;i < rowlen;i++){
        int wealth = 0;
        for(int j = 0;j < collen;j++){
        wealth += accounts[i][j];
        }
        // if(wealth > maxwealth){
        // maxwealth = wealth;
        //     }
        maxwealth = Math.max(wealth,maxwealth);
        }
        return maxwealth;
    }
}

