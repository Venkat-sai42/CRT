public class Arrsmall {
    public static void main(String[] args){
        int arr[]={1,4,6,9};
        int small = arr[0];
        int i;
        for(i = arr.length - 1 ;i > 0;i--){
                if(arr[i] < small){
                    small = arr[i];
            }     
        }
        System.out.println(small);   
    }
}
 
//modified also for smallest
