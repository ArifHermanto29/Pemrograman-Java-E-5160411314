/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputdarikeyboard;

import java.io.BufferedReader;
import java.util.logging.Logger;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LK09NU14UTY
 */
public class InputdariKeyboard {

    /**
     * @param args the command line arguments
     */
    public static void latihan1(){
    BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String name = "";
        System.out.println("Please enter your name =");
        try{
        name = br.readLine();
        }catch(IOException e){
            System.out.println("Error");
        }
        System.out.println("Hello " +name + " !!!");
    }
    
    public static void latihan2() {
    BufferedReader angka = new BufferedReader (new InputStreamReader(System.in));
        String panjang = "";
        String lebar = "";
        try{
            
        
        System.out.println("masukkan panjang =");
        panjang = angka.readLine();
        int pjg = Integer.parseInt(panjang);
        System.out.println("masukkan lebar =");      
        lebar = angka.readLine();
        int lbr = Integer.parseInt(lebar);
         System.out.println("luas =" +(pjg*lbr));
         System.out.println("keliling =" +(2*(pjg+lbr)));
            
        }catch(IOException e){
            System.out.println("Error");
        }
        
        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
      latihan1();  
      //latihan2(); 
    }
    
}
