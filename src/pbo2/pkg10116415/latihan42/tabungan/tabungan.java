/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116415.latihan42.tabungan;

/**
 *
 * @author Server SMKS AL QUDSY
 */
class tabungan {
     private int saldo;

    public tabungan(){
        
    }
    
    public tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int ambilUang(int jumlah){
        int ambilUang;
        return ambilUang = jumlah - saldo;
    }
    
}
