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
public class Alcancia {
    
    private Moneda mon20;
    private int ahorradoPesos;
    private int ahorradoEuros;
    
    
    public Alcancia(){
   
    }
    
    public void ingresarMoneda(Moneda m) {
        
        if(m.getTipo().endsWith("euro"))
        {
            switch (m.getDenom())
            {
                case 20 : { mon20=new Moneda(20,"euro"); mon20.acumularCantidad20("euro"); break;}
                case 50 : {mon20=new Moneda(50,"euro"); mon20.acumularCantidad50("euro"); break;}
                case 100 : {mon20=new Moneda(100,"euro");mon20.acumularCantidad100("euro"); break;}
             }

              ahorradoEuros=this.valorAhorradoEuros(m.getDenom());   
        }


        if(m.getTipo().equals("peso"))
        {
             switch (m.getDenom())
            {
                case 20 : {mon20=new Moneda(20,"peso");mon20.acumularCantidad20("peso"); break;}
                case 50 : {mon20=new Moneda(20,"peso");mon20.acumularCantidad50("peso"); break;}
                case 100 : {mon20=new Moneda(20,"peso");mon20.acumularCantidad100("peso"); break;}
            }
             ahorradoPesos=this.valorAhorradoPesos(m.getDenom());

        }
   
    }
    
    public int valorAhorradoEuros(int valor) {
        
        if(valor == 20 || valor == 50 || valor==100)
        {
            ahorradoEuros+=valor*mon20.getCantidadEuros(); 
            return ahorradoEuros;
        }
        else
        {
            return getAhorradoEuros()*mon20.getCantidadEuros();
            
        }
     
    }
    
    public int valorAhorradoPesos(int valor)
    {
        if(valor == 20 || valor == 50 || valor==100)
        {
            ahorradoPesos+= valor*mon20.getCantidadPesos(); 
            return ahorradoPesos;
        }
        else
        {
            return getAhorradPesos()*mon20.getCantidadPesos();   
        }
        
    }
        
    public void romperAlcancia() {
         mon20=null;
    }
    public int cantidadDenom(int denom,String tipo)
    {
        int cantidad=0;
        switch(denom){
        case 20 : {
            if(tipo.equals("euro"))
             cantidad=mon20.getCatE20(); 
            else
            {
             cantidad=mon20.getCatP20();  
            }
            break;
        }
        case 50 : 
        {
          if(tipo.equals("euro"))
             cantidad=mon20.getCatE50(); 
          else
          {
              cantidad=mon20.getCatP50();
          }
        break;
        }
        
        case 100 : 
        {
            if(tipo.equals("euro"))
            cantidad=mon20.getCatE100();
            else
            cantidad=mon20.getCatP100();  
        break;}
        }
        return cantidad;
    }
        
    public int getAhorradoEuros() 
    {
     return ahorradoEuros;
    } 
    public int getAhorradPesos() 
    {
     return ahorradoPesos;
    } 
}
