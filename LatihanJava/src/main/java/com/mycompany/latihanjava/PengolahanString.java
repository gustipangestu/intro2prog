/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.latihanjava;

import java.util.Scanner;

/**
 *
 * @author gustipang
 */
public class PengolahanString {

    public static void main(String[] args) {
//        String a = "Gusti.pangestu@binusa.ac.id";
        String b = "gusti123123";
        Scanner scn = new Scanner(System.in);
        System.out.println("Masukan email:");
        String email = scn.nextLine();
        System.out.println("masukan password:");
        String pass = scn.nextLine();
        
        if(pass.equals(b)){
            System.out.println("user dengan email "+email+" berhasil login");
        }
        else{
            System.out.println("Login gagal");
        }
        
       
    }
}
