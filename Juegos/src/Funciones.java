public interface Funciones {
    //sirve para definir funciones y obligar a la clase que lo implemente
    //a programar esas funciones

    void verTablero();
    void reiniciarPartida();
    Usuario verificarGanador();
    boolean tableroLleno();
    void ponerFicha(int f, int c);
}
