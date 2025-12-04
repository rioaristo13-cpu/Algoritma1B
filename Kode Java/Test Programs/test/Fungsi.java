import java.util.Scanner;
import static java.lang.System.out;

public class Fungsi {
    
    int[] HimpunanA;
    int[] HimpunanB;
    int[] HimpunanRelasi;
    int[] HimpunanAsal;
    int jmlHimpunanA, jmlHimpunanB, jmlRelasi;
    Scanner input = new Scanner(System.in);

        public static void main(String args[]) {
            Fungsi madhun = new Fungsi();
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
            for (int i = 0; i <= (jmlHimpunanA - 1); i++) {
                out.print("Himpunan A yang ke " + (i+1) + " : ");
                HimpunanA[i] = input.nextInt();
            }

            out.print("Masukkan Jumlah Himpunan B = ");
            jmlHimpunanB = input.nextInt();
            
            HimpunanB = new int[jmlHimpunanB];
            for (int i = 0; i <= (jmlHimpunanB - 1); i++) {
                out.print("Himpunan B yang ke " + (i+1) + " : ");
                HimpunanB[i] = input.nextInt();
            }
        }

        public void cetakHimpunan() {
            out.print ("Anggota Himpunan A = { ");
            for (int i = 0; i <= (jmlHimpunanA - 1); i++) {
                out.print(HimpunanA[i] + " ");
            }

            out.print ("Anggota Himpunan B = { ");
            for (int i = 0; i <= (jmlHimpunanB - 1); i++) {
                out.print(HimpunanB[i] + " ");
            }
            
            out.print("} ");
        }

        public void inputRelasi() {
            int jmlRelasiMaks = jmlHimpunanA * jmlHimpunanB;
            out.println("Relasi Maksimal : "+jmlRelasiMaks);
            out.print(" "); 
            
            do { 
                out.print("Masukkan Jumlah Relasi : ");
                jmlRelasi = input.nextInt();
            } while (jmlRelasi > jmlRelasiMaks);

            HimpunanRelasi = new int[jmlRelasi];
            HimpunanAsal = new int[jmlRelasi];
            out.println("Masukkan Relasinya : ");
            for (int i = 0;i <= (jmlRelasi - 1); i++) {
                int[] temp = new int[jmlRelasi];
                int[] temp2 = new int[jmlRelasi];
                boolean SamaA = false;
                boolean SamaB = false;

            out.println("Relasi ke" + (i+1) + " : ");
            do { 
                out.print("Masukkan Asal A :");
                temp[i] = input.nextInt();
                out.print("Masukkan Tujuan B : ");
                temp2[i] = input.nextInt();

                for(int j = 0; j <= (jmlHimpunanA - 1); j++) {
                    if (temp2[i] == HimpunanA[j]) {
                        SamaA = true;
                    }
                }
                for(int k = 0; k <= (jmlHimpunanB - 1); k++) {
                    if (temp2[i] == HimpunanB[k]) {
                        SamaB = true;
                    }
                }
                if (SamaA == false || SamaB == false) {
                    out.println("Anggota Himpunan Tidak terdapat dikedua Himpunan A & B");
                }
                if (SamaB == true && SamaB == true) {
                    HimpunanRelasi[i] = temp2[i];
                    HimpunanAsal[i] = temp[i];
                }
            } while (SamaA == false || SamaB == false);
        }
    }
    public void cekFungsi() {
        int jumlahAnggota = 0;
        boolean adaSama = false;
        
        for (int i = 0; i <= (jmlHimpunanA - 1); i++) {
            for (int j = 0; j <= (jmlRelasi - 1); j++) {
                if (HimpunanA[i] == HimpunanAsal[j]) {
                    jumlahAnggota++;
                }
            }
        }
        if (jumlahAnggota == jmlHimpunanA && adaSama == false) {
            out.println("Relasi yang diinput adalah Fungsi");
        } else {
            out.println("Relasi yang diinput merupakan relasi biasa" + jumlahAnggota + adaSama);
        }
    }
    public void cetakRelasi() {
        out.print("Daerah Domain = { ");
        for (int i = 0; i <= jmlHimpunanA - 1; i++) {
            out.print(HimpunanA[i] + " ");
        }
        out.println("}");

        out.print("Daerah Kodomain = { ");
        for (int i = 0; i <= jmlHimpunanB - 1; i++) {
            out.print(HimpunanB[i] + " ");
        }
        out.println("}");

        out.println("Range adalah = { ");
        for (int i = 0; i <= (jmlRelasi - 1); i++) {
            boolean adaSama = false;
            for (int j = i + 1; j <= (jmlRelasi - 1); j++) {
                if (HimpunanRelasi[i] == HimpunanRelasi[j]) {
                    adaSama = true;
                }
            }
            if (adaSama == false)
                out.print(HimpunanRelasi[i] + " ");
        }
        out.println("}");
    }
}
