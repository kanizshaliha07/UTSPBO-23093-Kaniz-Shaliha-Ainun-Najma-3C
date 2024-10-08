/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.users;
import hotel.reservasi.Kamar;

/**
 *
 * @author LG
 */
public class Admin extends User {
    //Constructor
    public Admin(String username, String password){
        super(username, password);
    }
    
    //Method untuk mengecek ketersediaan kamar
    public void cekKetersediaanKamar(Kamar kamar){
        System.out.println("Cek ketersediaan Kamar untuk Admin");
        if (kamar.getTersedia() == 1){
            System.out.println("Kamar " + kamar.getTipeKamar() + " tersedia.");
        } else {
            System.out.println("Kamar " + kamar.getTipeKamar() + " tidak tersedia.");
        }
    }
    
    //Method untuk mengubah status ketersediaan kamar
    public void ubahStatusKamar(Kamar kamar, int status){
        kamar.setTersedia(status);
        System.out.println("Status kamar " + kamar.getTipeKamar() + " telah diubah.");
    }
}
