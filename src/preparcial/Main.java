package preparcial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    }
    public static Alumno crearAlumno(Scanner scan){
        System.out.println("-----CREACION DE ALUMNO-----");
        System.out.println("Ingrese el nombre del alumno");
        String nombre = scan.nextLine();
        System.out.println("Ingrese el apellido del alumno");
        String apellido = scan.nextLine();
        System.out.println("Ingrese su dni");
        long dni = scan.nextLong();
        scan.nextLine();
        System.out.println("Cuantas asignaturas participo el alumno");
        int tamanio = scan.nextInt();
        Asignatura[] asig = new Asignatura[tamanio];
        for(int i = 0; i <tamanio ; i++){
            asig[i] = crearAsignatura(scan);
        }
        Alumno alu = new Alumno(asig , apellido , dni , nombre);
        return alu;
    }
    public static Asignatura crearAsignatura(Scanner scan){
        System.out.println("----CREACION DE ASIGNATURA----");
        System.out.println("Ingrese el nombre de la asignatura");
        String nombreA = scan.nextLine();
        System.out.println("Ingrese la nota sacada en la asignatura");
        double nota = scan.nextDouble();
        System.out.println("Ingrese las horas de cursada de esa asignatura");
        int horasCursadas = scan.nextInt();
        Asignatura aux = new Asignatura(nombreA, nota,horasCursadas);
        return aux;
    }

}