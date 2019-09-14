package eu.jmcastellano.marcaorquideas.modelo;

public class Lugar {
    private GeoPunto posicion;
    private String foto;
    private String comentario;
    private long fecha;
    private TipoOrquidea tipo;

    public Lugar() {
        fecha = System.currentTimeMillis();
        posicion = new GeoPunto(0, 0);
        tipo = TipoOrquidea.OTROS;
    }

    public Lugar(double longitud,
                 double latitud, TipoOrquidea tipo, String foto, String comentario) {
        this.fecha = System.currentTimeMillis();
        this.posicion = new GeoPunto(longitud, latitud);
        this.foto = foto;
        this.comentario = comentario;
        this.tipo = tipo;
    }

    public TipoOrquidea getTipo() {
        return tipo;
    }
    public void setTipo(TipoOrquidea tipo) {
        this.tipo = tipo;
    }

    public GeoPunto getPosicion() {
        return posicion;
    }

    public void setPosicion(GeoPunto posicion) {
        this.posicion = posicion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "nombre='" + tipo.getNombreComun() + '\'' +
                ", posicion=" + posicion +
                ", foto='" + foto + '\'' +
                ", comentario='" + comentario + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}



