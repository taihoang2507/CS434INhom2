/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

import java.util.Date;

/**
 *
 * @author taitongg
 */
public class SACHTHAMKHAO extends SACH{
    private double thue;

    public SACHTHAMKHAO() {
    }

    public SACHTHAMKHAO(double thue, String maSach, String NXB, Date ngayNhap, double donGia, double soLuong) {
        super(maSach, NXB, ngayNhap, donGia, soLuong);
        this.thue = thue;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }

    @Override
    public double TinhTienGiam() {
        return 0;
    }

    @Override
    public double TinhThanhTien() {
        return soLuong*donGia+thue-TinhTienGiam();
    }
   
    
}
