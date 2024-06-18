public class Sudoku  implements Funciones{
    private String[] tablero;
    private Jugador jugador1;
    private Jugador jugador2;
    private boolean turno;

    public Sudoku(String[] tablero, Jugador jugador1, Jugador jugador2, boolean turno) {
        this.tablero = tablero;
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.turno = turno;
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
