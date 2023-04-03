/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yen.mainn;

import static com.yen.mainn.DuAn.sc;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class QuanLyNhanVien {

    private List<NhanVien> nv = new ArrayList<>();
    Scanner s = new Scanner(System.in);

//    public List<NhanVien> timNhanVien(String tuKhoa) {
//        List<NhanVien> kq1 = new ArrayList<>();
//        for (NhanVien n : this.nv) {
//            if (n.getHoTen().contains(tuKhoa) == true) {
//                kq1.add(n);
//            }
//        }
//        return kq1;
//    }
    public void hienThiDsTn(int maNhanVien){
        for(NhanVien nv : this.nv)
        {
            if (nv.getMaNV()== maNhanVien) {
                nv.hienThiTN();
            }
        }
    }
    
//    public void xuatThanNhan(){
//        System.out.println("Nhap ma nhan vien");
//        
//    }

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
