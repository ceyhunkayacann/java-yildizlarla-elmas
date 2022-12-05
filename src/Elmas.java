import java.util.Scanner;

public class Elmas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz :");
        int n = input.nextInt();

        for (int i = 0; i <= n ; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }


        for (int i=n; i>=1; i--){
            for (int k=n + 1; k>i; k--){
                System.out.print(" ");
            }
            for (int l=1; l<=(2*i-1); l++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
