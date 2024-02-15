public class prakFungsi {
    public static void main(String[] args) {
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
    };
    int[] hargaBunga = {75000, 50000, 60000, 10000};
    String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    // Menampilkan pendapatan setiap cabang jika semua bunga habis terjual
    System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Habis Terjual:");
    for (int i = 0; i < stokBunga.length; i++) {
        int pendapatan = hitungPendapatanCabang(i, stokBunga, hargaBunga);
        System.out.println("RoyalGarden" + (i + 1) + ": " + pendapatan);
    }

    // Menampilkan jumlah stok setiap jenis bunga pada cabang RoyalGarden4
    System.out.println("\nJumlah Stock Setiap Jenis Bunga pada Cabang RoyalGarden4:");
    int[] stokRoyalGarden4 = getStokBungaCabang(3, stokBunga);
    for (int i = 0; i < stokRoyalGarden4.length; i++) {
        System.out.println(namaBunga[i] + ": " + stokRoyalGarden4[i]);
    }
}

private static int hitungPendapatanCabang(int indeksCabang, int[][] stokBunga, int[] hargaBunga) {
    int pendapatan = 0;
    for (int i = 0; i < stokBunga[indeksCabang].length; i++) {
        pendapatan += stokBunga[indeksCabang][i] * hargaBunga[i];
    }
    return pendapatan;
}


private static int[] getStokBungaCabang(int indeksCabang, int[][]stokBunga) {
    int[] stok = new int[stokBunga[indeksCabang].length];
    for (int i = 0; i < stokBunga[indeksCabang].length; i++) {
        stok[i] = stokBunga[indeksCabang][i];
    }
    // Pengurangan stok karena bunga mati
    stok[0] -= 1; 
    stok[1] -= 2; 
    stok[3] -= 5; 

    return stok;
}
}