/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

public class modelo {
    
    // Atributos de los objetos
    private int numerouno;
    private int numerodos;
    public int resultado;
    
  
    
    //Encapsulamiento de datos
    public int getNumerouno()                        {return numerouno;}

    public void setNumerouno(int numerouno)          {this.numerouno = numerouno;}

    public int getNumerodos()                        {return numerodos;}

    public void setNumerodos(int numerodos)          {this.numerodos = numerodos;}

    public int getResultado()                        {return resultado;}

    public void setResultado(int resultado)          {this.resultado = resultado;}
    
    //Metdos de la clases para operaciones matematicas
    public int suma(){
        this.resultado= getNumerouno() + getNumerodos();
        return getResultado();
    }
    
    public int resta(){
        
        this.resultado = getNumerouno() - getNumerodos();
        return getResultado();
        
    }
    
    public int multiplicacion(){
        this.resultado = (getNumerouno()*getNumerodos());
        return getResultado();
    }
    
    public int division(){
            this.resultado = (getNumerouno() / getNumerodos());
            return getResultado();
    }
    

}
            
        
             
     
         


        