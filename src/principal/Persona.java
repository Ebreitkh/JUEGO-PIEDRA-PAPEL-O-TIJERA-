/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Beth
 */
public class Persona {
    
    String Alias,Correo;
    Scanner Sc=new Scanner (System.in);
    
    public void solicitarDatosPersona(){
        
        System.out.println("Escriba un alias: ");
        Alias=Sc.next();
        
        System.out.println("Escriba su correo: ");
        Correo=Sc.next();
        
               
    }            
    
    public void mostrarDatosPersona(){
        
        System.out.println(Alias+" - "+Correo);
        
    }
}
