/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_09_E01;

/**
 *
 * @author Lab18
 */
public class Jubilado_09_E01 extends Persona_09_E01{

    public Jubilado_09_E01(String nombre, int pension, int edad) {
        super(nombre, edad);
        this.pension = pension;
    }

    private int pension;

    public void jubilacion() {
        System.out.println(getNombre() + " está disfrutando de su jubilación con una pensión de $" + pension);
    }
}
