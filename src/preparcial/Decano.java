package preparcial;

public class Decano extends Personal implements horasFacultad {
    public Decano() {
    }

    public Decano(String nombre, String apellido, String cargoFuncion) {
        super(nombre, apellido, cargoFuncion);
    }
    //FALTA FUNCION PUBLIC DECANO
    @Override
    public double sueldo(double d){
        return cantidadHorasMensuales()*d;
    }
    @Override
    public double cantidadHorasMensuales(){
        double cantidadHorasDecano;
        cantidadHorasDecano=30*4.2;
        return cantidadHorasDecano;
    }

}
