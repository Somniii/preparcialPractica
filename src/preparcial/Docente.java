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
}
