package S11_09;

public class Estudiante_09 extends Persona_09{

    public Estudiante_09(String carrera, int numeroDeOrden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numeroDeOrden = numeroDeOrden;
        this.ciclo = ciclo;
    }
    String carrera;
    int numeroDeOrden;
    int ciclo;
    
    


}

