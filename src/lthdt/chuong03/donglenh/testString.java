/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

/**
 *
 * @author LENOVO
 */
public class testString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String content = " Canh hoa ua tan \n Buc tranh ven man \n Bong ai xa ngut ngan \n Nuoc mat roi uot tran";
        System.out.println(content);
        // Thao tac 1: Tim vi tri cua 1 ki tu
        System.out.println("Vi tri cua ki tu a trong chuoi la: " + content.indexOf('a'));
        System.out.println("Vi tri cua ki tu Nuoc trong chuoi la: " + content.indexOf("Nuoc"));
        // Thao tac 2: kiem tra khoi dau va ket thuc
        System.out.println("Chuoi mo dau bang cum tu Canh: " + content.startsWith(" Canh"));
        System.out.println("Chuoi ket thuc bang cum tu tan " + content.endsWith("tan"));
        // Thao tac 3: cat chuoi theo vi tri 
        String temp = content.substring(47, 60);
        System.out.println("Chuoi con la:" + temp );
        // Thao tac 4: phan tach chuoi
        String[] result = content.split("\n");
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }
        // Thao tac 5: loai bo khoang trang dau - cuoi chuoi
        for(int i = 0; i < result.length; i++){
            System.out.println(result[i].trim());
        }
        // Thao tac 6: thay the ki tu 
        temp = content.replace('a', 'z');
        System.out.println(temp);
        // Thao tac 7: chuyen kieu 
        temp = content.toUpperCase();
        System.out.println(temp);
        temp = content.toLowerCase();
        System.out.println(temp);
        // Thao tac 8: so sanh chuoi
        temp = "Nguyen";
        if(temp.compareToIgnoreCase("nguyen") == 0){
            System.out.println("Hai chuoi bang nhau");
        }else{
            System.out.println("Hai chuoi khong bang nhau");
        }
        // Thao tac 9: Noi chuoi
        temp = temp.concat(" Van A ");
        System.out.println(temp);
        // Thao tac 10: truy xuat bang chi ao 
        for(int i = 0 ;i < temp.length(); i++){
            System.out.print(temp.charAt(i));
        }
        System.out.println();
        // Thao tac 11: Chuyen kieu
        temp = "155";
        int n = Integer.parseInt(temp);
        System.out.println("n = " + n);
        // Thao tac 12: Su dung StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Long lanh day nuoc in troi\n");
        sb.append("Thanh xay khoi biec non phoi bong vang");
        temp = sb.toString();
        System.out.print(sb);
                
    }
    
}
