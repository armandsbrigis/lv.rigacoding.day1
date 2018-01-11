/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lv.rigacoding.day1;

/**
 *
 * @author ArmandsBeCool
 */
public class LvRigacodingDay1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Square s1 = new Square(9,"pink");
        Square s2 = new Square (44,"Black");
        
        System.out.println("Kvadrāta 1 krāsa ir " + s1.getColor());
        
        System.out.println("Kvadrāta 2 laukums ir " +s2.getArea());
        
        System.out.println("Kvadrāta 2 krāsa ir " +s2.getColor());
        
        System.out.println("Kvadrāta 2 perimetrs ir " +s2.getPerimeter());
        // TODO code application logic here
*/
       
       Adrese A1 = new Adrese ("Latvija ","Rīga ","A.Čaka ",103,26);
       Nodala N1 = new Nodala ("Pašnodarbinātais",1,A1);
       Darbinieks D1 = new Darbinieks ("Armands","Brigis",180887,"armandsbrigis@gamail.com","29962955",A1, "Privāta", "Publiska");
       
       
       System.out.print("Mani Sauc " + D1.Vards + " ,es dzīvoju " + D1.DzivesVieta.FullAdress());
        
       
       
       
    }
    
}
