package eu.jmcastellano.marcaorquideas.modelo;

public enum TipoOrquidea {
    OTROS ("Otros","Otros","Otros", 5),
    LUTEA ("Lutea","Ophrys lutea","Ophrys", 1),
    FUSCA ("Fusca","Ophrys fusca","Ophrys", 1),
    XAMPANOISI ("Zapatito de la reina","Cypripedium calceolus","Cypripedieae", 4),
    ATLANTICA ("Atlantica","Ophrys atlantica","Ophrys", 1),
    PYRAMIDALIS ("Pyramidalis","Anacamptis pyramidalis","Orchidaceae", 2),
    CONICA ("Conica","Orchis Conica", "Orchis", 3),
    SPIRALIS ("Spiralis","Spiranthes","Orchidaceae", 2);

    private final String nombreComun;
    private final String nombreCientifico;
    private final String familia;
    private final int recurso;

    TipoOrquidea(String nombreComun, String nombreCientifico, String familia, int recurso) {
        this.nombreComun = nombreComun;
        this.recurso = recurso;
        this.familia = familia;
        this.nombreCientifico = nombreCientifico;
    }
    public String getNombreComun() { return nombreComun; }
    public String getNombreCientifico() { return nombreCientifico; }
    public String getFamilia(){ return familia;}
    public int getRecurso() { return recurso; }
}
