import java.util.Scanner;
public class Fact {
    public static void main(String[] args){
        int n;
        System.out.println("enter number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = n - 1 ;i > 0;i--){
            n *= i;
            
        }
        System.out.println("factorial of given no is "+ n);
    sc.close();
    }
}
