/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author NOEMI
 */
public class Main_Calculadora {
    int Numero1,Numero2;
    
    
    public Main_Calculadora(int Numero1, int Numero2)
    {
        this.Numero1=Numero1;
        this.Numero2=Numero2;
    }
    
    public int getNumero1(){
        return Numero1;
    }
    
    public void setNumero1(int Numero1){
        this.Numero1=Numero1;
    }
    
    
     public int getNumero2(){
        return Numero2;
    }
    
    public void setNumero2(int Numero2){
        this.Numero2=Numero2;
    }
    
}
