public class Cliente extends Usuario{
    private double saldo;
    public Cliente(double saldo,String nombre, String email, String password){
        super(nombre,email,password);//disparando el constructor de la super clase
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void imprimirEstadoCuenta(){
        System.out.println("Nombre del cliente: "+super.nombre);
        System.out.println("Email: "+super.getEmail());
        System.out.println("Tu saldo es: "+this.saldo);
    }
//    @Override
//    public double cobrarBono(int anios){
//        return (anios * 1000) * 1.20;
//    }

    @Override
    public double cobrarBono(int anios) {
        return (anios * 1000) * 1.20;
    }
}
