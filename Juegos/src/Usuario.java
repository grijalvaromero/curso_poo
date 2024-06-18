public class Usuario extends Jugador{
    private int ganadas;

    public Usuario(int ganadas,String nombre, String nickname) {
        super(nombre, nickname);
        this.ganadas = ganadas;
    }

    public int getGanadas() {
        return ganadas;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }
}
