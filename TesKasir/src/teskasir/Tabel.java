/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teskasir;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author User
 */
public class Tabel extends AbstractTableModel{
    //membuat class Tabel yang merupakan turunan dari Abstract class AbstractTableModel
    //class Tabel akan mewarisi beberapa method public dari class abstracttablemodel
    ArrayList<Transaksi> transaksi = new ArrayList<>();
    //pembuatan arraylist dari kelas Transaksi dengan nama transaksi 
    String[] header = {"Tanggal", "Nama Barang", "Harga Barang", "Satuan","Total", "Tunai","Kembali"};
    //Membuat array dengan tipe string dengan value sebagai nama nama header
    public void add(Transaksi trd){
        //Membuat method add untuk menambah data pada arraylist transaksi
        transaksi.add(trd);
        //Memberitahukan table bahwa ada nilai baru yang di input
        fireTableRowsInserted(transaksi.size() - 1, transaksi.size() - 1);
    }
    //penerapan polimorfisme salah satunya yaitu override
    @Override
    public int getRowCount() {
        return transaksi.size();
    }

    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Transaksi t = transaksi.get(rowIndex);
            switch(columnIndex){
                //Mendapatkan nilai pada setiap method get pada class Transaksi
                case 0 :
                    return t.getTanggal();
                case 1 :
                    return t.getBarang();
                case 2 :
                    return t.getHarga();
                case 3 :
                    return t.getSatuan();
                case 4 :
                    return t.getTotal();
                case 5 :
                    return t.getTunai();
                case 6 :
                    return t.getKembali();                   
                default :
                    return "";
            }
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
}
