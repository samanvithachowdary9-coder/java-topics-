import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        Integer num = sc.nextInt();
        if(num %2 == 0) {
            System.out.print("Even Number");
        } else {
            System.out.print("Odd Number");
        }
        sc.close();
    }
}
