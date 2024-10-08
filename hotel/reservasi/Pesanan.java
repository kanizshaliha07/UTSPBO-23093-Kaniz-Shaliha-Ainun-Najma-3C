/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.reservasi;

/**
 *
 * @author LG
 */
public class Pesanan {
    private Kamar kamar;
    private String namaPemesan;
    private int durasiMenginap;
    
    //Constructor
    public Pesanan(Kamar kamar, String namaPesanan, int durasiMenginap){
        this.kamar = kamar;
        this.namaPemesan = namaPemesan;
        this.durasiMenginap = durasiMenginap;
    }
    
    //Method untuk menampilkan detail pesanan
    public void tampilkanDetailPesanan(){
        System.out.println("Nama Pemesan: " + namaPemesan);
        kamar.tampilkanDetail();
        System.out.println("Durasi Menginap: " + durasiMenginap + " hari");
    }
}
