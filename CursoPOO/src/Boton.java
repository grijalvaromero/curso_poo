public class Boton {

    //ATRIBUTOS
    private double x;
    private double y;
    private String color;
    private String icono;

    //CONSTRUCTOR me permite llenar esta plantilla
    public Boton(double xxxxx, double y, String color, String icono){
        this.x = xxxxx;
        this.y = y;
        this.color = color;
        this.icono = icono;
        System.out.println("ESTAS EN EL CONSTRUCTOR");
    }
    public Boton(String color, String icono){
        this.icono = icono;
        this.color = color;
        this.x = 500;
        this.y = 500;
    }
    public Boton(){
        this.icono = "user.png";
        this.color = "rosa";
        this.x = 500;
        this.y =500;
    }

    //GETTERS Y SETTERS GET=>CONSEGUIR SET=>PONER ASIGNAR
    public void setX(double x){
        this.x = x;
    }
    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getIcono() {
        return icono;
    }
    //SOBRECARGA DE MÉTODOS
    public double area(double x, double y){
        return x*y;
    }
    public double area(double r){
        return Math.PI * (r*r);
    }

    //MÉTODOS O FUNCIONES 2x - 10 = 0

    //RECIBE Y REGRESA
    public double sumar(double x1,double x2){
        double res = x1+x2;
        return res;
    }
    //RECIBE Y NO REGRESA
    public void decirHola(String nombre){
        System.out.println("HOla "+nombre);
    }
    //NO RECIBE Y REGRESA
    public boolean esVerdadero(){
        return true;
    }
    //NI RECIBE NI REGRESA
    public void nada(){
        System.out.println("NO  HACE NADA");
    }
}
