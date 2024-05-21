package preparcial;

public class Alumno implements horasFacultad{
    private String nombre;
    private double nota;
    private int horasCursadas;
    private Asignatura[] mAsignatura;
    public Alumno(){

    }

    public Alumno(Asignatura[] mAsignatura, int horasCursadas, double nota, String nombre) {
        this.mAsignatura = mAsignatura;
        this.horasCursadas = horasCursadas;
        this.nota = nota;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public int getHorasCursadas() {
        return horasCursadas;
    }

    public void setHorasCursadas(int horasCursadas) {
        this.horasCursadas = horasCursadas;
    }

    public Asignatura[] getmAsignatura() {
        return mAsignatura;
    }

    public void setmAsignatura(Asignatura[] mAsignatura) {
        this.mAsignatura = mAsignatura;
    }

    public void finalize(){

    }
    public double promedio(){

    }
    public double cantidadHorasMensuales(){
        double horasTotales = 0;
        for(int i=0; i< getmAsignatura().length;i++){
            Asignatura aux = getmAsignatura()[i];
            horasTotales = horasTotales + aux.cu();

        }
        return horasTotales;
    }
    public void asignaturaAprobada(){
        for(int i = 0; i<getmAsignatura().length;i++){
            Asignatura auxA = getmAsignatura()[i];
            if(auxA.getNota()>=7){
             "Aprobado";
            }else{

            }
        }
    }
}
