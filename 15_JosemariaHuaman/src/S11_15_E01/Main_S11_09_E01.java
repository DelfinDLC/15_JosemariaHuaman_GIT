/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package S11_15_E01;

/**
 *
 * @author Lab18
 */
public class Main_S11_09_E01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante_09_E01 estudiante = new Estudiante_09_E01("San Marcos", 20, "Alberto");
        Empleado_09_E01 empleado = new Empleado_09_E01("Valle Grande", 30, "Rosa");
        Jubilado_09_E01 jubilado = new Jubilado_09_E01("Jose", 2000, 65);

        estudiante.saludar();
        estudiante.estudiar();

        empleado.saludar();
        empleado.trabajar();

        jubilado.saludar();
        jubilado.jubilacion();
    }
    
}
