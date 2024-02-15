import java.util.Scanner;
public class prakPerulangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("================================");
        System.out.print("Masukan NIM anda : ");
        long nim = input.nextLong();
        System.out.println("================================");
        long n = nim %100;
        if (n <10 ){
            n+=10;
        }
        System.out.println("n: "+ n);

        for (int i = 1; i <=n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i+" ");
            } else {
                System.out.print("* ");
            }
        }
        
        input.close();

    }
}
