/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan33.userlogin;

import java.util.Scanner;
/**
 *
 * @author
 * Nama : Brigita Julia Puspita Nai Goncalves
 * Kelas: PBO-2
 * NIM  : 10117074
 * Deskripsi Program : Program ini berisi program yang menampilkan user login
 */
public class PBO210117074Latihan33UserLogin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User login = new User();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan Username: ");
        String user = scanner.next();
        System.out.println("Masukan Password: ");
        String password = scanner.next();
        System.out.println("");
        
        login.pengecekanLogin(user, password);
    }
    
}
