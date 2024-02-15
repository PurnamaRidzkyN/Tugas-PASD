import java.util.Scanner;

public class prakFungsiModif {
    static Scanner input = new Scanner(System.in);
    static final int JUMLAH_BUNGA = 4;
    static final String[] JENIS_BUNGA = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
    static final double[] HARGA_BUNGA = { 75000, 50000, 60000, 10000 };
    static int[][] stockBunga = new int[JUMLAH_BUNGA][4];

    public static void main(String[] args) {
        int pilihan;
        int cabang;

        do {
            System.out.println("Menu:");
            System.out.println("1. Input Data Stock Bunga");
            System.out.println("2. Pendapatan Setiap Cabang Jika Semua Bunga Terjual");
            System.out.println("3. Tampilkan Stock Bunga pada Cabang RoyalGarden");
            System.out.println("4. Pengurangan Stock Bunga pada Cabang RoyalGarden");
            System.out.println("5. Bunga terjual ");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    inputDataStockBunga();
                    break;
                case 2:
                    tampilkanPendapatanCabang();
                    break;
                case 3:
                    cabang = pilihCabang();
                    tampilkanStockBunga(cabang);
                    break;
                case 4:
                    cabang = pilihCabang();
                    penguranganStockBunga(cabang);
                    break;
                case 5:
                    cabang = pilihCabang();
                    bungaTerjual(cabang);
                case 6:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        } while (pilihan != 6);
    }

    static void inputDataStockBunga() {
        for (int i = 0; i < JUMLAH_BUNGA; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Masukkan stock " + JENIS_BUNGA[i] + " pada RoyalGarden" + (j + 1) + ": ");
                stockBunga[i][j] = input.nextInt();
            }
        }
    }

    static double hitungPendapatanCabang(int cabang) {
        double pendapatan = 0;
        for (int i = 0; i < JUMLAH_BUNGA; i++) {
            pendapatan += stockBunga[i][cabang] * HARGA_BUNGA[i];
        }
        return pendapatan;
    }

    static void tampilkanPendapatanCabang() {
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        for (int i = 0; i < 4; i++) {
            double pendapatan = hitungPendapatanCabang(i);
            System.out.println("RoyalGarden" + (i + 1) + ": Rp" + pendapatan);
        }
    }

    static void tampilkanStockBunga(int cabang) {
        System.out.println("\nStock Bunga pada Cabang RoyalGarden" + (cabang + 1) + ":");
        for (int i = 0; i < JUMLAH_BUNGA; i++) {
            System.out.println(JENIS_BUNGA[i] + ": " + stockBunga[i][cabang]);
        }
    }

    static void penguranganStockBunga(int cabang) {
        System.out.println("\nPengurangan Stock Bunga pada Cabang RoyalGarden" + (cabang + 1) + ":");
        System.out.println("Masukkan informasi pengurangan stock bunga:");
        for (int i = 0; i < JUMLAH_BUNGA; i++) {
            System.out.print("Berapa banyak " + JENIS_BUNGA[i] + " yang mati: ");
            int bungaMati = input.nextInt();
            stockBunga[i][cabang] -= bungaMati;
        }
    }

    static int pilihCabang() {
        System.out.print("Pilih cabang (1-4): ");
        int cabang = input.nextInt();
        if (cabang < 1 || cabang > 4) {
            System.out.println("Cabang tidak valid. Pilih cabang 1-4.");
            return pilihCabang();
        }
        return cabang - 1; // Konversi ke indeks array (0-3)
    }

    static void bungaTerjual(int cabang) {
        System.out.println("Pilih bunga yang terjual");
        System.out.println("1.Aglonema");
        System.out.println("2.Keladi");
        System.out.println("3.Alocasia ");
        System.out.println("4.Mawar");
        System.out.print("Masukan Pilihan (1-4): ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Masukan berapa bunga yang terjual : ");
                double bunga = input.nextInt();
                double pendapatan = bunga * HARGA_BUNGA[pilihan - 1];
                System.out.println("Pendapatan : " + pendapatan);
                stockBunga[cabang][pilihan - 1] -= bunga;
                break;
            case 2:
                System.out.println("Masukan berapa bunga yang terjual : ");
                bunga = input.nextInt();
                pendapatan = bunga * HARGA_BUNGA[pilihan - 1];
                System.out.println("Pendapatan : " + pendapatan);
                stockBunga[cabang][pilihan - 1] -= bunga;
                break;
            case 3:
                System.out.println("Masukan berapa bunga yang terjual : ");
                bunga = input.nextInt();
                pendapatan = bunga * HARGA_BUNGA[pilihan - 1];
                System.out.println("Pendapatan : " + pendapatan);
                stockBunga[cabang][pilihan - 1] -= bunga;
                break;
            case 4:
                System.out.println("Masukan berapa bunga yang terjual : ");
                bunga = input.nextInt();
                pendapatan = bunga * HARGA_BUNGA[pilihan - 1];
                stockBunga[cabang][pilihan - 1] -= bunga;
                System.out.println("Pendapatan : " + pendapatan);
                break;

            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }
    }

}
