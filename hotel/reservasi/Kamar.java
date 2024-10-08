/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservasi;

/**
 *
 * @author LG
 */
public class Kamar {
    private String tipeKamar;
    private int tersedia;
    private double harga;
    
    //Constructor
    public Kamar(String tipeKamar, int tersedia, double harga){
        this.tipeKamar = tipeKamar;
        this.tersedia = tersedia;
        this.harga = harga;
    }
    
    public String getTipeKamar(){
        return tipeKamar;
    }
    public void setTersedia(int tersedia){
        this.tersedia = tersedia;
    }
    public double getHarga(){
        return harga;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }
    
    ////Method untuk menampilkan detail kamar
    public void tampilkanDetail(){
        System.out.println("Tipe Kamar: " + tipeKamar + ", Harga: " + harga + 
                ", Tersedia: " + (tersedia == 1 ? "Ya" : "Tidak"));
    }

    public int getTersedia() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
