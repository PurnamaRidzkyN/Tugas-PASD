import java.util.Scanner;

public class prakPemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean runProgram = true;

        while (runProgram) {
            System.out.println("Program Menghitung Nilai Akhir");
            System.out.println("================================");

            // Input nilai
            System.out.print("Masukkan Nilai Tugas   : ");
            double nTugas = input.nextDouble();
            System.out.print("Masukkan Nilai Kuis    : ");
            double nKuis = input.nextDouble();
            System.out.print("Masukkan Nilai UTS     : ");
            double nUTS = input.nextDouble();
            System.out.print("Masukkan Nilai UAS     : ");
            double nUAS = input.nextDouble();

            // Hitung nilai akhir dengan bobot tertentu
            double nilaiAkhir = (nTugas * 0.2) + (nKuis * 0.2) + (nUTS * 0.3) + (nUAS * 0.3);
            if (nilaiAkhir > 100 && nilaiAkhir <= 110) {
                nilaiAkhir = 100;
            }

            System.out.println("================================");
            System.out.println("================================");

            // Cek apakah nilai valid (antara 0 dan 100)
            if (nTugas < 0 || nTugas > 100 || nKuis < 0 || nKuis > 100 || nUTS < 0 || nUTS > 100 || nUAS < 0
                    || nUAS > 100) {
                System.out.println("Nilai tidak valid");
            } else {
                // Output nilai akhir
                System.out.println("Nilai Akhir            : " + nilaiAkhir);

                // Konversi nilai huruf
                double nSetara = 0;
                if (nilaiAkhir <= 39) {
                    nSetara = 0;
                    System.out.println("Nilai Huruf            : E");
                } else if (nilaiAkhir <= 50) {
                    nSetara = 1;
                    System.out.println("Nilai Huruf            : D");
                } else if (nilaiAkhir <= 60) {
                    nSetara = 2;
                    System.out.println("Nilai Huruf            : C");
                } else if (nilaiAkhir <= 65) {
                    nSetara = 2.5;
                    System.out.println("Nilai Huruf            : C+");
                } else if (nilaiAkhir <= 73) {
                    nSetara = 3;
                    System.out.println("Nilai Huruf            : B");
                } else if (nilaiAkhir <= 80) {
                    nSetara = 3.5;
                    System.out.println("Nilai Huruf            : B+");
                } else if (nilaiAkhir <= 100) {
                    nSetara = 4;
                    System.out.println("Nilai Huruf            : A");
                }

                // Output keterangan LULUS/TIDAK LULUS
                System.out.println("================================");
                System.out.println("================================");

                if (nSetara == 0 || nSetara == 1) {
                    System.out.println("TIDAK LULUS");
                } else {
                    System.out.println("LULUS");
                }

                // Pilihan untuk keluar dari program
                System.out.print("Apakah Anda ingin menghitung nilai lagi? (y/n): ");
                char pilihan = input.next().charAt(0);
                if (pilihan != 'y') {
                    runProgram = false;
                }
            }
        }

        input.close();
    }
}
