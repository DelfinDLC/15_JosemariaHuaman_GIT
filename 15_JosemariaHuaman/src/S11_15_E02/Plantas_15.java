/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_15_E02;

/**
 *
 * @author Lab18
 */
public class Plantas_09 extends SerVivo_09{

    public Plantas_09(String nombre) {
        super(nombre);
    }
    
    @Override
    public void comer(){
        System.out.println(nombre + " come mediante la fotosintesis");
    }
}
