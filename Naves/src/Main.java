import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Nave nave1=new Nave("La guerra",20,50,"black");
        Nave nave2=new Nave("La Lola",500,60,"red");
        //me permite leer datos desde la consola
        Scanner scanner=new Scanner(System.in);
        int op_menu = 0;
        while(op_menu!=4){
            System.out.println("1)Mostrar datos 2)Mover Nave 3)Calcular Distancia 4)Salir");
            op_menu = scanner.nextInt();
            switch (op_menu){
                case 1:{
                    System.out.println("Cual nave quieres: 1)La Guerrera 2)La Lola");
                    int op = scanner.nextInt();
                    if(op == 1){
                        System.out.println("Nombre: "+nave1.getName());
                        System.out.println("X: "+nave1.getX());
                        System.out.println("Y: "+nave1.getY());
                        System.out.println("Color: "+nave1.getColor());

                    }else if(op ==2 ){
                        System.out.println("Nombre: "+nave2.getName());
                        System.out.println("X: "+nave2.getX());
                        System.out.println("Y: "+nave2.getY());
                        System.out.println("Color: "+nave2.getColor());
                    }
                    break;
                }
                case 2:{
                    System.out.println("Cual nave quieres mover: 1) La guerra 2) La Lola");
                    int op = scanner.nextInt();
                    System.out.println("Introduce la coordenada X: ");
                    double x= scanner.nextDouble();
                    System.out.println("Introduce la coordenada Y: ");
                    double y = scanner.nextDouble();
                    if(op == 1){
                        nave1.setX(x);
                        nave1.setY(y);
                    }else if(op == 2){
                        nave2.setX(x);
                        nave2.setY(y);
                    }
                    System.out.println("Datos actualizados");
                    break;
                }
                case 3:{
                    double dist = nave2.calcularDistancia(nave1.getX(), nave1.getY());
                    System.out.println("Distancia: "+ dist);
                    break;
                }
                case 4:{
                    System.out.println("ADIOS");
                    break;
                }
                default:{
                    System.out.println("Opción no valida");
                }

            }



        }//llave while


    }
}
