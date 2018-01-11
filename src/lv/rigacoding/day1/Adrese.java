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
public class Adrese {
    public String Valsts;
    public String Pilseta;
    public String Iela;
    public int MajasNumurs;
 
    public int DzivoklaNumurs;
   
    
    public Adrese (String Valsts, String Pilseta,String Iela, int MajasNumurs, int DzivoklaNumurs)
    {
                this.Valsts = Valsts;
                this.Pilseta = Pilseta;
                this.Iela = Iela;
                this.MajasNumurs = MajasNumurs;
                this.DzivoklaNumurs = DzivoklaNumurs;
                
    }
         
    public String FullAdress(){
        String fullAdress ="";
        if(Valsts != null && Valsts !=""){
            fullAdress += Valsts + ",";
            //fullAdress = fullAddress + county + ",";
        }
        if(Pilseta != null && Pilseta !=""){
            fullAdress += Pilseta + ",";
        }
            
        //"Latvija, Riga"
        if(fullAdress.length()>0){
            fullAdress = fullAdress.substring(0,fullAdress.length() -2);
        }
            
            //fullAdress = fullAddress + county + ",";
        
        
        return fullAdress;
        
        
        
    }        
    
}
