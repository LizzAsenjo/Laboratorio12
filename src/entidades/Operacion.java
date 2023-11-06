/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import entidades.CajaValidacion;
import java.awt.Color;

/**
 *
 * @author Liz
 */
public class Operacion {

    private CajaValidacion caja1;
    private CajaValidacion caja2;
    private CajaValidacion resultado;
    
    
    public Operacion(
            CajaValidacion valor1, 
            CajaValidacion valor2, 
            CajaValidacion resultado){
        this.caja1 = valor1;
        this.caja2 = valor2;
        this.resultado = resultado;
    }
    
    public void suma(){
        this.resultado.mostrarError("");
        float res= this.caja1.getValor()+
                this.caja2.getValor();
        this.resultado.mostrarInfo(res+ "");
    }
    
    public void resta(){
        this.resultado.mostrarError("");
        float res= this.caja1.getValor()-
                this.caja2.getValor();
        this.resultado.mostrarInfo(res+ "");
    }
    
    public void mul(){
        this.resultado.mostrarError("");
        float res= this.caja1.getValor()*
                this.caja2.getValor();
        this.resultado.mostrarInfo(res+ "");
    }
    
    public void div(){
        float res= this.caja1.getValor()/
                this.caja2.getValor();
        this.resultado.mostrarError("");
        if(this.caja1.getValor()==0 && this.caja2.getValor()==0){
            this.resultado.mostrarError("Ambos números deben ser mayores a cero");
        }
        else if(this.caja2.getValor()==0){
            this.resultado.mostrarError("No se puede dividir entre cero");
        }
        else{
            this.resultado.mostrarInfo(res + "");
        }
        this.resultado.getError().setForeground(Color.RED);
    }
}
