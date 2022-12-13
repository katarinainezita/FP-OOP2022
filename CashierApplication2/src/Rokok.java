/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Inezita
 */
public class Rokok extends Barang implements BarangKhusus {
    
    private String kodeBarang;
    public Rokok(String namaBarang, String kodeBarang){
        super(namaBarang);
        this.kodeBarang = kodeBarang;
    }
 
    public Rokok(String namaBarang, int hargaBarang, String kodeBarang){
        super(namaBarang, hargaBarang);
        this.kodeBarang = kodeBarang;
       
    }

    public void setKodeBarang(String kodeBarang){
        this.kodeBarang = kodeBarang;
    }
    
    public String getKodeBarang(){
        return this.kodeBarang;
    }

    @Override
    public void kodeBarang() {
       System.out.println("Kode : " + this.getKodeBarang());
    }

 
    

    
}
