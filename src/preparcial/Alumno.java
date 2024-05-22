package preparcial;

public class Alumno implements horasFacultad{
    private String nombre;
    private String apellido;
    private long dni;
    private Asignatura[] mAsignatura;
    public Alumno(){

    }

    public Alumno(Asignatura[] mAsignatura, String apellido, long dni, String nombre) {
        this.mAsignatura = mAsignatura;
        this.apellido = apellido;
        this.dni = dni;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        double promedio = 0;
        for(int i = 0 ; i<getmAsignatura().length;i++){
            Asignatura auxA = getmAsignatura()[i];
            promedio = promedio + auxA.getNota();
        }
        return promedio;
    }
    public double cantidadHorasMensuales(){
        double horasTotales = 0;
        for(int i=0; i< getmAsignatura().length;i++){
            Asignatura aux = getmAsignatura()[i];
            horasTotales = horasTotales + aux.getHorasCursadas();
        }
        return horasTotales;
    }
    public void asignaturaAprobada(){
        for(int i = 0; i<getmAsignatura().length;i++){
            Asignatura auxA = getmAsignatura()[i];
            if(auxA.getNota()>=7){
             System.out.println("---------\nAsignatura: "+auxA.getNombre()+"\nAprobada");
            }else{
                System.out.println("---------\nAsignatura: "+auxA.getNombre()+"\nDesaprobada");
            }
        }
    }
    //ESTO LO METES EN UN FOR EN EL MAIN
    public String toStringHorasyNota(Asignatura a){
        if(a.getNota()>=7){
            return "Asignatura:"+a.getNombre()+"aprobada con "+a.getNota();
        }else {
            return null;
        }
    }
    public String toStringPromedioYHoras(){
        double suma = 0;
        int horas = 0;
        for(int i = 0; i<getmAsignatura().length;i++){
            Asignatura asig = getmAsignatura()[i];
            suma = suma + asig.getNota();
            horas = horas + asig.getHorasCursadas();
        }
        return "Horas totales "+horas+" promedio total de notas "+ suma/getmAsignatura().length;
    }
}
