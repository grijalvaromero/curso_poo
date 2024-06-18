public class Gato implements Funciones{
    private String[] tablero;
    private Usuario jugador1;
    private Usuario jugador2;

    public Gato(String[] tablero, Usuario jugador1, Usuario jugador2) {
        this.tablero = tablero;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
    }

    @Override
    public void verTablero() {

    }

    @Override
    public void reiniciarPartida() {

    }

    @Override
    public Usuario verificarGanador() {
        return null;
    }

    @Override
    public boolean tableroLleno() {
        return false;
    }

    @Override
    public void ponerFicha(int f, int c) {

    }
}
