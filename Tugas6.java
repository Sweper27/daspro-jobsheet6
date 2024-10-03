import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        String jenisbuku;
        double hargabuku = 20000, diskon = 0;
        int jumlahbuku;

        System.out.print("MAsukkan jenis buku:");
        jenisbuku = input26.nextLine();
        System.out.print("Masukkan jumlah buku:");
        jumlahbuku = input26.nextInt();

        if (jenisbuku.equals("kamus")) {
            if (jumlahbuku > 2) {
                diskon = 0.12;
            } else {
                diskon = 0.1;
            }

        } else if (jenisbuku.equals("novel")) {
            if (jumlahbuku >= 3) {
                diskon = 0.09;
            } else {
                diskon = 0.08;
            }
        } else {
            if (jumlahbuku > 3) {
                diskon = 0.05;
            }
        }

        double totalDiskon = (diskon * hargabuku * jumlahbuku);
        double ttotalbayar = (hargabuku * jumlahbuku * totalDiskon);

        System.out.println("Total diskon yang anda dapatkan sebesar Rp." + totalDiskon);
        System.out.println("Total harga yang harus anda bayar sebesar Rp." + ttotalbayar);
    }
}
