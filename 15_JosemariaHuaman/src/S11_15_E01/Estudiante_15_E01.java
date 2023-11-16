/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_09_E01;

/**
 *
 * @author Lab18
 */
public class Estudiante_09_E01 extends Persona_09_E01{

    public Estudiante_09_E01(String institucion, int edad, String nombre) {
        super(nombre, edad);
        this.institucion = institucion;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }



    private String institucion;


    public void estudiar() {
        System.out.println(getNombre() + " está estudiando en " + institucion);
    }
}
