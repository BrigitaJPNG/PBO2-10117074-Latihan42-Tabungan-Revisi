/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan37.rataratanilai;
import java.util.Scanner;
/**
 *
 * @author
 * Nama : Brigita Julia Puspita Nai Goncalves
 * Kelas: PBO-2
 * NIM  : 10117074
 * Deskripsi Program : program ini berisi program rata-rata nilai mahasiswa
 */
public class PBO210117074Latihan37RataRataNilai {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int jmlMhs;
        Scanner scanner = new Scanner(System.in);
        RataRata rata2 = new RataRata();
        
        System.out.print("Masukan Banyaknya Mahasiswa : ");
        jmlMhs = scanner.nextInt();
        
        rata2.hitungNilai(jmlMhs);
        double jmlNilai;
        System.out.println("\n" + "Rata Rata Nilainya adalah : " + 
                rata2.hitungRata2Nilai(rata2.jmlNilai,jmlMhs));
       
    }
    
}
