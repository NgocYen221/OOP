/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yen.mainn;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public abstract class Person {
    private String hoTen;
    private String gioiTinh;
    private String NgaySinh;

   

    public Person(String hoTen, String gioiTinh, String NgaySinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.NgaySinh = NgaySinh;
    }

    @Override
    public String toString() {
        return String.format("Ho Ten: %s\nGioi tinh: %s\nNgaySinh: %s\n",
                this.hoTen,this.gioiTinh, this.NgaySinh);
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the gioiTinh
     */
    public String getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the NgaySinh
     */
    public String getNgaySinh() {
        return NgaySinh;
    }

    /**
     * @param NgaySinh the NgaySinh to set
     */
    public void setNgaySinh(String NgaySinh) {
        this.NgaySinh = NgaySinh;
    }
    

 
}
