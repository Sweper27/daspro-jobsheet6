import java.util.Scanner;

public class pemilihan2percobaan2No26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihanMenu;
        String member;
        String jenisPembayaran;
        double diskon, harga, totalBayar;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu = input.nextInt();
        input.nextLine(); 
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.print("Masukkan jenis pembayaran (QRIS/Non-QRIS) = ");
        jenisPembayaran = input.nextLine();
        System.out.println("-------------------------------------");

        
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10; 
            System.out.println("Besar diskon = 10%");
        } else {
            diskon = 0.0; 
            System.out.println("Tidak ada diskon untuk non-member.");
        }

        
        if (pilihanMenu == 1) {
            harga = 14000; 
        } else if (pilihanMenu == 2) {
            harga = 3000; 
        } else if (pilihanMenu == 3) {
            harga = 15000; 
        } else {
            System.out.println("Pilihan menu tidak valid."); 
            return; 
        }

        
        totalBayar = harga - (harga * diskon);

        
        if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
            totalBayar -= 1000; 
            System.out.println("Potongan harga Rp. 1.000 untuk pembayaran QRIS telah diterapkan.");
        }

        
        if (totalBayar < 0) {
            totalBayar = 0; 
        }

        
        System.out.println("Harga = " + harga);
        System.out.println("Total bayar setelah diskon dan potongan = " + totalBayar);
    }
}
