import java.util.Scanner;

class Even {
    public static void main(String[] args) {
        System.out.println("enter a positive integer : ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i > 0) {
            if (i % 2 == 0) {
                System.out.println("it is even number");
            } else {
                System.out.println("it is odd number");
            }
        } else {
            System.out.println("it is not a +ve number");
        }
        sc.close();
    }
}
