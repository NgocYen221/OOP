/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yen.mainn;

import static com.yen.mainn.DuAn.sc;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

/**
 *
 * @author DELL
 */
public class QuanLyDuAn {

    private List<DuAn> ds = new ArrayList<>();

    public void themDuAn(DuAn d) {
        this.ds.add(d);
    }

    public void xoaDuAn(List<DuAn> d) {
        for (DuAn da : d) {
            this.ds.remove(da);
        }
    }

      public void suaDuAn() {
        System.out.println("Nhap ten du an");
        String tenDA = sc.nextLine();
        boolean KiemTra = false;
        for (DuAn da : this.ds) {
            if (da.getTenDuAn().equals(tenDA)) {
                KiemTra = true;
                System.out.println("Nhap lai ten du an");
                String ten = sc.nextLine();
                da.setTenDuAn(ten);

                System.out.println("Nhap lai ngay bat dau");
                String tgbd = sc.nextLine();
                da.setTgBatDau(tgbd);

                System.out.println("Nhap lai ngay ket thuc");
                String tgkt = sc.nextLine();
                da.setTgKetThuc(tgkt);

                System.out.println("Nhap lai kinh phi");
                int kp = sc.nextInt();
                da.setKinhPhiDauTu(kp);
                break;
            }
        }
        if (KiemTra) {
            this.hienThi();
            System.out.println("Sua thanh cong");
        } else {
            System.out.println("Khong ton tai du an can sua");

        }
    }

    public List<DuAn> timDuAn(String tuKhoa) {
        return this.ds.stream().filter(s -> s.getTenDuAn().contains(tuKhoa) == true
                || s.getTgBatDau().contains(tuKhoa)).collect(Collectors.toList());
    }

    public void sapXep() {
        this.ds.sort((s1, s2) -> {
            int kp1 = s1.getKinhPhiDauTu();
            int kp2 = s2.getKinhPhiDauTu();
            return kp1 > kp2 ? 1 : (kp1 < kp2 ? -1 : 0);
        });
    }

    public void hienThi() {
        ds.forEach(s -> System.out.println(s));
    }

    public void nhapDA() {
        System.out.println("Nhap ten du an: ");
        String ten = sc.nextLine();
        System.out.println("Thoi gian bat dau ");
        String tgbd = sc.nextLine();
        System.out.println("Thoi gian ket thuc: ");
        String tgkt = sc.nextLine();
        System.out.println("Kinh phi dau tu: ");
        int kp = sc.nextInt();
        DuAn da = new DuAn(ten, tgbd, tgkt, kp);

        themDuAn(da);

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

}
