

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Inezita
 */

// Inheritance
public class MinyakGoreng extends Barang{
    private String kodeBarang;
    
    public MinyakGoreng(String namaBarang, String kodeBarang){
        super(namaBarang);
        this.kodeBarang = kodeBarang;
    }
 
    public MinyakGoreng(String namaBarang, int hargaBarang, String kodeBarang){
        super(namaBarang, hargaBarang);
        this.kodeBarang = kodeBarang;
       
    }
    
    // Encapsulation
    public void setKodeBarang(String kodeBarang){
        this.kodeBarang = kodeBarang;
    }
    
    public String getKodeBarang(){
        return this.kodeBarang;
    }
    
    
    public void cetakInfo(){
        super.cetakInfo();
        System.out.println(", Kode Barang : " + this.kodeBarang);
    }
    
    
}
