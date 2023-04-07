/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yen.mainn;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class PhongBan {
    private int maPhongBan;
    private int tenPhongBan;
    private List<NhanVien> nv = new ArrayList<>();

   
    public void themNvDb(NhanVienQuanLy nvdb){
        
    }
    /**
     * @return the tenPhongBan
     */
    public int getTenPhongBan() {
        return tenPhongBan;
    }

    /**
     * @param tenPhongBan the tenPhongBan to set
     */
    public void setTenPhongBan(int tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }

    /**
     * @return the nv
     */
    public List<NhanVien> getNv() {
        return nv;
    }

    /**
     * @param nv the nv to set
     */
    public void setNv(List<NhanVien> nv) {
        this.nv = nv;
    }
   
}
