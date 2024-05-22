package preparcial;

public class Decano extends Personal implements horasFacultad {
<<<<<<< HEAD
=======

>>>>>>> dfa1ad967036f03a41767c5edf9a58cb32c8433b
    public Decano() {
    }

    public Decano(String nombre, String apellido, String cargoFuncion) {
        super(nombre, apellido, cargoFuncion);
    }
<<<<<<< HEAD
    //FALTA FUNCION PUBLIC DECANO
=======
>>>>>>> dfa1ad967036f03a41767c5edf9a58cb32c8433b
    @Override
    public double sueldo(double d){
        return cantidadHorasMensuales()*d;
    }
<<<<<<< HEAD
=======
    public double cantidadHorasMensuales(){

>>>>>>> dfa1ad967036f03a41767c5edf9a58cb32c8433b
    @Override
    public double cantidadHorasMensuales(){
        double cantidadHorasDecano;
        cantidadHorasDecano=30*4.2;
        return cantidadHorasDecano;
    }

}
