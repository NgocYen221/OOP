/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yen.mainn;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DELL
 */
public class NhanVien {
    public static int dem;
    private int maNV = ++dem;
    private String hoTen;
    private String gioiTinh;
    private String ngaySinh;
    private String email;
    private List<ThanNhan> tn = new ArrayList<>();
    private List<DuAn> ds = new ArrayList<>();

    
    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String email) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.email = email;
    }
    
    
    public NhanVien() {

    }

    public void themTN(ThanNhan e){
        this.tn.add(e);
    }

    public void hienThiTN(){
        for(ThanNhan tn : this.tn){
            System.out.println(tn);
        }
    }
    
    @Override
    public String toString() {
            return String.format("Id: %d\nTen: %s\nGioi tinh: %s\nNgay sinh: %s\nEmail: %s\n",
                maNV, hoTen, gioiTinh, ngaySinh, email); 
    }
   
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the tn
     */
    public List<ThanNhan> getTn() {
        return tn;
    }

    /**
     * @param tn the tn to set
     */
    public void setTn(List<ThanNhan> tn) {
        this.tn = tn;
    }

    /**
     * @return the ds
     */
    public List<DuAn> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<DuAn> ds) {
        this.ds = ds;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }
}
