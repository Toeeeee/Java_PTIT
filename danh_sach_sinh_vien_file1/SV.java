/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
packag danh_sach_sinh_vien_file1;

/**
 *
 * @author Admin
 */
class SV {

    private String maSV, ten, lop, email;

    public SV(String maSV, String ten, String lop, String email) {
        this.maSV = maSV;   
        String[] s = ten.split("\\s+");
        String x = "";
        for (int i = 0; i < s.length; i++) {
            x = x + s[i].substring(0, 1).toUpperCase() + s[i].substring(1).toLowerCase() + " ";
        }
        this.ten = x;
        this.lop = lop;
        this.email = email;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return maSV + " " + ten + lop + " " + email;
    }
}
