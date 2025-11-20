import java.util.Scanner;

public class Himpunan {
    Scanner input = new Scanner(System.in);
    int[] himpunanA = new int[100];
    int[] himpunanB = new int[100];
    int jumlahAnggotaA;
    int jumlahAnggotaB;

    public void dataAnggota(){
        System.out.print("Masukkan Banyak Anggota Himpunan A : ");
        jumlahAnggotaA = input.nextInt();
        System.out.println("Anggota Himpunan A");
        for (int i = 1; i <= jumlahAnggotaA; i++) {
            System.err.print("Anggota ke-" + i + " : ");
            himpunanA[i] = input.nextInt();
        }
    
        System.out.print("Masukkan Banyak Anggota Himpunan B : ");
        jumlahAnggotaB = input.nextInt();
        System.out.println("Anggota Himpunan B");
        for (int i = 1; i <= jumlahAnggotaB; i++) {
            System.err.print("Anggota ke-" + i + " : ");
            himpunanB[i] = input.nextInt();
        }
    }

    public void tampilAnggota(){
        System.out.print("Anggota Himpunan A = { ");
        for (int i = 1; i <= jumlahAnggotaA; i++) {
            System.out.print(himpunanA[i] + " ");
        }
        System.out.println("}");

        System.out.print("Anggota Himpunan B = { ");
        for (int i = 1; i <= jumlahAnggotaB; i++) {
            System.out.print(himpunanB[i] + " ");
        }
        System.out.println("}");
    }

    public void himpunanGabungan() {
        System.out.print("Himpunan Gabungan A u B : { ");

        for (int i = 1; i <= jumlahAnggotaA; i++ ) {
            System.out.print(himpunanA[i] + " ");
        }

        for (int i = 1; i <= jumlahAnggotaB; i++) {
            boolean adaSama = false;
            for (int j = 1; j <= jumlahAnggotaA; j++) {
                if (himpunanB[i] == himpunanA[j]) {
                    adaSama = true;
                }
            }
            if (!adaSama) {
                System.err.print(himpunanB[i] + " ");
            }
        }
        System.out.println("}");
    }

    public void himpunanIrisan() {
        System.out.print("Himpunan Irisan A n B : { ");
        for (int i = 1; i <= jumlahAnggotaB; i++) {
            boolean adaSama = false;
            for (int j = 1; j <= jumlahAnggotaA; j++) {
                if (himpunanB[i] == himpunanA[j]) {
                    adaSama = true;
                }
            }
            if (adaSama) {
                System.out.print(himpunanB[i] + " ");
            }
        }
        System.out.println("}");
    }
    public static void main(String[] args) {
        Himpunan bilangan = new Himpunan();
        bilangan.dataAnggota();
        bilangan.tampilAnggota();
        bilangan.himpunanGabungan();
        bilangan.himpunanIrisan();
    }
}