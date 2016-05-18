/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

/**
 *
 * @author ingesis
 */
public class Moneda {
    
    //Atributos
    private int denom;
    private int cantidadEuros;
    private int cantidadPesos;
    private int catE20;
    private int catE50;
    private int catE100;
     private int catP20;
    private int catP50;
    private int catP100;
    private String Tipo;
    //Metodos

    public Moneda(int denom, String Tipo) {
        this.denom = denom;
        this.Tipo = Tipo;
    }

    public int getCatE20() {
        return catE20;
    }

    public void setCatE20(int catE20) {
        this.catE20 = catE20;
    }

    public int getCatE50() {
        return catE50;
    }

    public void setCatE50(int catE50) {
        this.catE50 = catE50;
    }

    public int getCatE100() {
        return catE100;
    }

    public void setCatE100(int catE100) {
        this.catE100 = catE100;
    }

    public int getCatP20() {
        return catP20;
    }

    public void setCatP20(int catP20) {
        this.catP20 = catP20;
    }

    public int getCatP50() {
        return catP50;
    }

    public void setCatP50(int catP50) {
        this.catP50 = catP50;
    }

    public int getCatP100() {
        return catP100;
    }

    public void setCatP100(int catP100) {
        this.catP100 = catP100;
    }
   

    public String getTipo() {
        return Tipo;
    }
    
    public int getDenom() {
    return denom;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    public void setDenom(int denom) { 
        this.denom = denom;
    }

    public int getCantidadEuros() {
        return cantidadEuros;
    }

    public void setCantidadEuros(int cantidadEuros) {
        this.cantidadEuros = cantidadEuros;
    }

    public int getCantidadPesos() {
        return cantidadPesos;
    }

    public void setCantidadPesos(int cantidadPesos) {
        this.cantidadPesos = cantidadPesos;
    }
    
    
    public void acumularCantidad20(String tipo){
        
        if(tipo.equals("inicio"))
        {
            setCantidadEuros(0);
            setCantidadPesos(0);
        }
        if(tipo.equals("euro"))
        {
           cantidadEuros=cantidadEuros+1;
           catE20 = catE20+1;
        }
        if(tipo.equals("peso"))
        {
            cantidadPesos = cantidadPesos+1;
            catP20 = catP20+1;
        }
        
    } 
    
    public void acumularCantidad50(String tipo){
        
        if(tipo.equals("inicio"))
        {
            setCantidadEuros(0);
            setCantidadPesos(0);
        }
        if(tipo.equals("euro"))
        {
           cantidadEuros=cantidadEuros+1;
           catE50 = catE50+1;
        }
        if(tipo.equals("peso"))
        {
            cantidadPesos = cantidadPesos+1;
            catP50 = catP50+1;
        }
    } 
    
    public void acumularCantidad100(String tipo){
        
        if(tipo.equals("inicio"))
        {
            setCantidadEuros(0);
            setCantidadPesos(0);
        }
        if(tipo.equals("euro"))
        {
           cantidadEuros=cantidadEuros+1;
           catE100 = catE100+1;
        }
        if(tipo.equals("peso"))
        {
            cantidadPesos = cantidadPesos+1;
            catP100 = catP100+1;
        }
    } 
    
}
