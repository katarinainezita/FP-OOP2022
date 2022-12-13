# Final Project OOP

Cashier Application with Java Netbeans

Demo Applikasi
https://youtu.be/n9Hk0Sizaus

Referensi
https://www.youtube.com/watch?v=u-GB4tQKj_E&list=PLrPNrZZnxC8cMwZBE2pZGPcHFL8q36l88&index=6&ab_channel=KhasanAsrori

## Introduce
Name : Katarina Inezita Prambudi

NRP : 5025211148

Class : PBO (B)

## About Program
Aplikasi yang akan dibuat adalah mengenai aplikasi kasir. Terdapat 
beberapa fitur dalam aplikasi tersebut, yaitu :

* Kode Barang
* Nama Barang
* Harga Barang
* Jumlah Barang
* PPN (Pajak)
* Diskon
* Total Harga 

Untuk menjalankan program ini, pengguna harus memasukkan kode barang terlebih dahulu. Kode barang inilah yang nantinya akan menampilkan 
* Nama Barang
* Harga Barang

Apabila terdapat diskon dan PPN, maka pengguna dapat memasukkannya dalam program. 
Nantinya program akan langsung
menampilkan total harga setelah diskon dan PPN .

## Implementation
Program ini akan menerapkan beberapa aspek dari OOP, yaitu:


### 1. Casting/Conversion

Casting / Conversion pada program ini terletak pada file :

a. CashierForm.java

* Diskon
```
diskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) * Integer.parseInt(txtDiskon.getText()) / 100;
hasilDiskon = Integer.parseInt(txtJumlahHarga.getText().replace(".", "")) - diskon;
```

* TotalHarga

```
hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * 0;
hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * Integer.parseInt(txtQTY.getText());
```

* jmlTotalHarga

```
subTotal += Integer.parseInt((String) tblList.getValueAt(i, 5).toString().replace(".", ""));
```


###  2. Constructor

Constructor pada program ini terletak pada file :

a. CashierForm.java 

```
public CashierForm() {
      initComponents();
      listBarang();
      KodeBarang();
      TotalHarga();
      Diskon();  
}
```

b. Barang.java

```
public Barang(String namaBarang){
  this.namaBarang = namaBarang;
  this.hargaBarang = 0;
}
```

c. Beras.java

```
public Beras(String namaBarang, String kodeBarang){
  super(namaBarang);
  this.kodeBarang = kodeBarang;
}
```

d. MinyakGoreng.java

```
public MinyakGoreng(String namaBarang, String kodeBarang){
  super(namaBarang);
  this.kodeBarang = kodeBarang;
}
```

e. Rokok.java

```
public Rokok(String namaBarang, String kodeBarang){
  super(namaBarang);
  this.kodeBarang = kodeBarang;
}
```

f. Gula.java

```
public Gula(String namaBarang, String kodeBarang){
  super(namaBarang);
  this.kodeBarang = kodeBarang;
}
```

### 3. Overloading

Overloading pada program ini terletak pada file :

a. Barang.java

```
public Barang(String namaBarang){
  this.namaBarang = namaBarang;
  this.hargaBarang = 0;
}
    
public Barang(String namaBarang, int hargaBarang){
  this.namaBarang = namaBarang;
  this.hargaBarang = hargaBarang;
}
```

b. Beras.java

```
public Beras(String namaBarang, String kodeBarang){
  super(namaBarang);
  this.kodeBarang = kodeBarang;
}
 
public Beras(String namaBarang, int hargaBarang, String kodeBarang){
  super(namaBarang, hargaBarang);
  this.kodeBarang = kodeBarang;
       
}
```

c. MinyakGoreng.java

```
public MinyakGoreng(String namaBarang, String kodeBarang){
  super(namaBarang);
  this.kodeBarang = kodeBarang;
}
 
public MinyakGoreng(String namaBarang, int hargaBarang, String kodeBarang){
  super(namaBarang, hargaBarang);
  this.kodeBarang = kodeBarang;
       
}
```

d. Rokok.java

```
public Rokok(String namaBarang, String kodeBarang){
  super(namaBarang);
  this.kodeBarang = kodeBarang;
}
 
public Rokok(String namaBarang, int hargaBarang, String kodeBarang){
  super(namaBarang, hargaBarang);
  this.kodeBarang = kodeBarang;
       
}
```

e. Gula.java

```
public Gula(String namaBarang, String kodeBarang){
  super(namaBarang);
  this.kodeBarang = kodeBarang;
}
 
public Gula(String namaBarang, int hargaBarang, String kodeBarang){
  super(namaBarang, hargaBarang);
  this.kodeBarang = kodeBarang;
       
}
```

### 4. Overriding

Overriding pada program ini terletak pada file :

a. Barang.java

```
public void cetakInfo(){
  System.out.println("Nama Barang: " + this.namaBarang + ", Harga Barang : " + this.hargaBarang);
    }
```

b. Beras.java , MinyakGoreng.java, Gula.java

```
public void cetakInfo(){
  super.cetakInfo();
  System.out.println(", Kode Barang : " + this.kodeBarang);
}
```

### 5. Encapsulation

Encapsulation pada program ini terletak pada file :

a. Barang.java

```
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
```

b. Beras.java, MinyakGoreng.java, Gula.java, Rokok.java

