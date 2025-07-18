import java.util.Scanner;
public class Prime {
    public static void main(String[] args){        
    //     int s;     
    //    if(n % 2 == 0){
    //     System.out.println("no is even so not prime");
    // }else{
    //     for(int i = 1;i <= 9;i++){
    //     n = n % i;
    //     if(n == 0){
    //         count ++;
    //     }
    //     }     
    //     }
    
        boolean isPrime = true;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        if(n <= 1){
            System.out.println("-ve..! ,enter positive number");
        }
        for(int i = 2;i < n;i++){
            if(n % i == 0){
                isPrime = !isPrime;
            }
        }
    System.out.println("is prime");
    sc.close();
    }
}

