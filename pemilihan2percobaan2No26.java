import java.util.Scanner;

public class pemilihan2percobaan2No26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihanMenu;
        String member;
        double diskon, harga, totalBayar;

        System.out.println("-----------------------");
        System.out.println("==== MENU KAFE JTI ====");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihanMenu = input.nextInt();
        input.nextLine(); // Clear the buffer
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input.nextLine();
        System.out.println("-------------------------------------");

        // Set discount for members
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
        System.out.println("Harga = " + harga);
        System.out.println("Total bayar setelah diskon = " + totalBayar);

        if (member.equalsIgnoreCase("n")) {
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
                
            }else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);

            }else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }
            
            System.out.println("MTotal bayar = " + harga);


        }else {
            System.out.println("member tidak valid");

        }System.out.println("-------------------------------------");

    }
}
