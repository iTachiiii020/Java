import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        int n  = in.nextInt();
        int sum = 0;
        int temp = n;
        int cnt = Count(n);
        while (temp>0){
            int digit = temp % 10;
            sum += (int)Math.pow(digit,cnt  );
            temp = temp /10;
        }

        if (sum == n){
            System.out.println("the nummber "+n+"is armstrong");
        }else {
            System.out.println("the nummber "+n+"is not an armstrong");
        }


    }
    static int Count(int n){
        int count = 0;
        while (n>0){
            n/=10;
            count++;

        }
        return count;
    }
}