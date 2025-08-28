import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ---------------- DATOS DEL ALUMNO ----------------
        System.out.println("=== Datos del Alumno ===");
        System.out.print("Nombre del alumno: ");
        String nombreAlumno = sc.nextLine();
        System.out.print("Documento del alumno: ");
        int docAlumno = sc.nextInt();
        sc.nextLine(); // limpiar buffer
        System.out.print("Área de estudio del alumno: ");
        String areaEstudio = sc.nextLine();
        System.out.print("Asistencia del alumno (entero): ");
        int asistencia = sc.nextInt();
        sc.nextLine();

        alumno alumno1 = new alumno(nombreAlumno, docAlumno, areaEstudio, asistencia);

        // ---------------- DATOS DEL MAESTRO ----------------
        System.out.println("\n=== Datos del Maestro ===");
        System.out.print("Nombre del maestro: ");
        String nombreMaestro = sc.nextLine();
        System.out.print("Documento del maestro: ");
        int docMaestro = sc.nextInt();
        sc.nextLine();
        System.out.print("Materia que enseña el maestro: ");
        String materiaQueEnseña = sc.nextLine();

        // Usa el mismo área de estudio que el alumno
        maestro maestro1 = new maestro(nombreMaestro, docMaestro, areaEstudio, materiaQueEnseña);

        // ---------------- DATOS DE LA MATERIA ----------------
        // Nombre de la materia = materia que enseña el profe
        String nombreMateria = maestro1.getMateriaQueEnseña();

        System.out.print("Código de la materia: ");
        int codigoMateria = sc.nextInt();
        System.out.print("Mínimo de asistencia: ");
        int minimoAsistencia = sc.nextInt();
        sc.nextLine();

        materia materia1 = new materia(nombreMateria, maestro1, alumno1, minimoAsistencia, codigoMateria);

        // ---------------- DATOS DEL ADMIN ----------------
        System.out.println("\n=== Datos del Administrador ===");
        System.out.print("Nombre del administrador: ");
        String nombreAdmin = sc.nextLine();
        System.out.print("Documento del administrador: ");
        int docAdmin = sc.nextInt();
        sc.nextLine();

        // Usa el mismo área de estudio que el alumno
        administrador admin1 = new administrador(nombreAdmin, docAdmin, areaEstudio, alumno1, materia1);

        // ---------------- CREAR Y MOSTRAR REPORTE ----------------
        // <-- ojo: aquí el orden debe coincidir con el constructor de la clase reporte
        reporte reporte1 = new reporte(maestro1, alumno1, admin1, materia1);
        reporte1.mostrarReporte();

        sc.close();
    }
}
