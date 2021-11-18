/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prateleiras;

import java.util.Scanner;

/**
 *
 * @author Nilson
 */
public class Cesta {
    
    public double bebida = 2.98;
    public double doces = 3.00;
    public double carne = 22.00;
    public double frutas = 3.50;
    public double verdura = 2.50;
    
    public double quantidade;
    public double precobebida;
    public double precodoces;
    public double precocarne;
    public double precofrutas;
    public double precoverduras;
    public double caixa;
    Scanner busca = new Scanner(System.in);
    
    
    public double compraBebida (){
        
       System.out.println("Informe a quantidade de bebida que quer comprar: ");
        quantidade = busca.nextDouble();
        precobebida = quantidade * bebida;
        return precobebida;
    }
    public double compraDoces (){
       System.out.println("\nInforme a quantidade de doces que quer comprar: ");
        quantidade = busca.nextDouble();
        precodoces = quantidade * doces;
         return precodoces;
    }
    public double compraCarne (){
      System.out.println("\nInforme a quantidade de carnes que quer comprar: ");
        quantidade = busca.nextDouble();
        precocarne = quantidade * carne;
         return precocarne;
    }
    public double compraFruta (){
      System.out.println("\nInforme a quantidade de frutas que quer comprar: ");
        quantidade = busca.nextDouble();
        precofrutas = quantidade * frutas;
         return precofrutas;
    }
    public double compraVerdura (){
    System.out.println("\nInforme a quantidade de verduras que quer comprar: ");
        quantidade = busca.nextDouble();
        precoverduras = quantidade * verdura;
         return precoverduras;
    }
    
    public void mostrarResultado(){
            
         
        caixa = precobebida + precodoces + precocarne + precofrutas + precoverduras;
        
        System.out.println("O resultado é: " + caixa);
           
        }
    
    
}
