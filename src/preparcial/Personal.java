package preparcial;

public class Personal {
    private String nombre;
    private String apellido;
    private String cargoFuncion;
    public Personal(){

    }

    public Personal(String nombre, String apellido, String cargoFuncion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargoFuncion = cargoFuncion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCargoFuncion() {
        return cargoFuncion;
    }

    public void setCargoFuncion(String cargoFuncion) {
        this.cargoFuncion = cargoFuncion;
    }
    //FALTA IMPLEMENTAR DOS FUNCIONES
}
