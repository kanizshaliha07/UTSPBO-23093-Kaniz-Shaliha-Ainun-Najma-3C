/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel.users;
import hotel.reservasi.Kamar;
import hotel.reservasi.Pesanan;
import hotel.users.Customer;
import hotel.users.Admin;

import java.util.Scanner;

/**
 *
 * @author LG
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Membuat objek kamar
        Kamar k1 = new Kamar("Suite", 1, 1000000);
        Kamar k2 = new Kamar("Presidential", 0, 2000000);
        
        //Membuat objek admin dan customer
        Admin admin = new Admin("admin123", "adminpass");
        Customer customer = new Customer("cust123", "custpass");
        
        //Simulasi login
        System.out.println("Login sebagai Admin atau Customer? (1: Admin, 2: Customer)");
        int pilihan = input.nextInt();
        input.nextLine();
        
        if (pilihan == 1){
            System.out.println("Username: ");
            String username = input.nextLine();
            System.out.println("Password: ");
            String password = input.nextLine();
            
            if (admin.login(username, password) == 1){
                System.out.println("Login berhasil sebagai Admin");
                //Admin mengecek persediaan kamar
                admin.cekKetersediaanKamar(k1);
                admin.ubahStatusKamar(k2, 1);
            } else {
                System.out.println("Login gagal");
            }
        } else if (pilihan == 2){
            System.out.println("Username: ");
            String username = input.nextLine();
            System.out.println("Password: ");
            String password = input.nextLine();
            
            if (customer.login(username, password) == 1){
                System.out.println("Login berhasil sebagai Customer");
                //Customer membuat pesanan
                Pesanan pesanan = new Pesanan(k1, username, 3);
                customer.buatPesanan(pesanan);
            } else {
                System.out.println("Login gagal");
            }
        } else {
            System.out.println("Pilihan tidak valid");
        }
        
        input.close();
    }
}
