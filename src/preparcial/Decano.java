package preparcial;

public class Decano extends Personal implements horasFacultad {
<<<<<<< HEAD
=======
    private final static double salarioHora = 3000;
>>>>>>> ramaIan

    public Decano() {
    }

    public Decano(String nombre, String apellido, String cargoFuncion) {
        super(nombre, apellido, cargoFuncion);
    }
<<<<<<< HEAD
    //FALTA FUNCION PUBLIC DECANO
=======
    @Override
    public double sueldo(double d){
        return cantidadHorasMensuales()*salarioHora;
    }
    public double cantidadHorasMensuales(){
>>>>>>> ramaIan

    @Override
    public double cantidadHorasMensuales(){
        double cantidadHorasDecano;
        cantidadHorasDecano=30*4.2;
        return cantidadHorasDecano;
    }

}
