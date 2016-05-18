/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.IOException;
import servidor.Alcancia;
import servidor.Moneda;
import java.io.BufferedReader;
import java.io.InputStreamReader; 

public class Cliente {
    
    public static void main(String[] args) throws IOException {
    int opcion2,tipoMoneda;
    Alcancia a=new Alcancia(); 
    Moneda mon = null;
    
    
    do{
        tipoMoneda = tipoMoneda();
        opcion2=menu2();
        switch(opcion2){
           
            
            case 1:
                 if(tipoMoneda == 1)
                 {
                    mon = new Moneda(20,"euro"); 
                 }
                 if(tipoMoneda == 2)
                 {
                     mon = new Moneda(20,"peso");  
                 }
                a.ingresarMoneda(mon);
            System.out.println("Se ha ingresado la moneda de 20");
            break;
                
            case 2:
                 if(tipoMoneda == 1)
                 {
                    mon = new Moneda(50,"euro"); 
                 }
                 if(tipoMoneda == 2)
                 {
                     mon = new Moneda(50,"peso");  
                 }
                  
                a.ingresarMoneda(mon);
                System.out.println("Se ha ingresado la moneda de 50");
                break;
                
            case 3:
                 if(tipoMoneda == 1)
                 {
                    mon = new Moneda(100,"euro"); 
                 }
                 if(tipoMoneda == 2)
                 {
                     mon = new Moneda(100,"peso");  
                 }
               
                a.ingresarMoneda(mon);
                System.out.println("Se ha ingresado la moneda de 100");
            break;  
            case 4:
            System.out.println("La alcancia tiene: "+a.valorAhorradoPesos(0)+"pesos");
            break;
                
            case 5:
            System.out.println("La alcancia tiene: "+a.valorAhorradoEuros(0)+"euros");
            break;       
                
            case 6:
                System.out.println("escoja el tipo de moneda");  
             tipoMoneda = tipoMoneda();
                if (tipoMoneda == 1)
                {
                    
                    System.out.println("cantidad de 20 es"+a.cantidadDenom(20, "euro")+"\n la cantidad de 50 es:"+a.cantidadDenom(50, "euro")+"\n la cantidad de 100 es:"+a.cantidadDenom(100, "euro"));
 
                }
                if(tipoMoneda == 2)
                {
                    System.out.println("cantidad de 20 es"+a.cantidadDenom(20, "peso")+"\n la cantidad de 50 es:"+a.cantidadDenom(50, "peso")+"\n la cantidad de 100 es:"+a.cantidadDenom(100, "peso"));
                              
                }
            
            break;
                
            case 7:
            a.romperAlcancia();
            break;
            default:
            break;
        }
         }while(opcion2!=7);
   }
    
    
    public static int menu2() throws IOException
    {
        int opcion = 0;
        String linea = "";
        System.out.println("|*****************MENU********************|");
        System.out.println("|1. Ingresar moneda de 20 |");
        System.out.println("|2. Ingresar moneda de 50 |");
        System.out.println("|3. Ingresar moneda de 100 |");
        System.out.println("|4. Total de la Alcancia Pesos|");
        System.out.println("|5. Total de la Alcancia Euros|");
        System.out.println("|6. Estado de la Alcancia |");
        System.out.println("|7. Salir |");
        System.out.println("|*****************************************|");
        System.out.println("Ingrese la opcion: ");
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        linea = br.readLine();
        opcion = Integer.parseInt(linea);
        
        return opcion;
        
    }
    
    public static int tipoMoneda() throws IOException
    {
        int opcion = 0;
        String linea = "";
        System.out.println("|*****************MENU********************|");
        System.out.println("|1. Euros|");
        System.out.println("|2. Pesos |");
        System.out.println("|3. Otro menu |");
        System.out.println("|*****************************************|");
        System.out.println("Ingrese la opcion: ");
        BufferedReader br = new BufferedReader(new
        InputStreamReader(System.in));
        linea = br.readLine();
        opcion = Integer.parseInt(linea);
        return opcion;
        
    }
         
}
