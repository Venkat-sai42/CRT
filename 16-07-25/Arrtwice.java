public class Arrtwice {
    public static void main(String[] args){
        int arr[]={1,2,3,1};
        boolean found = false;
        for(int i = 0 ;i < arr.length;i++){
            for(int j = i + 1 ;j < arr.length;j++){
                if(arr[i] == arr[j]){
                    found = true;
                    break;
                }
            }
        }
        if(found){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}// ny hashmap time complexity  O(n)
 