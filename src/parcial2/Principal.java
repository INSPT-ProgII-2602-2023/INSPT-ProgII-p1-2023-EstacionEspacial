package parcial2;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class Principal {

    public static void main(String[] args) {
        EstacionEspacial estacion = new EstacionEspacial(5);
        estacion.estacionarNave(new NaveCargo(new Carga("Baterías recargables", 120), "Neptuno", 21));
        estacion.estacionarNave(new NaveCruiser(0, "Mercurio", 8));
        estacion.estacionarNave(new NaveCargo(new Carga("Sustancias cósmicas", 90), "Marte", 15));
        estacion.estacionarNave(new NaveCruiser(12, "Urano", 48));
        System.out.println("Manifiestos de naves que lograron estacionarse:");
        estacion.imprimirManifiestos();
    }

}