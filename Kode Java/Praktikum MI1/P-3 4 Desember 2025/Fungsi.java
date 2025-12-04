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

            out.print("\nMasukkan Jumlah Himpunan B = ");
            jmlHimpunanB = input.nextInt();
            
            HimpunanB = new int[jmlHimpunanB];
            for (int i = 0; i <= (jmlHimpunanB - 1); i++) {
                out.print("Himpunan B yang ke " + (i+1) + " : ");
                HimpunanB[i] = input.nextInt();
            }
        }

        public void cetakHimpunan() {
            out.print ("\nAnggota Himpunan A = { ");
            for (int i = 0; i <= (jmlHimpunanA - 1); i++) {
                out.print(HimpunanA[i] + " ");
            }
            out.println("} ");

            out.print ("Anggota Himpunan B = { ");
            for (int i = 0; i <= (jmlHimpunanB - 1); i++) {
                out.print(HimpunanB[i] + " ");
            }
            
            out.println("} ");
        }

        public void inputRelasi() {
            int jmlRelasiMaks = jmlHimpunanA * jmlHimpunanB;
            out.println("Relasi Maksimal : "+jmlRelasiMaks);
            out.print("\n"); 
            
            do { 
                out.print("Masukkan Jumlah Relasi : ");
                jmlRelasi = input.nextInt();
            } while (jmlRelasi > jmlRelasiMaks);

            HimpunanRelasi = new int[jmlRelasi];
            HimpunanAsal = new int[jmlRelasi];
            out.println("Masukkan Relasinya : ");
            for (int i = 0;i <= (jmlRelasi - 1); i++) {
                int temp;
                int temp2;
                boolean SamaA = false;
                boolean SamaB = false;

            out.println("\nRelasi ke" + (i+1) + " : ");
            do { 
                out.print("Masukkan Asal A :");
                temp = input.nextInt();
                out.print("Masukkan Tujuan B : ");
                temp2 = input.nextInt();

                for(int j = 0; j <= (jmlHimpunanA - 1); j++) {
                    if (temp == HimpunanA[j]) {
                        SamaA = true;
                    }
                }
                for(int k = 0; k <= (jmlHimpunanB - 1); k++) {
                    if (temp2 == HimpunanB[k]) {
                        SamaB = true;
                    }
                }
                if (SamaA == false || SamaB == false) {
                    out.println("Anggota Himpunan Tidak terdapat dikedua Himpunan A & B");
                }
                if (SamaB == true && SamaB == true) {
                    HimpunanRelasi[i] = temp2;
                    HimpunanAsal[i] = temp;
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
        for (int i = 0; i <= (jmlRelasi - 1); i++) {
            for (int j = i + 1; j <= (jmlRelasi - 1); j++) {
                if (HimpunanAsal[i] == HimpunanAsal[j]) {
                    adaSama = true;
                }
            }
        }
        if (jumlahAnggota == jmlHimpunanA && adaSama == false) {
            out.println("\nRelasi yang diinput adalah Fungsi");
        } else {
            out.println("\nRelasi yang diinput merupakan relasi biasa antara "+ jumlahAnggota +" anggota");
        }
    }
    public void cetakRelasi() {
        out.print("Daerah Domain = { ");
        for (int i = 0; i <= (jmlHimpunanA - 1); i++) {
            out.print(HimpunanA[i] + " ");
        }
        out.println("}");

        out.print("Daerah Kodomain = { ");
        for (int i = 0; i <= (jmlHimpunanB - 1); i++) {
            out.print(HimpunanB[i] + " ");
        }
        out.println("}");

        out.print("Range adalah = { ");
        for (int i = 0; i <= (jmlRelasi - 1); i++) {
            boolean adaSama = false;
            for (int j = i + 1; j <= jmlRelasi - 1; j++) {
                if (HimpunanRelasi[i] == HimpunanRelasi[j]) {
                    adaSama = true;
                }
            }
            if (adaSama == false) {
                out.print(HimpunanRelasi[i]+" ");
            }
        }
        out.println("}");
    }
}
