// Clase Materia
public class materia {
    // Atributos: un maestro, un alumno y un código de identificación
    private maestro maestro;
    private alumno alumno;
    private String nombremateria;
    private int minimoasistencia;
    private int codigo; // nuevo atributo

    // Constructor
    public materia(String nombremateria, maestro maestro, alumno alumno, int minimoasistencia, int codigo) {
        this.nombremateria = nombremateria;
        this.maestro = maestro;
        this.alumno = alumno;
        this.minimoasistencia = minimoasistencia;
        this.codigo = codigo; // inicializar el nuevo atributo
    }

    // Getters y Setters
    public maestro getMaestro() {
        return maestro;
    }

    public void setMaestro(maestro maestro) {
        this.maestro = maestro;
    }

    public alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(alumno alumno) {
        this.alumno = alumno;
    }

    public String getNombreMateria() {
        return nombremateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombremateria = nombreMateria;
    }

    public int getminimoasistencia() {
        return minimoasistencia;
    }

    public void setMinimoasistencia(int minimoasistencia) {
        this.minimoasistencia = minimoasistencia;
    }

    public int getCodigo() {   // getter del código
        return codigo;
    }

    public void setCodigo(int codigo) {  // setter del código
        this.codigo = codigo;
    }

    // Método para mostrar toda la info
    public void mostrarInformacion(){
        System.out.println("Código materia: " + codigo);
        System.out.println("Materia: " + nombremateria + " - mínimo de asistencia: " + minimoasistencia);
        System.out.println("Maestro: " + maestro.getNombre() + " - enseña: " + maestro.getMateriaQueEnseña());
        System.out.println("Alumno: " + alumno.getNombre() + " - asistencia: " + alumno.getAsistencia());
    }
}
