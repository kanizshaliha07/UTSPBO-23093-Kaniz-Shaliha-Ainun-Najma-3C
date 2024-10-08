/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.users;
import hotel.reservasi.Pesanan;

/**
 *
 * @author LG
 */
public class Customer extends User {
    //Constructor
    public Customer(String username, String password){
        super(username, password);
    }
    
    //Method khusus customer
    public void buatPesanan(Pesanan pesanan){
        System.out.println("Pesanan berhasil dibuat untuk: " + getUsername());
        pesanan.tampilkanDetailPesanan();
    }
}
