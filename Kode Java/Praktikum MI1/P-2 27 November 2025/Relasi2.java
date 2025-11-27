import static java.lang.System.out;
import java.util.Scanner;

public class Relasi2 {
    Scanner input = new Scanner(System.in);

    String[] himpunanA = new String[100]; 
    String[] himpunanB = new String[100];
    String[] himpunanHasil = new String[100];
    
    int jumlahAnggotaA;
    int jumlahAnggotaB;
    int jumlahRelasi;

    public void inputAnggota() {
        out.print("\nMasukkan jumlah anggota Himpunan A : ");
        jumlahAnggotaA = input.nextInt();
        input.nextLine();

        out.println("\n--- Anggota Himpunan A : ---");
        for (int i = 1; i <= jumlahAnggotaA; i++) {
            out.print("Anggota A "+i+" : ");
            himpunanA[i] = input.nextLine();
        }

        out.print("\nMasukkan jumlah anggota Himpunan B: ");
        jumlahAnggotaB = input.nextInt();
        input.nextLine();

        out.println("\n--- Anggota Himpunan B : ---");
        for (int i = 1; i <= jumlahAnggotaB; i++) {
            out.print("Anggota b "+i+" : ");
            himpunanB[i] = input.nextLine();
        }
    }

    public void inputRelasi() {
        int max = jumlahAnggotaA * jumlahAnggotaB;
        out.println("\nMaksimal relasi yang mungkin = " + max);

        do {
            out.print("Masukkan jumlah relasi yang terjadi : ");
            jumlahRelasi = input.nextInt();
            input.nextLine();
        } while (jumlahRelasi > max || jumlahRelasi < 1);

        out.println("\n--- Input Relasi ---");
        for (int i = 1; i <= jumlahRelasi; i++) {

            boolean valid;
            do {
                valid = true;
                
                out.print("\nRelasi ke-" + i + "\nAsal A  : ");
                String a = input.nextLine();

                out.print("Tujuan B : ");
                String b = input.nextLine();

                boolean adaA = false; 
                boolean adaB = false;

                for (int j = 1; j <= jumlahAnggotaA; j++)
                    if (a.equals(himpunanA[j])) adaA = true;
                
                for (int j = 1; j <= jumlahAnggotaB; j++)
                    if (b.equals(himpunanB[j])) adaB = true;

                if (!adaA || !adaB) {
                    out.println("Input Salah, Elemen tidak ada di Himpunan A atau B.");
                    valid = false;
                } else {
                    himpunanHasil[i] = b;
                }
            } while (!valid);
        }
    }

    public void cetakRelasi() {
        out.print("\nDomain   = { ");
        for (int i = 1; i<= jumlahAnggotaA; i++) out.print(himpunanA[i] + " ");
        out.println("}");

        out.print("\nKodomain = { ");
        for (int i = 1; i<= jumlahAnggotaB; i++) out.print(himpunanB[i] + " ");
        out.println("}");

        out.print("\nRange    = { ");
        for (int i = 1; i<= jumlahRelasi; i++) out.print(himpunanHasil[i] + " ");
        out.println("}");

    }

    public static void main (String[] args) {
        Relasi2 r = new Relasi2();
        r.inputAnggota();
        r.inputRelasi();
        r.cetakRelasi();
    }
}
