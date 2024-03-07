
package proyect_mac;

public class Usuario {
    
    private String Nombre;
    private String contraseña;

    public Usuario() {
    }

    public Usuario(String Nombre, String contraseña) {
        this.Nombre = Nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return Nombre ;
    }
    
    
}
