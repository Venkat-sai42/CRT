public class Arrlargest {
    public static void main(String[] args){
        int arr[]={1,4,6,9};
        int large = arr[0];
        int i;
        for(i = 0;i < arr.length;i++){
                if(arr[i] > large){
                    large = arr[i];
            }     
        }
        System.out.println(large);   
    }
}
 
//modified also for smallest
