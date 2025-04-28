
package Tarea_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class clases {
    private materias materia;
    private profesores profesor;
    private List<estudiantes> estudiantes;

    public clases(materias materia, profesores profesor, List<estudiantes> estudiantes) {
        this.materia = materia;
        this.profesor = profesor;
        this.estudiantes = estudiantes;
    }

    public materias getMateria() {
        return materia;
    }


public void mostrarClase() {
    System.out.println("Clase:");
    System.out.println("Materia: " + materia.getNombre());
    System.out.println("Profesor: " + profesor.getNombre());

    List<estudiantes> hombres = new ArrayList<>();
    List<estudiantes> mujeres = new ArrayList<>();

    for (estudiantes estudiante : estudiantes) {
        if (estudiante.getSexo().equalsIgnoreCase("Masculino")) {
            hombres.add(estudiante);
        } else if (estudiante.getSexo().equalsIgnoreCase("Femenino")) {
            mujeres.add(estudiante);
        }
    }

    System.out.println("Estudiantes Hombres:");
    for (estudiantes hombre : hombres) {
        System.out.println("- " + hombre.getNombre()
                + " - " + hombre.getCalificacion() + " - " + hombre.getAsistencia() + " - " + hombre.getEdad());
    }

    System.out.println("Estudiantes Mujeres:");
    for (estudiantes mujer : mujeres) {
        System.out.println("- " + mujer.getNombre()
                + " - " + mujer.getCalificacion() + " - " + mujer.getAsistencia() + " - " + mujer.getEdad());
    }
}


    public static void main(String[] args) {

        estudiantes estudiante1 = new estudiantes();
        estudiante1.setNombre("Juan Perez");
        estudiante1.setEdad(20);
        estudiante1.setSexo("Masculino");
        estudiante1.setCalificacion("4");
        estudiante1.setAsistencia("Presente");

        estudiantes estudiante2 = new estudiantes();
        estudiante2.setNombre("Maria Lopez");
        estudiante2.setEdad(22);
        estudiante2.setSexo("Femenino");
        estudiante2.setCalificacion("5");
        estudiante2.setAsistencia("Presente");
        
        estudiantes estudiante3 = new estudiantes();
        estudiante3.setNombre("Pedro Gonzalez");
        estudiante3.setEdad(21);
        estudiante3.setSexo("Masculino");
        estudiante3.setCalificacion("6");
        estudiante3.setAsistencia("Presente");

        estudiantes estudiante4 = new estudiantes();
        estudiante4.setNombre("Laura Ramirez");
        estudiante4.setEdad(23);
        estudiante4.setSexo("Femenino");
        estudiante4.setCalificacion("2");
        estudiante4.setAsistencia("Presente");

        estudiantes estudiante5 = new estudiantes();
        estudiante5.setNombre("Sofia Torres");
        estudiante5.setEdad(20);
        estudiante5.setSexo("Femenino");
        estudiante5.setCalificacion("9");
        estudiante5.setAsistencia("Ausente");

        estudiantes estudiante6 = new estudiantes();
        estudiante6.setNombre("Diego Herrera");
        estudiante6.setEdad(22);
        estudiante6.setSexo("Masculino");
        estudiante6.setCalificacion("8");
        estudiante6.setAsistencia("Presente");

        estudiantes estudiante7 = new estudiantes();
        estudiante7.setNombre("Valeria Cruz");
        estudiante7.setEdad(19);
        estudiante7.setSexo("Femenino");
        estudiante7.setCalificacion("4");
        estudiante7.setAsistencia("Presente");

        estudiantes estudiante8 = new estudiantes();
        estudiante8.setNombre("Andres Lopez");
        estudiante8.setEdad(24);
        estudiante8.setSexo("Masculino");
        estudiante8.setCalificacion("5");
        estudiante8.setAsistencia("Ausente");

        estudiantes estudiante9 = new estudiantes();
        estudiante9.setNombre("Camila Vargas");
        estudiante9.setEdad(21);
        estudiante9.setSexo("Femenino");
        estudiante9.setCalificacion("6");
        estudiante9.setAsistencia("Presente");

        estudiantes estudiante10 = new estudiantes();
        estudiante10.setNombre("Jorge Castillo");
        estudiante10.setEdad(22);
        estudiante10.setSexo("Masculino");
        estudiante10.setCalificacion("3");
        estudiante10.setAsistencia("Presente");

        profesores profesor1 = new profesores();
        profesor1.setNombre("Carlos Garcia");
        profesor1.setEdad(35);
        profesor1.setSexo("Masculino");
        profesor1.setAsignatura("Matematicas");
        profesor1.setAsistencia("Presente");

        profesores profesor2 = new profesores();
        profesor2.setNombre("Ana Martinez");
        profesor2.setEdad(30);
        profesor2.setSexo("Femenino");
        profesor2.setAsignatura("Filosofia");

        profesores profesor3 = new profesores();
        profesor3.setNombre("Luis Fernandez");
        profesor3.setEdad(40);
        profesor3.setSexo("Masculino");
        profesor3.setAsignatura("Fisica");
        profesor3.setAsistencia("Presente");

        materias materia1 = new materias();
        materia1.setNombre("Matematicas");
        materia1.setCurso("10A");
        materia1.setProfesor(profesor1.getNombre());
        materia1.setAula("101");

        materias materia2 = new materias();
        materia2.setNombre("Filosofia");
        materia2.setCurso("10B");
        materia2.setProfesor(profesor2.getNombre());
        materia2.setAula("102");

        materias materia3 = new materias();
        materia3.setNombre("Fisica");
        materia3.setCurso("10C");
        materia3.setProfesor(profesor3.getNombre());
        materia3.setAula("103");

        List<estudiantes> listaEstudiantes1 = new ArrayList<>();
        listaEstudiantes1.add(estudiante1);
        listaEstudiantes1.add(estudiante2);
        listaEstudiantes1.add(estudiante3);
        listaEstudiantes1.add(estudiante4);
        listaEstudiantes1.add(estudiante5);
        listaEstudiantes1.add(estudiante6);
        listaEstudiantes1.add(estudiante7);
        listaEstudiantes1.add(estudiante8);
        listaEstudiantes1.add(estudiante9);
        listaEstudiantes1.add(estudiante10);

        clases clase1 = new clases(materia1, profesor1, listaEstudiantes1);
        clases clase2 = new clases(materia2, profesor2, listaEstudiantes1);
        clases clase3 = new clases(materia3, profesor3, listaEstudiantes1);

        List<clases> listaClases = new ArrayList<>();
        listaClases.add(clase1);
        listaClases.add(clase2);
        listaClases.add(clase3);

        // Preguntar por la materia
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el nombre de la materia: ");
        String nombreMateria = scanner.nextLine();

        boolean materiaEncontrada = false;
        for (clases clase : listaClases) {
            if (clase.getMateria().getNombre().equalsIgnoreCase(nombreMateria)) {
                clase.mostrarClase();
                materiaEncontrada = true;
                break;
            }
        }

        if (!materiaEncontrada) {
            System.out.println("No se encontró la materia ingresada.");
        }

        scanner.close();
    }
}
