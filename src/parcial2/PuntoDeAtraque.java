package parcial2;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class PuntoDeAtraque implements Manifestable {

    private Nave naveEnganchada;

    public PuntoDeAtraque() {
        // El punto de atraque inicialmente está libre (naveEnganchada es null)
    }    

    @Override
    public void imprimirManifiesto() {
        if ( !estaDisponible() ) {
            naveEnganchada.imprimirManifiesto();
        }        
    }

    public boolean estaDisponible() {
        return this.naveEnganchada == null;
    }

    public void estacionar(Nave nave) {
        this.naveEnganchada = nave;
    }

}