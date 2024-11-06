
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Animal {
    protected String especie;

    public Ej2_Animal(String especie) {
        this.especie = especie;
    }
    
    public void mostrarEspecie(){
        System.out.println("especie: " + especie);
    }
}
