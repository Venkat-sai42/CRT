import java.util.Scanner;
class Arrsearch{
    public static void main(String[] args){
        int arr[]={10,12,38,20,42};
        int target;
        System.out.println("enter target ");
        Scanner sc = new Scanner(System.in);
        target = sc.nextInt(); 
        boolean found = false;//check this
        for(int i = 0;i < arr.length;i++){
            //System.out.println("array elements " + arr[i]);
            if(arr[i] == target){
                System.out.println("target is at index " + i);
            found = true;
            break;
            }
        }
        if(!found){
          System.out.println("target not present in the array");  
        }
        sc.close();
    }
}