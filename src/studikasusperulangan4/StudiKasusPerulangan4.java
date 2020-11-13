/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusperulangan4;

import java.util.Scanner;

/**
 *
 * @author MOKLET1
 */
public class StudiKasusPerulangan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Masukkan Angka = ");
        int angka = n.nextInt();
        System.out.println("Bilangan Ganjil dari 0 sampai "+angka+" adalah = " );
        for(int i=0; i<=angka; i++){
            if (i%2==0){
                System.out.println(i+"");
    }
        }
    }
}
