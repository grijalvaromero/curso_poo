import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Usuario usuario_normal = new Usuario("Luis","email@gmail.com","123");
        Cliente cliente1=new Cliente(10,"Cliente1","test@gmail.com","123");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Bono "+ cliente1.cobrarBono(5));

        System.out.println("Introduce el email: ");
        String e = scanner.next();
        System.out.println("Introduce el password: ");
        String p = scanner.next();


        boolean res = cliente1.login(e,p);
        if(res){
            System.out.println("Login correcto");
            cliente1.imprimirEstadoCuenta();
        }else{
            System.out.println("Login Incorrecto");
        }

    }
}
