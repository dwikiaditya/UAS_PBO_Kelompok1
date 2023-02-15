/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teskasir;
/**
 *
 * @author User
 */
public class Transaksi {
    //membuat class Transaksi
    String tanggal,barang,harga,satuan,total,tunai,kembali;
    //membuat variable string 
    public Transaksi(String tanggal,String barang,String harga,String satuan,String total,String tunai,String kembali){
        //membuat consuktor dengan 7 parameter
        this.tanggal=tanggal;
        this.barang=barang;
        this.harga=harga;
        this.satuan=satuan;
        this.total=total;
        this.tunai=tunai;
        this.kembali=kembali;
        //merubah qword this mengubah variable lokal ke global
    }
        //penerapan enkapsulasi untuk setiap variable
    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getBarang() {
        return barang;
    }

    public void setBarang(String barang) {
        this.barang = barang;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getTunai() {
        return tunai;
    }

    public void setTunai(String tunai) {
        this.tunai = tunai;
    }

    public String getKembali() {
        return kembali;
    }

    public void setKembali(String kembali) {
        this.kembali = kembali;
    }
    
}
