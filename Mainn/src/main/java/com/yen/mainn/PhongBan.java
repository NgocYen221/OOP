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
    public static int dem;
    private int maPhongBan = ++dem;
    private String tenPhongBan;
    private NhanVien nvql;
    private List<NhanVien> nv = new ArrayList<>();

    /**
     * @return the nvql
     */
    public NhanVien getNvql() {
        return nvql;
    }

    /**
     * @param nvql the nvql to set
     */
    public void setNvql(NhanVien nvql) {
        this.nvql = nvql;
    }

    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
    }
   
   
    public void themNVQL(NhanVienQuanLy nvql){
        if(nvql.getPb().size()<2){
            this.setNvql(nvql);
            nvql.getPb().add(this);
        }else{
            System.out.println("Khong the them nhan vien vi nhan vien chi duoc quan ly toi da 2 phong ban");
        }
    }
    
    public void themNV(NhanVien n){
        
        this.getNv().add(n);
    }
     public void hienThiNv(){
         System.out.println("Nhan vien quan li:\n"+nvql);
         for(NhanVien nhanVien: this.getNv())
         {
             System.out.println(nhanVien);
         }
     }

    @Override
    public String toString() {
        return String.format("Ma phong ban: %d\nTen phong ban : %s\n", 
                this.getMaPhongBan(),this.getTenPhongBan())+"NVQL"+nvql;
    }
    
    

    /**
     * @return the maPhongBan
     */
    public int getMaPhongBan() {
        return maPhongBan;
    }

    /**
     * @param maPhongBan the maPhongBan to set
     */
    public void setMaPhongBan(int maPhongBan) {
        this.maPhongBan = maPhongBan;
    }

    /**
     * @return the tenPhongBan
     */
    public String getTenPhongBan() {
        return tenPhongBan;
    }

    /**
     * @param tenPhongBan the tenPhongBan to set
     */
    public void setTenPhongBan(String tenPhongBan) {
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

