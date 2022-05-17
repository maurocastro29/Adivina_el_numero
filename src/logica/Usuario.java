package logica;

public class Usuario {
    private String nombre;
    private int intentos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.intentos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }
    
    
}
