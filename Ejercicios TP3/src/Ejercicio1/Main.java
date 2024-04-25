package Ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //Asignaturas
        Asignatura as1 = new Asignatura("Programación", 5, "8:15");
        Asignatura as2 = new Asignatura("Logica", 10, "10:00");
        Asignatura as3 = new Asignatura("Analisis Informatico", 10, "11:30");

        //Profesor
        Profesor p1 = new Profesor(1, "Leandro Giacanni", "Informatica", as1);
        int counter = 0;

        //Alumnos
        Alumno al1 = new Alumno("Agustin Ferrero", 1);
        Alumno al2 = new Alumno("Mayra Gomez", 2);
        Alumno al3 = new Alumno("Ignacio Perez", 3);
        Alumno al4 = new Alumno("Martin Pagano", 4);
        Alumno al5 = new Alumno("Sol Flores", 5);

        //Grupos
        Grupo g1 = new Grupo("Programación", 'C', al1);
        Grupo g2 = new Grupo("Matemática", 'C', al1);
        Grupo g3 = new Grupo("Ingles", 'C', al1);

        al1.agregarGrupo(g1);
        al1.agregarGrupo(g2);
        al1.agregarGrupo(g3);
        counter=0;


        g1.agregarAlumno(1, al2);
        g1.agregarAlumno(2, al3);
        g1.agregarAlumno(3, al4);
        g1.agregarAlumno(4, al5);
        as1.agregarGrupo(g1);
        as2.agregarGrupo(g1);
        as3.agregarGrupo(g1);

        p1.agregarAsignaturas(as2);
        p1.agregarAsignaturas(as3);


        //III.a
        System.out.println("Aula de la tercera asignatura del profesor " + p1.getNombre());
        for (Asignatura a : p1.getAsignaturas()) {
            counter++;
            if (counter == 3) {
                System.out.println("  aula tercera asignatura: " +a.getAula());
            }
        }
        System.out.println();

        //III.b
        System.out.println("Asignaturas que da el profesor " + p1.getNombre());
        for (Asignatura a : p1.getAsignaturas()) {
            System.out.println("  - " +a.getNombre());
        }
        System.out.println();

        //III.c
        System.out.println("Datos alumnos del grupo " + g1.getCurso()+ " " + g1.getLetra()+ ":");
        for (Alumno a : g1.getAlumnos()) {
            System.out.println("  Nombre: " +a.getNombre()+ "  DNI: " +a.getDni());
        }
        System.out.println();

        //III.d
        System.out.println("Letra del tercer grupo del alumno " + al1.getNombre());
        for (Grupo g : al1.getGrupos()) {
            counter++;
            if (counter == 3) {
                System.out.println("  Letra: " +g.getLetra());
            }
        }
        System.out.println();

        //III.e
        System.out.println("Asignaturas, primer grupo alumno alumno " + al1.getNombre());
        g1.agregarAsignaturas(as1);
        g1.agregarAsignaturas(as2);
        counter=0;
        for (Grupo g : al1.getGrupos()) {
            counter++;
            if (counter == 1) {
                for (Asignatura a : g.getAsignaturas()) {
                    System.out.println("  " +a.getNombre());
                }
            }
        }
        System.out.println();

        //III.f
        Scanner sc = new Scanner(System.in);
        System.out.println("Pedir una asignatura y mostrar el profesor que la imparte desde el alumno");
        System.out.print("Nombre asignatura: ");
        String asigName = sc.nextLine();
        as1.agregarProfesor(p1);

        for (Grupo g : al1.getGrupos()) {
            for(Asignatura a : g.getAsignaturas()){
                if (a.getNombre().equals(asigName)) {
                    System.out.println("  Profesor: " +a.getProfesor().getNombre());
                    break;
                }
            }
        }
        System.out.println();

        //III.g
        p1.agregarAsignaturas(as2);
        counter=0;
        System.out.println("Nombres de los alumnos del gurpo de la segunda asignatura de un profesor:");

        for (Asignatura a : p1.getAsignaturas()) {
            counter++;
            if (counter == 2) {
                System.out.println("Nombre del profesor:  " + p1.getNombre());
                System.out.println(" Asignatura: " + a.getNombre());
                if (a.getGrupos() != null) {
                    for (Grupo g : a.getGrupos()) {
                        System.out.println(" Grupo: " + g.getCurso());
                        for (Alumno al : g.getAlumnos()) {
                            System.out.println("  - " + al.getNombre());
                        }
                    }
                } else {
                    System.out.println("No hay grupos asociados");
                }
            }
        }
    }
}