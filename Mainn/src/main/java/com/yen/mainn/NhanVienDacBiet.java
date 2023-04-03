/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yen.mainn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.xml.crypto.Data;

/**
 *
 * @author DELL
 */
public class NhanVienDacBiet extends NhanVien{
    private Data ngayNhamChucData;
    private int demSoPhongBan=0;
    private List<PhongBan> pb = new ArrayList<>();

    public NhanVienDacBiet(Data ngayNhamChucData, String email, String hoTen, String gioiTinh, String NgaySinh) {
        super(email, hoTen, gioiTinh, NgaySinh);
        this.ngayNhamChucData = ngayNhamChucData;
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
