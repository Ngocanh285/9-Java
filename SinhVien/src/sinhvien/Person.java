/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinhvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Person {
    private String name;
    private String gender;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(String name, String gender, String birthday, String address) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void inputInfo(){
        Scanner s=new Scanner(System.in);
        System.out.println("Nhap ten:");
        name = s.nextLine();
        System.out.println("Nhap gioi tinh:");
        gender=s.nextLine();
        System.out.println("Nhap ngay sinh: ");
        birthday=s.nextLine();
        System.out.println("Nhap dia chi: ");
        address=s.nextLine();
    }
    public void outputInfo(){
        System.out.print("Ten: " + name +"; gioi tinh: "+ gender + "; ngay sinh: "+ birthday+ "; dia chi: "+ address);
    }
}
