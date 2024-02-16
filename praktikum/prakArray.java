import java.util.Scanner;

public class prakArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Jumlah mata kuliah
        int jumlahMataKuliah = 9;

        // Array untuk menyimpan nilai angka, nilai setara, nilai huruf, dan nama mata
        // kuliah
        double[] nilaiAngka = new double[jumlahMataKuliah];
        double[] nilaiSetara = new double[jumlahMataKuliah];
        String[] nilaiHuruf = new String[jumlahMataKuliah];
        String[] namaMataKuliah = {

                "Konsep Teknologi Informasi",
                "PAMB",
                "Matematika Dasar",
                "Praktikum Dasar Pemrograman",
                "Agama",
                "Bahasa Indonesia",
                "Critical Thinking dan Problem Solving",
                "Bahasa Inggris",
                "Dasar Pemrograman"
        };
        int[] sks = { 2, 2, 2, 3, 2, 2, 2, 2, 2 };

        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester ");
        System.out.println("================================");

        // Input nilai untuk masing-masing mata kuliah
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMataKuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();
            if ( nilaiAngka[i]<0 || nilaiAngka[i]>100){
                System.out.println("Nilai Tidak Valid");
                i--;
                continue;
            }
            // Hitung nilai setara dan simpan nilai huruf
            nilaiSetara[i] = hitungNilaiSetara(nilaiAngka[i]);
            nilaiHuruf[i] = hitungNilaiHuruf(nilaiAngka[i]);
        }

        // koversi nilai
        System.out.println("================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("================================");
        System.out.println("MK\t\t\t\tNilai Angka \t Nilai Huruf \t Bobot Nilai");
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.printf("%-40s%-15.1f%-15s%-15.1f\n", namaMataKuliah[i], nilaiAngka[i], nilaiHuruf[i],
                    nilaiSetara[i]);
        }
        double ip = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            double sigma = nilaiSetara[i] * sks[i];
            ip += sigma;
        }
        int jmlSks = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            jmlSks += sks[i];
        }
        ip /= jmlSks;
        System.out.println("================================");
        System.out.printf("IP : %.2f%n", ip);
        input.close();

    }

    // Fungsi untuk menghitung nilai setara dan menyimpan nilai huruf
    private static double hitungNilaiSetara(double nilaiAkhir) {
        double nSetara = 0;

        if (nilaiAkhir <= 39) {
            nSetara = 0;

        } else if (nilaiAkhir <= 50) {
            nSetara = 1;

        } else if (nilaiAkhir <= 60) {
            nSetara = 2;

        } else if (nilaiAkhir <= 65) {
            nSetara = 2.5;

        } else if (nilaiAkhir <= 73) {
            nSetara = 3;

        } else if (nilaiAkhir <= 80) {
            nSetara = 3.5;

        } else if (nilaiAkhir <= 100) {
            nSetara = 4;
        }

        return nSetara;
    }

    private static String hitungNilaiHuruf(double nilaiAkhir) {

        String huruf = "";

        if (nilaiAkhir <= 39) {
            huruf = "E";
        } else if (nilaiAkhir <= 50) {
            huruf = "D";
        } else if (nilaiAkhir <= 60) {
            huruf = "C";
        } else if (nilaiAkhir <= 65) {
            huruf = "C+";
        } else if (nilaiAkhir <= 73) {
            huruf = "B";
        } else if (nilaiAkhir <= 80) {
            huruf = "B+";
        } else if (nilaiAkhir <= 100) {
            huruf = "A";
        }

        return huruf;
    }
}
