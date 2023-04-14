/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yen.mainn;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thanh
 */
public class QuanLyPhongBan {

    private List<PhongBan> pb = new ArrayList<>();
    
    public void hienThidsNv(int maNhanVien){
        
        
    }

    public void timKiemNhanVienTheoPB() {
        System.out.println("Nhap vao phong ban ");
        String tenPb = CauHinh.sc.nextLine();
        boolean ktra = false;
//        QuanLyPhongBan ketQua = new QuanLyPhongBan();
        for (PhongBan phongBan : this.pb) {
            if(phongBan.getTenPhongBan().equals(tenPb)){
                phongBan.hienThiNv();
                ktra = true;
            }     
        }
        if (ktra) {
            System.out.println("Tim kiem nhan vien thanh cong");
        } else {
            System.out.println("Khong ton tai nhan vien can tim");
        }
    }
     public void hienThi() {
        pb.forEach(s -> System.out.println(s));
    }
     
    public void themPB(PhongBan p){
        this.pb.add(p);
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
