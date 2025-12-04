import java.util.Scanner;
import static java.lang.System.out;

public class Fungsifix {

    int[] HimpunanA;
    int[] HimpunanB;
    int[] HimpunanRelasi;
    int[] HimpunanAsal;
    int jmlHimpunanA, jmlHimpunanB, jmlRelasi;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Fungsifix madhun = new Fungsifix();
        madhun.inputAnggota();
        madhun.cetakHimpunan();
        madhun.inputRelasi();
        madhun.cekFungsi();
        madhun.cetakRelasi();
    }

    public void inputAnggota() {
        out.print("Masukkan Jumlah Himpunan A = ");
        jmlHimpunanA = input.nextInt();

        HimpunanA = new int[jmlHimpunanA];
        for (int i = 0; i < jmlHimpunanA; i++) {
            out.print("Himpunan A yang ke " + (i + 1) + " : ");
            HimpunanA[i] = input.nextInt();
        }

        out.print("Masukkan Jumlah Himpunan B = ");
        jmlHimpunanB = input.nextInt();

        HimpunanB = new int[jmlHimpunanB];
        for (int i = 0; i < jmlHimpunanB; i++) {
            out.print("Himpunan B yang ke " + (i + 1) + " : ");
            HimpunanB[i] = input.nextInt();
        }
    }

    public void cetakHimpunan() {
        out.print("\nAnggota Himpunan A = { ");
        for (int i = 0; i < jmlHimpunanA; i++) {
            out.print(HimpunanA[i] + " ");
        }
        out.println("}");

        out.print("Anggota Himpunan B = { ");
        for (int i = 0; i < jmlHimpunanB; i++) {
            out.print(HimpunanB[i] + " ");
        }
        out.println("}\n");
    }

    public void inputRelasi() {
        int jmlRelasiMaks = jmlHimpunanA * jmlHimpunanB;
        out.println("Relasi Maksimal : " + jmlRelasiMaks);

        do {
            out.print("Masukkan Jumlah Relasi : ");
            jmlRelasi = input.nextInt();
        } while (jmlRelasi > jmlRelasiMaks);

        HimpunanRelasi = new int[jmlRelasi];
        HimpunanAsal = new int[jmlRelasi];

        for (int i = 0; i < jmlRelasi; i++) {
            boolean valid;
            do {
                valid = true;
                out.println("Relasi ke-" + (i + 1) + " :");
                out.print("Masukkan Asal (A): ");
                int asal = input.nextInt();
                out.print("Masukkan Tujuan (B): ");
                int tujuan = input.nextInt();

                boolean SamaA = false;
                boolean SamaB = false;

                for (int a : HimpunanA)
                    if (asal == a) SamaA = true;

                for (int b : HimpunanB)
                    if (tujuan == b) SamaB = true;

                if (!SamaA || !SamaB) {
                    out.println("❌ Anggota tidak terdapat di Himpunan A atau B. Ulangi input.");
                    valid = false;
                } else {
                    HimpunanAsal[i] = asal;
                    HimpunanRelasi[i] = tujuan;
                }
            } while (!valid);
        }
    }

    public void cekFungsi() {
        boolean fungsi = true;

        // Check if each element in A maps to exactly one element in B
        for (int a : HimpunanA) {
            int count = 0;
            for (int i = 0; i < jmlRelasi; i++) {
                if (HimpunanAsal[i] == a) count++;
            }
            if (count != 1) {
                fungsi = false;
                break;
            }
        }

        if (fungsi)
            out.println("\n✅ Relasi yang diinput adalah Fungsi");
        else
            out.println("\n⚠️ Relasi yang diinput bukan Fungsi");
    }

    public void cetakRelasi() {
        out.print("\nDaerah Domain = { ");
        for (int a : HimpunanA)
            out.print(a + " ");
        out.println("}");

        out.print("Daerah Kodomain = { ");
        for (int b : HimpunanB)
            out.print(b + " ");
        out.println("}");

        out.print("Range = { ");
        for (int i = 0; i < jmlRelasi; i++) {
            boolean unique = true;
            for (int j = 0; j < i; j++) {
                if (HimpunanRelasi[i] == HimpunanRelasi[j]) {
                    unique = false;
                    break;
                }
            }
            if (unique) out.print(HimpunanRelasi[i] + " ");
        }
        out.println("}\n");
    }
}
