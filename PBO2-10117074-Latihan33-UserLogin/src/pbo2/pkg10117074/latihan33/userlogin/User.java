/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan33.userlogin;

/**
 *
 * @author
 * Nama : Brigita Julia Puspita Nai Goncalves
 * Kelas: PBO-2
 * NIM  : 10117074
 * Deskripsi Program : Program ini berisi program yang menampilkan data package
 * user
 */
public class User {
    private String username = "Brigita";
    private String password = "Julia";
    private boolean statusAkun;
    
    private boolean cekAkun(String userName,String password){
        if (userName.equals(username)){
            statusAkun = true;           
        }
        else if ( password.equals(password)){
             statusAkun = false;  
        } 
        else{
            statusAkun = false;
        }
         return statusAkun;
       
}
    private void hasilLogin(boolean statusAkun, String userName){
        if(statusAkun){
            System.out.println("*****Hallo " + userName.toUpperCase() 
                                + "*****");
            System.out.println("Selamat Datang di Applikasi ini");
        }
        else {
            System.out.println("Oooppss,Username atau Password Anda salah");
        }
        }
    

    public void pengecekanLogin(String userName, String password){
        System.out.println(cekAkun(userName, password));
        hasilLogin(statusAkun, userName);
    }
}
