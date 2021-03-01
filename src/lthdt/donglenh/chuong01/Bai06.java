/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.donglenh.chuong01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author LENOVO
 */
public class Bai06 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat df= new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input ="11-03-2001";
        Date ngaysinh = df.parse(input);
        Person person = new Person("Nguyen Van A", 1,ngaysinh);
        
        System.out.println("Ho ten: " + person.getHoten() + 
                           "; gioi tinh: " + person.getGioitinh() + 
                           "; ngay sinh: " + df.format(person.getNgaysinh())); 
        
        Student sinhvien = new Student();
        sinhvien.setHoten("Nguyen Van B");
        sinhvien.setGioitinh(1);
        sinhvien.setNgaysinh(df.parse("05-02-2001"));
        sinhvien.setTruonghoc("Dai hoc Hue");
        System.out.println("Ho ten: " + sinhvien.getHoten() + 
                           "; gioi tinh: " + sinhvien.getGioitinh() + 
                           "; ngay sinh: " + df.format(sinhvien.getNgaysinh()) + 
                           "; truong hoc: " + sinhvien.getTruonghoc());
        System.out.println(sinhvien.calcTax(1200));
        
        Worker congnhan = new Worker();
        congnhan.setHoten("Nguyen Thi C");
        congnhan.setGioitinh(0);
        congnhan.setNgaysinh(df.parse("06-06-2000"));
        congnhan.setCongty("IBM");
        System.out.println("Ho ten: "+ congnhan.getHoten() +
                           "; gioi tinh: "+ congnhan.getGioitinh()+
                           "; ngay sinh: "+ df.format(congnhan.getNgaysinh())+
                           "; cong ty: "+ congnhan.getCongty());
        System.out.println(congnhan.calcTax(2000));
    }   
}
