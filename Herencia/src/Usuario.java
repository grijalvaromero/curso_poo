public class Usuario {
    protected String nombre;
    private String email;
    private String password;

    public Usuario(String nombre, String email, String password) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean login(String e, String p){
        if(e.equals(this.email) && p.equals(this.password)){
            return true;
        }else{
            return false;
        }
    }
    public double cobrarBono(int anios){
        return (anios * 1000) * 1.10;
    }

}
