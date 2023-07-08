package parcial2;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public abstract class Nave implements Manifestable {

    private String planetaOrigen;
    private int cantTripulantes;

    public Nave(String planetaOrigen, int cantTripulantes) {
        this.planetaOrigen = planetaOrigen;
        this.cantTripulantes = cantTripulantes;
    }

    public int getCantTripulantes() {
        return cantTripulantes;
    }

    @Override
    public void imprimirManifiesto() {
        System.out.printf("Vengo de %s con %d tripulantes. ", this.planetaOrigen, this.cantTripulantes);
        completarManifiesto();
    }

    public abstract void completarManifiesto();

    public abstract boolean sePuedeEstacionar();

}