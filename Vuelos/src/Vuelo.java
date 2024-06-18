public abstract class Vuelo {
    private String aerolinea;
    protected String hora_salida;

    public Vuelo(String aerolinea, String hora_salida) {
        this.aerolinea = aerolinea;
        this.hora_salida = hora_salida;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    abstract String getHora_salida();

    abstract void setHora_salida(String hora_salida);
}
