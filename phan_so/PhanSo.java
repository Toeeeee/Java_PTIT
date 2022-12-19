/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package phan_so;

/**
 *
 * @author Admin
 */
class PhanSo {
    private long tu ,mau ;
    PhanSo(){} 
    PhanSo ( long tu , long mau ) {
        this.mau = mau ;
        this.tu = tu ;
    }

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    @Override
    public String toString() {
        return tu + "/" + mau ;
    }
    public void rutgon() {
        long x = usc(tu,mau) ;
        tu /= x ;
        mau /= x ;
    }
    private long usc ( long a , long b ) {
        while ( b > 0 ) {
            long t = a% b ;
            a = b ;
            b = t ;
        }
        return a ;
    }
}
