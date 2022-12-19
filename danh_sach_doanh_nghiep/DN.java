/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package danh_sach_doanh_nghiep;

/**
 *
 * @author Admin
 */
class DN {
    private String madn , tendn ;
    private int sosv ;
    DN(){}
    DN ( String madn , String tendn , int sosv ) {
        this.madn= madn ;
        this.tendn = tendn ;
        this.sosv = sosv ;
    }

    public String getMadn() {
        return madn;
    }

    public void setMadn(String madn) {
        this.madn = madn;
    }

    public String getTendn() {
        return tendn;
    }

    public void setTendn(String tendn) {
        this.tendn = tendn;
    }

    public int getSosv() {
        return sosv;
    }

    public void setSosv(int sosv) {
        this.sosv = sosv;
    }
    @Override
    public String toString () {
        return madn + " " + tendn + " " + sosv ;
    }
}
