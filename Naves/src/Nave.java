public class Nave {
    //ATRIBUTOS
    private String name;
    private double x;
    private double y;
    private  String color;

    //CONSTRUCTOR
    public Nave(String name, double x, double y, String color){
        this.name = name;
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
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
    public double calcularDistancia(double x2, double y2){
        double p1 =  Math.pow((x2-this.x), 2 );//powtencia
        double p2= Math.pow( (y2-this.y) ,2 );
        double dis = Math.sqrt( p1 + p2 );
        return dis;
    }
}
