public class First {
    public static void main(String[] args){
    int arr[]={1,4,6,9};
        int large = arr[0];
        int small = arr[0];
        int i;
        for(i = 0;i < arr.length;i++){
                if(arr[i] > large){
                    large = arr[i];
            }     
        }
        //System.out.println(large);
        for(i = arr.length - 1 ;i > 0;i--){
                if(arr[i] < small){
                    small = arr[i];
            }     
        }
        //System.out.println(small); 
        for(int n = 0;n > small;n++){
            if(n == arr[i]){
                continue;
            }else{
                System.out.println(arr[i]);
            }
        }  
    }
}
