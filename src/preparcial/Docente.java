package preparcial;

public class Docente extends Personal implements horasFacultad{
    private final static double salarioHora = 2000;
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
    public double cantidadHorasMensuales(){

    }

    @Override
    public double sueldo(double d) {
        return cantidadHorasMensuales()*salarioHora;
    }
}
