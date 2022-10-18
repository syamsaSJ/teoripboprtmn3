/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.teoripboprtmn3;

/**
 *
 * @author USER
 */
public class Teoripboprtmn3 {

    public static void main(String[] args) {
        /*int totalBelanja = 500000;
        int diskon = totalBelanja >= 100000 ? totalBelanja/10 : 0;
        System.out.println("Diskon = " + diskon); */
        
        int pilihan = 4;
        switch(pilihan){
            case 1:
                System.out.println("Soto Ayam");
                break;
            case 2:
                System.out.println("Gule Kambing");
                break;
            case 3:
                System.out.println("Nasi Goreng");
                break;
            default:
                System.out.println("Silahkan pilih 1, 2 atau 3");
        }
    }
}
