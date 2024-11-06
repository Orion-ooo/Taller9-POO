
package local;

/**
 *
 * @author Daniel
 */
public class Ej1_Empleado extends Ej1_Persona{
    private String departamento;
    
    @Override public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("departamento: " + departamento);
    }
}
