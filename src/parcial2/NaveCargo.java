package parcial2;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class NaveCargo extends Nave {

    public static final double VOL_MAX_ESTACIONAR = 100;
    private Carga carga;

    public NaveCargo(Carga carga, String planetaOrigen, int cantTripulantes) {
        super(planetaOrigen, cantTripulantes);
        this.carga = carga;
    }

    @Override
    public void completarManifiesto() {
        System.out.printf("Llevo esta carga: ");
        carga.imprimirManifiesto();
    }

    @Override
    public boolean sePuedeEstacionar() {
        return !this.carga.volumenSuperiorA(VOL_MAX_ESTACIONAR);
    }

}