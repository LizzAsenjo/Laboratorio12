/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Liz
 */
public class CajaValidacion {
    
    private JTextField caja;
    private JLabel error;

    public CajaValidacion(JTextField caja, JLabel error) {
        this.caja = caja;
        this.error = error;
    }
    
    public float getValor(){
        float valor = 0;
        error.setText("");
        try{
            String valoTexto = caja.getText();
            valor = Float.parseFloat(valoTexto);
        }catch (NumberFormatException ex) {
            error.setText("Error de formato");
            this.error.setForeground(Color.red);
        }
        return valor;
    }
    
    public void mostrarInfo(String t){
        this.caja.setText(t);
    }
    public void mostrarError(String er){
        this.error.setText(er);
        this.error.setForeground(Color.red);
    }
    
    /**
     * @return the caja
     */
    public JTextField getCaja() {
        return caja;
    }

    /**
     * @param caja the caja to set
     */
    public void setCaja(JTextField caja) {
        this.caja = caja;
    }

    /**
     * @return the error
     */
    public JLabel getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(JLabel error) {
        this.error = error;
    }
}
