/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan42.tabungan;
import java.util.Scanner;
/**
 * Nama : Brigita Julia Puspira Nai Goncalves
 * Kelas: PBO-2
 * NIM  : 10117074
 * Deskripsi Program : program ini berisi program penarikan uang pada saldo
 * tabungan
 */
public class PBO210117074Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);
        tabungan tbg = new tabungan();
        int jumlah;
        int saldo;
   
        System.out.println("===Program Penarikan Uang===");
        System.out.print("Masukkan Saldo Awal : Rp ");
        saldo = scn.nextInt();
        System.out.print("Jumlah uang yang diambil : Rp ");
        jumlah = scn1.nextInt();
        
        System.out.println("");
        System.out.println("Saldo Anda Sekarang : Rp " + tbg.ambilUang(saldo - jumlah));
    }
}
