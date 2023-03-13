/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proxectoerros;

import java.util.Scanner;

/**
 *
 * @author Vladislav Zernov <a19vladislavz at iessanclemente.net>
 */
public class ProxectoErros {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num = in.nextInt();
        int resto;
        int numeroInvertido = 0;
        
        while(num!=0) {
            resto = num%10;
            numeroInvertido = numeroInvertido*10+resto;
            num /= 10;
        }
        
        System.out.println("O número invertido é " + numeroInvertido);
    }
}
