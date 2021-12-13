/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UKL2;

/**
 *
 * @author ASUS
 */
public class Transaksi {

    jenisLaundry selectedLaundry;
    double jumlah;
    double total;

public Transaksi(jenisLaundry selectedLaundry, double jumlah, int qty) {
        this.selectedLaundry = selectedLaundry;
        this.jumlah = jumlah;
        this.total = selectedLaundry.getHarga() * jumlah;
    }

    Transaksi(jenisLaundry selectedLaundry, int qty) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }




}