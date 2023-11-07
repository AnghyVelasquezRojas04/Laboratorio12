/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author anghy
 */
public class Operacion {
 
    private CajaValidacion caja1;
    private CajaValidacion caja2;
    private CajaValidacion resultado;
    
    public Operacion(CajaValidacion num1,
            CajaValidacion num2, 
            CajaValidacion resultado) {
        
        this.caja1 = num1;
        this.caja2 = num2;
        this.resultado = resultado;
    }
    
    public void sumar(){
        float res = this.caja1.getNum()+this.caja2.getNum();
        this.resultado.mostrarIn(res+ "");
    }
    
    public void restar(){
        float res = this.caja1.getNum()-this.caja2.getNum();
        this.resultado.mostrarIn(res+ "");
    }
    
    public void multiplicar(){
        float res = this.caja1.getNum()*this.caja2.getNum();
        this.resultado.mostrarIn(res+ "");
    }
    
    public void dividir(){
        float res = this.caja1.getNum()/this.caja2.getNum();
        if(this.caja2.getNum()== 0){
           this.resultado.mostrarEr("No se puede dividir entres 0 ");
        }else{
           this.resultado.mostrarIn(res+ "");
        }
    }
    
}
