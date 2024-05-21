package preparcial;

public class Decano extends Personal implements horasFacultad {
    private final static double salarioHora = 3000;

    public Decano() {
    }

    public Decano(String nombre, String apellido, String cargoFuncion) {
        super(nombre, apellido, cargoFuncion);
    }
    @Override
    public double sueldo(double d){
        return cantidadHorasMensuales()*salarioHora;
    }
    public double cantidadHorasMensuales(){

    @Override
    public double cantidadHorasMensuales(){
        double cantidadHorasDecano;
        cantidadHorasDecano=30*4.2;
        return cantidadHorasDecano;
    }

}
