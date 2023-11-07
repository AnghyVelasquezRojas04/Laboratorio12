/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author anghy
 */
public class CajaValidacion {

    /**
     * @return the caja
     */
    private JTextField caja;
    private JLabel error;
    
    public CajaValidacion(JTextField caja, JLabel error) {
        this.caja = caja;
        this.error = error;
    }

    public JTextField getCaja() {
        return caja;
    }
    
    public float getNum(){
         float num = 0;
        error.setText("");
        try{
           String numTexto = caja.getText();
           num = Float.parseFloat(numTexto);
        }catch(NumberFormatException ex){
           error.setText("Error al ingresar el numero");
        }
        return num;
    }
    
    public void mostrarIn(String t){
        this.error.setText(" ");
        this.caja.setText(t);
    }

    public void mostrarEr(String e){
        this.error.setText(e);
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
