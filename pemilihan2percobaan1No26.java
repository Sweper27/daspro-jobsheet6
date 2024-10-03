import java.util.Scanner;

public class pemilihan2percobaan1No26 {

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);

        System.out.print("Masukkan tahun: ");
        int tahun = input26.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) == 0) {
                if ((tahun % 400)== 0 ) {
                System.out.println("Tahun Kabisat");
                 }else 
                    System.out.println( " bukan tahun kabisat.");
            }else {  
                System.out.println("bukan tahun kabisat");
        }}else{
            System.out.println("Bukan Tahun Kabisat");
    }


    } 
}