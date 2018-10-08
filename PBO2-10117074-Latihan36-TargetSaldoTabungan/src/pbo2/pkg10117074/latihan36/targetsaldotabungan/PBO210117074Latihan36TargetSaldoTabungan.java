/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan36.targetsaldotabungan;

/**
 *
 * @author
 * Nama : Brigita Julia Puspita Nai Goncalves
 * Kelas: PBO-2
 * NIM  : 10117074
 * Deskripsi Program : program ini berisi program yang menampilkan target saldo
 * tabungan nasabah
 */
public class PBO210117074Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldo = 3500000;
        double bunga = 0.08;
        double bulan = 0;
        
        SaldoTabungan targetsaldotabungan = new SaldoTabungan();
        targetsaldotabungan.hitungSaldoTabungan(saldo, bulan, bunga);
    
    }
    
}
