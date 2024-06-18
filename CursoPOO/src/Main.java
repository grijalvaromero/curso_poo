public class Main {

    public static void main(String[] args){

        System.out.println("Hola");

        Boton x=new Boton(10,40,"Rojo","default.jpg");
        Boton z=new Boton(60,30,"Azul","play.png");
        Boton q =new Boton("Blue","send.png");
        Boton u = new Boton();

        System.out.println(x.getColor());

        //x.color ="PURPLE";
        x.setX(50);

        double cachar = z.getX();
        System.out.println(cachar);
        z.decirHola("Luis");
        System.out.println(x.esVerdadero());
        x.nada();
        Boton y;

        double area = x.area(20);

        System.out.println(area);

    }


}
