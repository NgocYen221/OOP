/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yen.mainn;

import java.text.ParseException;
import java.util.Set;

/**
 *
 * @author DELL
 */
public class Mainn {

    public static void main(String[] args) throws ParseException {
        DuAn da = new DuAn("A", "22/1/2002", "22/1/2003", 10);
        DuAn da0 = new DuAn("A", "22/12/2002", "22/1/2003", 20);
        DuAn da1 = new DuAn("B", "22/2/2002", "22/2/2003", 30);
        DuAn da2 = new DuAn("C", "22/3/2002", "22/3/2003", 15);
        DuAn da3 = new DuAn("D", "22/4/2002", "22/4/2003", 25);

        ThanNhan tn = new ThanNhan("Cha", "Nguyen A Z", "Nam", "22/6/2010");
        ThanNhan tn0 = new ThanNhan("Me", "Nguyen A Y", "Nu", "22/6/2009");
        
        NhanVien nv = new NhanVien("abc@gmail.com", "Nguyen A", "Nu", "22/7/2012");
        nv.themTN(tn);
        nv.themTN(tn0);
        
        ThanNhan tn1 = new ThanNhan("Cha", "Nguyen B Z", "Nam", "22/6/2010");
        ThanNhan tn2 = new ThanNhan("Me", "Nguyen B Y", "Nu", "22/6/2009");
        
        NhanVien nv1 = new NhanVien("abc@gmail.com", "Nguyen B", "Nu", "22/7/2012");
        nv1.themTN(tn1);
        nv1.themTN(tn2);
        
        System.out.println("Nhan vien: A");
        System.out.println(nv);
        nv.hienThiTN();
        
        System.out.println("Nhan vien: B");
        System.out.println(nv1);
        nv1.hienThiTN();
        
        QuanLyDuAn qlda = new QuanLyDuAn();
        qlda.themDuAn(da);
        qlda.themDuAn(da0);
        qlda.themDuAn(da1);
        qlda.themDuAn(da2);
        qlda.themDuAn(da3);

//        qlda.hienThi();
        qlda.hienThi();
        String tenDuAn;
        int nhap;
        do {
            System.out.println("\n<------------Menu------------>");
            System.out.println("1.Them/xoa/sua du an");
            System.out.println("2.Tinh luong cho nhan vien");
            System.out.println("3.Xem danh sach nhan vien cua 1 du an");
            System.out.println("4.Xem danh sach du an cua 1 nhan vien");
            System.out.println("5.Tim kiem ");
            System.out.println("6.Tim kiem theo Ten hoac thoi gian bat dau cua Du An ");
            System.out.println("7.Sap xep Du An ");
            System.out.println("8.Xuat danh sach than nhan");
            System.out.println("9.Hien thi Du An");
            System.out.println("10.Ban chon thoat");
            System.out.println("Chon phuong thuc: ");
            nhap = Integer.parseInt(CauHinh.sc.nextLine());
//            CauHinh.sc.nextLine();
            switch (nhap) {
                case 1:
                    int chon;
                    do {
                        System.out.println("\n<------------Menu them/sua/xoa------------>");
                        System.out.println("1.Them du an");
                        System.out.println("2.Xoa du an");
                        System.out.println("3.Sua du an");
                        System.out.println("4.Xem ds du an");
                        System.out.println("5.Ban chon thoat");
                        System.out.println("Chon phuong thuc: ");
                        chon =  Integer.parseInt(CauHinh.sc.nextLine());
//                        CauHinh.sc.nextLine();
                        switch (chon) {
                            case 1:
                                qlda.nhapDA();
                                System.out.println("Them du an thanh cong");
                                break;
                            case 2:
                                System.out.println("Nhap ten du an can xoa:");
                                tenDuAn = CauHinh.sc.nextLine();
                                if (qlda.timDuAn(tenDuAn).size() > 0) {
                                    qlda.xoaDuAn(qlda.timDuAn(tenDuAn));
                                    System.out.println("Xoa du an thanh cong"); }
                                else 
                                    System.out.println("Khong co ten du an muon xoa");
                                break;
                            case 3:
                                qlda.suaDuAn();
                                break;
                            case 4:
                                qlda.hienThi();
                                break;
                            case 5:
                                System.out.println("Ban chon thoat");
                                break;
                            default:
                                System.err.print("Ban chon sai");
                        }
                    } while (chon > 0 && chon < 6);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    System.out.println("Nhap Ten hoac thoi gian bat dau cua Du An can tim:");
                    CauHinh.sc.nextLine();
                    QuanLyDuAn qlt = new QuanLyDuAn();
                    tenDuAn = CauHinh.sc.nextLine();
                    qlt.setDs(qlda.timDuAn(tenDuAn));
                    if (qlt.getDs().size() > 0) {
                        System.out.println("Tim kiem Du An thanh cong");
                        qlt.hienThi();
                    } else {
                        System.out.println("Khong tim thay Du An cam tim");
                    }
                    break;
                case 5:
                    qlda.sapXep();
                    qlda.hienThi();
                    break;
                case 6:
                    nv.hienThiTN();
                case 7:
                    qlda.hienThi();
                    break;
                case 8:
                    qlda.hienThi();
                    break;
                case 9:
                    qlda.hienThi();
                    break;
                case 10:
                    return;
                default:
                    throw new AssertionError();
            }

        } while (nhap != 0);
    }

}
