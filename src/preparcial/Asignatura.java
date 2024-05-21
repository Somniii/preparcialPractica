package preparcial;

public class Asignatura {
    private String nombre;
    private double nota;
    private int horasCursadas;

    public Asignatura() {

    }
    public Asignatura(String nombre , double nota , int horasCursadas){
      setNombre(nombre);
      setNota(nota);
      setHorasCursadas(horasCursadas);
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
}
