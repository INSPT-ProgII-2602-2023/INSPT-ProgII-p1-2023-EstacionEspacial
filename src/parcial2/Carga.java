package parcial2;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Carga implements Manifestable {

    private String descripcion;
    private double volumen;

    public Carga(String descripcion, double volumen) {
        this.descripcion = descripcion;
        this.volumen = volumen;
    }

    @Override
    public void imprimirManifiesto() {
        System.out.printf("%s (%.2f m3)\n", descripcion, volumen);
    }

    public boolean volumenSuperiorA(double valor) {
        return this.volumen > valor;
    }

}