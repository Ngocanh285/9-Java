/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package phong;

/**
 *
 * @author Admin
 */
public class Phong {
    int sophong;
    String loaiphong;
    float giatien;
    String tinhtrang;
    public Phong (){
        
    }

    public Phong(int sophong, String loaiphong, float giatien, String tinhtrang) {
        this.sophong = sophong;
        this.loaiphong = loaiphong;
        this.giatien = giatien;
        this.tinhtrang = tinhtrang;
    }

    public int getSophong() {
        return sophong;
    }

    public void setSophong(int sophong) {
        this.sophong = sophong;
    }

    public String getLoaiphong() {
        return loaiphong;
    }

    public void setLoaiphong(String loaiphong) {
        this.loaiphong = loaiphong;
    }

    public float getGiatien() {
        return giatien;
    }

    public void setGiatien(float giatien) {
        this.giatien = giatien;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    @Override
    public String toString() {
        return "Phong{" + "sophong=" + sophong + ", loaiphong=" + loaiphong + ", giatien=" + giatien + ", tinhtrang=" + tinhtrang + '}';
    }
}
