


import java.text.NumberFormat;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Inezita
 */

// Class Barang
// Abstracr
abstract class Barang {
    private String namaBarang;
    private int hargaBarang;
   
    
    // Method Constructor
    // Overloading
    public Barang(String namaBarang){
        this.namaBarang = namaBarang;
        this.hargaBarang = 0;
    }
    
    public Barang(String namaBarang, int hargaBarang){
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    
    // Encapsulation
    public void setNamaBarang(String namaBarang){
        this.namaBarang = namaBarang;
    }
    
    public void setHargaBarang(int hargaBarang){
        this.hargaBarang = hargaBarang;
    }
    
    public String getNamaBarang(){
        return this.namaBarang;
    }
    
    public int getHargaBarang(){
        return this.hargaBarang;
    }
    
    public void cetakInfo(){
        System.out.println("Nama Barang: " + this.namaBarang + 
                            ", Harga Barang : " + this.hargaBarang);
    }

    
}