```
public void setKodeBarang(String kodeBarang){
  this.kodeBarang = kodeBarang;
}
    
public String getKodeBarang(){
  return this.kodeBarang;
}
``` 

### 6. Inheritance

Inheritance pada program ini terletak pada file :

a. Beras.java, MinyakGoreng.java, Gula.Java, Rokok.Java

```
public class Beras<T> extends Barang
public class MinyakGoreng<T> extends Barang
public class Gula<T> extends Barang
public class Rokok extends Barang
```

b. CashierFrom.java

```
public class CashierForm extends javax.swing.JFrame
```

### 7. Polymorphism

Polymorphism pada program ini terletak pada file :

a. CashierForm.java

```
Barang beras = new Beras("Beras", 30000, "A001");
Barang minyakGoreng = new MinyakGoreng ("Minyak Goreng", 15000, "A002");
Barang gula = new Gula("Gula", 12000, "A003");
```


### 8. ArrayList

ArrayList pada program ini terletak pada file :

a. CashierForm.java

```
ArrayList<Barang> list = new ArrayList<>();

public ArrayList listBarang(){
  
  list.add(beras);
  list.add(minyakGoreng);
  list.add(gula);
            
  return list;    
}
```

### 9. Exception Handling

Exception Handling pada program ini terletak pada file :

a. CashierForm.java (TotalHarga)

```
try{
  int hasil = 0;
    if(txtQTY.getText().equals("")){
      hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * 0; 
    } else {
      hasil = Integer.parseInt(txtHargaBarang.getText().replace(".", "")) * Integer.parseInt(txtQTY.getText());
    }
    
  txtTotalHarga.setText(nf.format(hasil));
  
} catch (Exception e){

}
```

### 10. GUI

GUI pada program ini terletak pada file :

a. CashierForm.java

```
import javax.swing.event.DocumentEvent;
import javax.swing.table.DefaultTableModel;

private void txtKodeBarangActionPerformed(java.awt.event.ActionEvent evt) {}

private void chkPPNActionPerformed(java.awt.event.ActionEvent evt) {jmlTotalHarga();}

private void txtQTYActionPerformed(java.awt.event.ActionEvent evt) {                                       
  if (txtQTY.getText().equals("")){
    return;
  }else{
    DefaultTableModel model = (DefaultTableModel) tblList.getModel();
            
      Object obj [] = new Object[6];

      obj[1] = txtKodeBarang.getText();
      obj[2] = txtNamaBarang.getText();
      obj[3] = txtHargaBarang.getText();
      obj[4] = txtQTY.getText(); 
      obj[5] = txtTotalHarga.getText();
            
    model.addRow(obj);
            
    int baris = model.getRowCount();

    for(int i = 0; i < baris; i++){
      String no = String.valueOf(i + 1);
      model.setValueAt(no + ".", i, 0);
    }
    
    tblList.setRowHeight(30);
            
    lblJmlQTY.setText(String.valueOf(baris));
            
    jmlTotalHarga();
    bersih();
    }
} 

private javax.swing.JCheckBox chkPPN;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JLabel jLabel4;
private javax.swing.JLabel jLabel6;
private javax.swing.JPanel jPanel1;
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JLabel lblJmlHarga;
private javax.swing.JLabel lblJmlQTY;
private javax.swing.JTable tblList;
private javax.swing.JTextField txtDiskon;
private javax.swing.JTextField txtHargaBarang;
private javax.swing.JTextField txtHasilDiskon;
private javax.swing.JTextField txtHasilPPN;
private javax.swing.JTextField txtJumlahHarga;
private javax.swing.JTextField txtKodeBarang;
private javax.swing.JTextField txtNamaBarang;
private javax.swing.JTextField txtQTY;
private javax.swing.JTextField txtTotalHarga;
```

### 11. Interface

Interface pada program ini terletak pada file :

a. BarangKhusus.java
```
interface BarangKhusus {
    void kodeBarang();
}
```

b. Rokok.java

```
public class Rokok extends Barang implements BarangKhusus {
  @Override
    public void kodeBarang() {
       System.out.println("Kode : " + this.getKodeBarang());
    }
}
```

### 12. Abstract Class

Abstract Class pada program ini terletak pada file :

a. Barang.java
```
abstract class Barang {
    private String namaBarang;
    private int hargaBarang;

    public Barang(String namaBarang){
        this.namaBarang = namaBarang;
        this.hargaBarang = 0;
    }
    
    public Barang(String namaBarang, int hargaBarang){
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

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
```

### 13. Generics

Generics pada program ini terletak pada file :

a. Beras.java, MinyakGoreng.java, Gula.java

```
public class Beras<T> extends Barang {}
public class Gula<T> extends Barang {}
public class MinyakGoreng<T> extends Barang ()

```

### 14. Collection

Collection pada program ini terletak pada file :


a. CashierForm.java

```
    ArrayList<Barang> list = new ArrayList<>();
    public ArrayList listBarang(){
   
            list.add(beras);
            list.add(minyakGoreng);
            list.add(gula);
            
            return list;
    }
```
### 15. Input Output

Hasil input output seperti pada gambar dibawah ini :

![ScreenShot](https://github.com/katarinainezita/FP-OOP2022/blob/d12ba226e647006d912b552c61c83418bf3fcd61/InputOutput.jpg)
