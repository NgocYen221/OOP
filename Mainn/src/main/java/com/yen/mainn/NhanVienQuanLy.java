/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yen.mainn;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.crypto.Data;

/**
 *
 * @author DELL
 */
public class NhanVienQuanLy extends NhanVien{
    private Data ngayNhamChucData;
    private int demSoPhongBan=0;
    private List<PhongBan> pb = new ArrayList<>();
    
    public NhanVienQuanLy(String hoTen, String gioiTinh, String ngaySinh, String email, Data ngayNhamChucData) throws ParseException {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.ngayNhamChucData = ngayNhamChucData;
    }

    public NhanVienQuanLy(String hoTen, String gioiTinh, Date ngaySinh, String email, Data ngayNhamChucData) {
        super(hoTen, gioiTinh, ngaySinh, email);
        this.ngayNhamChucData = ngayNhamChucData;
    }

    @Override
    public double layHeSo() {
        System.out.println("Nhap he so");
        double heso = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.print("Luong: ");
        return heso;//To change body of generated methods, choose Tools | Templates.
    }

    

    @Override
    public double tinhLuong() {
        return luongcb * layHeSo();//To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    

    

    /**
     * @return the ngayNhamChucData
     */
    public Data getNgayNhamChucData() {
        return ngayNhamChucData;
    }

    /**
     * @param ngayNhamChucData the ngayNhamChucData to set
     */
    public void setNgayNhamChucData(Data ngayNhamChucData) {
        this.ngayNhamChucData = ngayNhamChucData;
    }

    /**
     * @return the pb
     */
    public List<PhongBan> getPb() {
        return pb;
    }

    /**
     * @param pb the pb to set
     */
    public void setPb(List<PhongBan> pb) {
        this.pb = pb;
    }

}