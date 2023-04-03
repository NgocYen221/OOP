/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.yen.mainn;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class ThanNhan extends Person {
    public static int dem;
    private int maTN = ++dem;
    private String moiQuanHe;

    public ThanNhan(String moiQuanHe, String hoTen, String gioiTinh, String NgaySinh) {
        super(hoTen, gioiTinh, NgaySinh);
        this.moiQuanHe = moiQuanHe;
    }

    @Override
    public String toString() {
        String s=super.toString();
        s+= String.format("Moi quan he: %s", moiQuanHe);
        return s;
                // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

  
    
 
    
    /**
     * @return the maThanNhan
     */
  
    /**
     * @return the moiQuanHe
     */
    public String getMoiQuanHe() {
        return moiQuanHe;
    }

    /**
     * @param moiQuanHe the moiQuanHe to set
     */
    public void setMoiQuanHe(String moiQuanHe) {
        this.moiQuanHe = moiQuanHe;
    }
   
}
