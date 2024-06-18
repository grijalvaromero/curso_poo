public class Ticket extends Vuelo implements  Reservar{
    private  int num_a;
    private  int fila;
    private double precio;

    public Ticket(String aerolinea, String hora_salida, int num_a, int fila, double precio) {
        super(aerolinea, hora_salida);
        this.num_a = num_a;
        this.fila = fila;
        this.precio = precio;
    }

    public int getNum_a() {
        return num_a;
    }

    public void setNum_a(int num_a) {
        this.num_a = num_a;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    String getHora_salida() {
        return  super.hora_salida;
    }

    @Override
    void setHora_salida(String hora_salida) {
        super.hora_salida = hora_salida;
    }

    @Override
    public void imprimirDatos() {

    }

    @Override
    public double calcularPrecio() {
        return 0;
    }
}
