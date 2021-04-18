/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication117;

import java.util.Scanner;

/**
 *
 * @author Hilal
 */
public class JavaApplication117 {

    /**
     * @param args the command line arguments
     */
    interface Zaman{
        public int dakikaHesapla();
    }
    
    class Hesapla implements Zaman{
        public int dakikaHesapla(){
            return 1;
        }
    }
    
    class Ay extends Hesapla {
        int ay ;
        int gun;
        public int dakikaHesapla(int ay, int gun){
            return (ay*30+ gun)*24*60;
        }
    }
    
    class Gun extends Hesapla {
        int gun;
        int saat;
        public int dakikaHesapla(int gun, int saat){
            return (gun * 24+saat) * 60;
        }
    }
    
    class Saat extends Hesapla {
        int saat;
        int dakika;
        public int dakikaHesapla(int saat, int dakika){
            return saat * 60;
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int secim;
        int ay; 
        int gun;
        int saat;
        int dakika;
        while(true)
        {
            System.out.print("Ay = 1, Gun = 2, Saat = 3, Çıkış = 4 ");
            System.out.print("Hangi Hesaplamayı Yapmak İstiyorsun : ");
            Scanner deger = new Scanner(System.in);
            secim = deger.nextInt();
            
            if(secim == 4)
            {
                break;
            }
            else
            {
                switch(secim)
                {
                    case 1 :
                    System.out.print("Ay Giriniz : ");
                    ay = deger.nextInt();
                    System.out.print("Gün Giriniz : ");
                    gun = deger.nextInt();
                    Ay(ay, gun);
                    break;
                        
                    case 2 : 
                    System.out.print("Gün Giriniz : ");
                    gun = deger.nextInt();
                    System.out.print("Saat Giriniz : ");
                    saat = deger.nextInt();
                    Gun(gun, saat);
                    break;
                        
                    case 3 : 
                    System.out.print("Saat Giriniz : ");
                    saat = deger.nextInt();
                    System.out.print("Dakika Giriniz : ");
                    dakika = deger.nextInt();
                    Saat(saat, dakika);
                    break;
                }
            }
        }
    }
}