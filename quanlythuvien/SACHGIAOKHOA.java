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
public class SACHGIAOKHOA extends SACH{
    private String tinhTrang;

    public SACHGIAOKHOA() {
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public SACHGIAOKHOA(String tinhTrang, String maSach, String NXB, Date ngayNhap, double donGia, double soLuong) {
        super(maSach, NXB, ngayNhap, donGia, soLuong);
        this.tinhTrang = tinhTrang;
    }

    @Override
    public double TinhTienGiam() {
        if(tinhTrang.equalsIgnoreCase("Mới"))
            return (soLuong*donGia*10)/100;
        else
            return (soLuong*donGia*50)/100;
        
    }

    @Override
    public double TinhThanhTien() {
        return soLuong*donGia-TinhTienGiam();
    }
    
    
}
