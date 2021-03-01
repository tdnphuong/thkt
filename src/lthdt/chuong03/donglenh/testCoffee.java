/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lthdt.chuong03.donglenh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import lthdt.chuong03.coffeelogic.CoffeeShop;
import lthdt.chuong03.coffeelogic.Manager;

/**
 *
 * @author LENOVO
 */
public class testCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        
        CoffeeShop[] a = new CoffeeShop[]{new CoffeeShop("Kha Coffee", "2 Nguyen Hue"),
                                          new CoffeeShop("Hello Coffee", " 5 Le Loi "),
                                          new CoffeeShop("Lemon", " 9 Ho Dac Di ")};
        Manager[] managers = new Manager[]{
                                new Manager(a, 1000, "Nguyen Van A", 0, df.parse("12-12-2012")),
                                new Manager(new CoffeeShop[]{
                                                new CoffeeShop("Hoang Hac", "12 Nguyen Hue")
                                }, 2000, "Nguyen Van B", 1, df.parse("9-2-2000"))
                                 };
        System.out.println(Arrays.toString(managers));
    }
    
}
