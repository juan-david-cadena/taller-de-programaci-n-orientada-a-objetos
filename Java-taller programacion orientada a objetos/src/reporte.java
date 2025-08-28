// Clase Reporte
public class reporte {
    // Atributos
    private maestro maestro;
    private alumno alumno;
    private administrador administrador;
    private materia materia;

    // Constructor
    public reporte(maestro maestro, alumno alumno, administrador administrador, materia materia) {
        this.maestro = maestro;
        this.alumno = alumno;
        this.administrador = administrador;
        this.materia = materia;
    }

    // Método para mostrar el reporte completo
    public void mostrarReporte() {
        System.out.println("----- REPORTE ACADÉMICO -----");
        System.out.println("Materia: " + materia.getNombreMateria() + " - mínimo asistencia: " + materia.getminimoasistencia());
        System.out.println("Profesor: " + maestro.getNombre() + " - enseña: " + maestro.getMateriaQueEnseña());
        System.out.println("Estudiante: " + alumno.getNombre() + " - asistencia: " + alumno.getAsistencia());
        System.out.println("Administrador: " + administrador.getNombre() + " - área: " + administrador.getAreaDeEstudio());

        // Evaluación según el boolean del administrador
        if (administrador.isAsistenciaInsuficiente()) {
            System.out.println("Resultado: El estudiante REPROBÓ por inasistencia.");
        } else {
            System.out.println("Resultado: El estudiante APROBÓ.");
        }
        System.out.println("-----------------------------");
    }
}
