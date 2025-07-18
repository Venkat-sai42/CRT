public class Newloop {
    public static void main(String[] args){
        int [][]matrix = {{2,4,5},
                          {4,9,8},
                          {6,7,3}};
        int rowlen = matrix.length;
        int collen = matrix[0].length;
    for(int[] rowArr : matrix){
        for(int val : rowArr){
            System.out.print(val + ", ");
            }
        System.out.println();
        }
    }
}
