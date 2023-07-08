package parcial2;

import java.util.ArrayList;

/**
* Código generado por la app UXFtoJava by Charly Cimino
* @see https://github.com/CharlyCimino/uxf-to-java
*/
public class EstacionEspacial {

    private ArrayList<PuntoDeAtraque> atraques;

    public EstacionEspacial(int cuantos) {
        this.atraques = new ArrayList<>(cuantos);
        crearPuntosDeAtraque(cuantos);
    }
    
    private void crearPuntosDeAtraque(int cuantos) {
        for (int i = 0; i < cuantos; i++) {
            this.atraques.add(new PuntoDeAtraque());
        }
    }

    public void imprimirManifiestos() {
        for (PuntoDeAtraque atraque : atraques) {
            atraque.imprimirManifiesto();
        }
    }

    public void estacionarNave(Nave nave) {
        if (nave.sePuedeEstacionar() && !this.atraques.contains(nave)) {
            PuntoDeAtraque p = buscarAtraqueLibre();
            if (p != null) {
                p.estacionar(nave);
            }
        }        
    }

    private PuntoDeAtraque buscarAtraqueLibre() {
        PuntoDeAtraque pLibre = null;
        int i = 0;
        while (i < atraques.size() && !atraques.get(i).estaDisponible()) {
            i++;
        }
        if (i < atraques.size()) {
           pLibre = atraques.get(i); 
        }
        return pLibre;
    }

}