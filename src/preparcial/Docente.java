package preparcial;

public class Docente extends Personal implements horasFacultad{
    private Asignatura[] mAsignatura;
    public Docente(){

    }

    public Docente(Asignatura[] mAsignatura) {
        this.mAsignatura = mAsignatura;
    }

    public Docente(String nombre, String apellido, String cargoFuncion, Asignatura[] mAsignatura) {
        super(nombre, apellido, cargoFuncion);
        this.mAsignatura = mAsignatura;
    }

    public Asignatura[] getmAsignatura() {
        return mAsignatura;
    }

    public void setmAsignatura(Asignatura[] mAsignatura) {
        this.mAsignatura = mAsignatura;
    }

    @Override
    public double cantidadHorasMensuales() {
        double horasTotalesDocente = 0;
        for (int i = 0; i < getmAsignatura().length; i++) {
            Asignatura aux = getmAsignatura()[i];
            horasTotalesDocente = horasTotalesDocente + aux.getHorasCursadas() + (10 * 4.2);
        }
        return horasTotalesDocente;
    }
<<<<<<< HEAD


    public double sueldo(double d) {
        return cantidadHorasMensuales()*d;
=======
    public  double sueldo(double d){
        return  cantidadHorasMensuales()*d;
>>>>>>> dfa1ad967036f03a41767c5edf9a58cb32c8433b
    }
}
