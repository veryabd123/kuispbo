package pbo;
import pbo.pelajar;
import pbo.mahasiswa;
import pbo.mhsw;
import pbo.pljr;
import java.util.Scanner;

public class main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int pil;
        double konten, visual, design;
        double jurnal, relevansi, problem;
        String nama,usia;
        System.out.println("--------------------------------------------");
        System.out.println("|        Pendaftaran Beasiswa Pt Benang    |");
        System.out.println("--------------------------------------------");
        System.out.println("| Beasisiwa yang dibuka :                    |");
        System.out.println("| 1. Beasisiwa Pelajar                      |");
        System.out.println("| 2. beasisiwa Mahasiswa                    |");
        System.out.println("--------------------------------------------");
        System.out.print("Pilihan kategori : ");
        pil = keyboard.nextInt();
        
        if (pil == 1) {
            System.out.println(" --- Form Pendaftaran --- ");
            System.out.print(" Nama Lengkap   : ");
            nama = keyboard.next();
            
            System.out.print("Usia   : ");
            usia = keyboard.next();
            do {
                System.out.println(" --- Form Penilaian --- ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Struktur Konten dan esai   : ");
                konten = keyboard.nextDouble();
                System.out.print("Nilai Teknik Visual       : ");
                visual = keyboard.nextDouble();
                System.out.print("Nilai Nilai kemampuan Design Thinking   : ");
                design = keyboard.nextDouble();
               
            } while (design <= 100 ||konten <=100||visual <=100);
            do {
                System.out.println(" --  Menu  -- ");
                System.out.println(" 1. Tampil ");
                System.out.println(" 2. Edit   ");
                System.out.println(" 3. Exit   ");
                System.out.print("menu : ");
                pil = keyboard.nextInt();
                if (pil == 1) {
                    double hasil;
                    pelajar pe;
                    pe = new pelajar (konten,visual,design);
                    hasil = pe.hasil();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 87.5) {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("MOHON MAAF " + nama + " usia " + usia + " TIDAK LULUS seleksi Beasiswa Pt Benang");
                    }
                    else if (hasil >= 87.5) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SElamat " + nama + " usia " + usia + " LULUS seleksi Beasiswa Pt Benang");
                    }
                }
                else if (pil == 2) {
                    do {
                       System.out.println(" --- Form Penilaian --- ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Struktur Konten dan esai   : ");
                konten = keyboard.nextDouble();
                System.out.print("Nilai Teknik Visual       : ");
                visual = keyboard.nextDouble();
                System.out.print("Nilai Nilai kemampuan Design Thinking   : ");
                design = keyboard.nextDouble();
               
            } while (design <= 100 ||konten <=100||visual <=100);

            
            }
            } while (pil != 3);
        }



        
        else if (pil == 2) {
            System.out.println(" --- Form Pendaftaran --- ");
            System.out.print(" Nama Lengkap   : ");
            nama = keyboard.next();
            
            System.out.print("Usia   : ");
            usia = keyboard.next();
            do {
                System.out.println(" --- Form Penilaian --- ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Struktur Konten jurnal   : ");
                jurnal = keyboard.nextDouble();
                System.out.print("Nilai Relevansi Data       : ");
                relevansi = keyboard.nextDouble();
                System.out.print("Nilai Problem Solving   : ");
                problem = keyboard.nextDouble();
               
            } while (design <= 100 ||konten <=100 || visual <=100);
}
            do {
                System.out.println(" --  Menu  -- ");
                System.out.println(" 1. Tampil ");
                System.out.println(" 2. Edit   ");
                System.out.println(" 3. Exit   ");
                System.out.print("menu : ");
                pil = keyboard.nextInt();
                if (pil == 1) {
                    double hasil;
                  mahasiswa maha;
                  maha = new mahasiswa (jurnal,relevansi,problem);
                    hasil = maha.hasil();
                    System.out.println("Nilai Akhir : " + hasil);
                    if (hasil < 87.5) {
                        System.out.println("Keterangan : GAGAL");
                        System.out.println("MOHON MAAF " + nama + " usia " + usia + " TIDAK LULUS seleksi Beasiswa Pt Benang");
                    }
                    else if (hasil >= 87.5) {
                        System.out.println("Keterangan : BERHASIL");
                        System.out.println("SElamat " + nama + " usia " + usia + " LULUS seleksi Beasiswa Pt Benang");
                    }
                }
                else if (pil == 2) {
                    do {
                       System.out.println(" --- Form Penilaian --- ");
                System.out.println("Ket: Nilai dari 1-100");
                System.out.print("Nilai Struktur Konten dan esai   : ");
                jurnal = keyboard.nextDouble();
                System.out.print("Nilai Teknik Visual       : ");
                relevansi = keyboard.nextDouble();
                System.out.print("Nilai Nilai kemampuan Design Thinking   : ");
                problem = keyboard.nextDouble();
               
            } while (jurnal <= 100 ||relevnsi <=100||problem <=100);
            }
            } while (pil != 3);
            
        }
  
