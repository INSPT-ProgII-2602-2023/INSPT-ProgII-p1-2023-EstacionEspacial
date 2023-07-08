package parcial2;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class NaveCruiser extends Nave {

    private int cantPasajeros;

    public NaveCruiser(int cantPasajeros, String planetaOrigen, int cantTripulantes) {
        super(planetaOrigen, cantTripulantes);
        this.cantPasajeros = cantPasajeros;
    }    

    @Override
    public void completarManifiesto() {
        System.out.printf("Un %.2f%% de gente a bordo son pasajeros\n", porcPasajeros());
    }

    @Override
    public boolean sePuedeEstacionar() {
        return cantPasajeros > 0;
    }

    private double porcPasajeros() {
        return 100.0 * cantPasajeros / (cantPasajeros + getCantTripulantes());
    }

}