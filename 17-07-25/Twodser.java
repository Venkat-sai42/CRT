import java.util.Scanner;
public class Twodser {
    public static void main(String[] args){
        int matrix[][]={{2,4,5},
                        {1,9,8},
                        {6,7,3}};
        int rowlen = matrix.length;
        int collen = matrix[0].length;
        int target;
        System.out.print("enter target : ");
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt(); 
        boolean found = false;
//checking the 2d array
        for(int i = 0;i < rowlen;i++){
            for(int j = 0;j < collen;j++){
                if(matrix[i][j] == target){
                    System.out.print("target is at index : " + i +", "+ j);
                    //System.out.print(" " + j);
                    found = true;
                    break;
                }    
            }
        }
        if(!found){
            //System.out.println("target not present in the array");  
            System.out.println(-1 +", "+ -1);
        }
    sc.close();
    }
}
