/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_09_E01;

/**
 *
 * @author Lab18
 */
public class Empleado_09_E01 extends Persona_09_E01{

     public Empleado_09_E01(String empresa, int edad, String nombre) {
        super(nombre, edad);
        this.empresa = empresa;
    }


    private String empresa;


    public void trabajar() {
        System.out.println(getNombre() + " trabaja en " + empresa);
    }
}


