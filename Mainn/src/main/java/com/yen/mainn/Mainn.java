/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.yen.mainn;

import java.text.ParseException;
import java.util.Scanner;
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

        ThanNhan tn = new ThanNhan("Cha", "Z", "Nam", "22/6/2010");
        ThanNhan tn0 = new ThanNhan("Me", "Y", "Nu", "22/6/2009");

        NhanVien nv = new NhanVien("abc@gmail.com", "ad", "Nu", "22/7/2012");
        nv.themTN(tn);
        nv.themTN(tn0);
        nv.hienThiTN();

        QuanLyDuAn qlda = new QuanLyDuAn();
        qlda.themDuAn(da);
        qlda.themDuAn(da0);
        qlda.themDuAn(da1);
        qlda.themDuAn(da2);
        qlda.themDuAn(da3);

        qlda.hienThi();
        qlda.hienThi();
        String tenDuAn;
        Scanner sc = new Scanner(System.in);
        int nhap;
        do {

            System.out.println("\n<------------Menu------------>");
            System.out.println("1.Them Du An ");
            System.out.println("2.Xoa Du An ");
            System.out.println("3.Sua Du An ");
            System.out.println("4.Tim kiem theo Ten hoac thoi gian bat dau cua Du An ");
            System.out.println("5.Sap xep Du An ");
            System.out.println("6.Xuat danh sach than nhan");

            System.out.println("20.Hien thi Du An ");
            System.out.print("Chon phuong thuc: ");

            nhap = sc.nextInt();
            switch (nhap) {
                case 1:
                    qlda.nhap();
                    System.out.println("Them Du An thanh cong");
                    qlda.hienThi();
                    break;
                case 2:
                    System.out.println("Nhap Ten Du An can xoa:");
                    sc.nextLine();
                    tenDuAn = sc.nextLine();
                    qlda.xoaDuAn(qlda.timDuAn(tenDuAn));
                    System.out.println("Xoa Du An thanh cong");
                    qlda.hienThi();
                    break;
                case 3:
                    qlda.suaDuAn();
                    qlda.hienThi();
                    break;
                case 4:
                    System.out.println("Nhap Ten hoac thoi gian bat dau cua Du An can tim:");
                    sc.nextLine();
                    QuanLyDuAn qlt = new QuanLyDuAn();
                    tenDuAn = sc.nextLine();
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
                case 20:
                    qlda.hienThi();
                    break;

                default:
                    throw new AssertionError();
            }

        } while (nhap != 0);
    }

}
