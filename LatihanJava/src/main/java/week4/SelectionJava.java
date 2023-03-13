/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week4;

import java.util.Scanner;

/**
 *
 * @author gustipang
 */
public class SelectionJava {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukan angka:");
        int angka = scn.nextInt();
        
       
        switch(angka){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            default:
                System.out.println("More or less than zero or one");
        }

    }

}
