import java.util.Scanner;

public class sainskalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("=== Menu Kalkulator Kecepatan ===");
            System.out.println("1. Hitung Kecepatan");
            System.out.println("2. Hitung Jarak");
            System.out.println("3. Hitung Waktu");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-3): ");

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungKecepatan();
                    break;
                case 2:
                    hitungJarak();
                    break;
                case 3:
                    hitungWaktu();
                    break;
                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                    break;
            }
            System.out.print("\nApakah Sudah Selesai? (y/n) ");
            String selesai = input.next();
            if (selesai.equalsIgnoreCase("y")) {
                break;
            }

        }
    }

    private static void hitungKecepatan() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Jarak (m): ");
        double Jarak = input.nextDouble();
        System.out.print("Masukan Waktu (s): ");
        double waktu = input.nextDouble();

        double Kecepatan = Jarak / waktu;
        System.out.print("Kecepatan : " + Kecepatan + ("m/s"));

    }

    private static void hitungJarak() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan Kecepatan (m/s): ");
        double Kecepatan = input.nextDouble();
        System.out.print("Masukan Waktu (s): ");
        double waktu = input.nextDouble();

        double jarak = Kecepatan * waktu;
        System.out.print("Jarak : " + jarak + " m");

    }

    private static void hitungWaktu() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jarak (m): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        double kecepatan = input.nextDouble();

        double waktu = jarak / kecepatan;
        System.out.println("Waktu: " + waktu + " s");

    }
}
