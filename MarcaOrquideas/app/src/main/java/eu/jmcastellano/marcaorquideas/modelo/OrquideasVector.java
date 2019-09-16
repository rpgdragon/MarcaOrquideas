package eu.jmcastellano.marcaorquideas.modelo;

import java.util.ArrayList;
import java.util.List;

import eu.jmcastellano.marcaorquideas.interfaces.Lugares;

public class OrquideasVector implements Lugares {
    private List<Lugar> vectorLugares;

    public OrquideasVector() {
        vectorLugares = ejemploLugares();
    }
    public Lugar elemento(int id) {
        return vectorLugares.get(id);
    }
    public void anyade(Lugar lugar) {
        vectorLugares.add(lugar);
    }
    public int nuevo() {
        Lugar lugar = new Lugar();
        vectorLugares.add(lugar);
        return vectorLugares.size()-1;
    }
    public void borrar(int id) {
        vectorLugares.remove(id);
    }
    public int tamanyo() {
        return vectorLugares.size();
    }
    public void actualiza(int id, Lugar lugar) {
        vectorLugares.set(id, lugar);
    }
    private static ArrayList<Lugar> ejemploLugares() {
        ArrayList<Lugar> lugares = new ArrayList<>();
        lugares.add(new Lugar(-4.704994,
                36.620514,TipoOrquidea.FUSCA,"foto1.jpg", "Esto es el comentario de la Fusca 1"));
        lugares.add(new Lugar(-4.724994,
                36.630514,
                TipoOrquidea.CONICA, "foto2.jpg",
                "Esto es el comentario de la Conica 1"));
        lugares.add(new Lugar(-4.684994,
                36.620914, TipoOrquidea.FUSCA,"foto3.jpg","Esto es el comentario de la Fusca 2"));
        lugares.add(new Lugar(-4.684994,
                36.620914, TipoOrquidea.FUSCA,"foto4.jpg","Esto es el comentario de la Fusca 3"));
        lugares.add(new Lugar(-4.684994,
                36.620914, TipoOrquidea.FUSCA,"foto5.jpg","Esto es el comentario de la Fusca 4"));
        lugares.add(new Lugar(-4.684994,
                36.620914, TipoOrquidea.FUSCA,"foto6.jpg","Esto es el comentario de la Fusca 5"));
        lugares.add(new Lugar(-4.684994,
                36.620914, TipoOrquidea.FUSCA,"foto7.jpg","Esto es el comentario de la Fusca 6"));
        lugares.add(new Lugar(-4.684994,
                36.620914, TipoOrquidea.FUSCA,"foto8.jpg","Esto es el comentario de la Fusca 7"));
        lugares.add(new Lugar(-4.724994,
                36.630514,
                TipoOrquidea.CONICA, "foto9.jpg",
                "Esto es el comentario de la Conica 2"));
        lugares.add(new Lugar(-4.725194,
                36.631114,
                TipoOrquidea.CONICA, "foto10.jpg",
                "Esto es el comentario de la Conica 3"));
        return lugares;
    }
}
