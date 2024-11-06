
package local;

/**
 *
 * @author Daniel
 */
public class Ej2_Pez extends Ej2_Animal{
    private String tipoAgua;

    public Ej2_Pez(String tipoAgua, String especie) {
        super(especie);
        this.tipoAgua = tipoAgua;
    }
    
    @Override public void mostrarEspecie(){
        super.mostrarEspecie();
        System.out.println("Tipo de agua del pez: " + tipoAgua);
    }
}
