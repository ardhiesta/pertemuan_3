/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_3;

import java.util.Scanner;

/**
 *
 * @author linuxluv
 */
public class Pertemuan_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pertemuan_3 p3 = new Pertemuan_3();
        p3.konversiNilai();
    }
    
    public void konversiNilai(){
        System.out.print("Masukkan nilai huruf: ");
        Scanner scan = new Scanner(System.in);
        String huruf = scan.nextLine();
        switch(huruf){
            case "A":
                System.out.println("Nilai angka dari "+huruf+" adalah 4");
                break;
            case "B":
                System.out.println("Nilai angka dari "+huruf+" adalah 3");
                break;
            case "C":
                System.out.println("Nilai angka dari "+huruf+" adalah 2");
                break;
            case "D":
                System.out.println("Nilai angka dari "+huruf+" adalah 1");
                break;
            default:
                System.out.println("Nilai angka dari "+huruf+" tidak dapat diidentifikasi");
                break;
        }
    }
    
    public void luasLingkaran(){
        System.out.print("Masukkan jari-jari lingkaran: ");
        Scanner scan = new Scanner(System.in);
        int bil1 = scan.nextInt();
        double luas = 3.14 * bil1 * bil1;
        System.out.println("Luas lingkaran = " + luas);
    }
    
    public void testScanner(){
        System.out.print("Masukkan bilangan: ");
        Scanner scan = new Scanner(System.in);
        int bil1 = scan.nextInt();
        System.out.println("Bilangan yang Anda masukkan = "+bil1);
    }
    
    public void nomer7(){
        for(int i=0; i<=6 ; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public void nomer8(){
        for(int i=7; i>0 ; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    
    public void nomer1(){
        for(int i=0; i<10; i++){
            if(i % 2 == 0){
                System.out.println("this is x : " + i);
            } else {
                System.out.println("Nilai x adalah : " + i);
            }
        }
    }
}
