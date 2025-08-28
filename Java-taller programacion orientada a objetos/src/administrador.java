// Clase Administrador
public class administrador extends persona {
    // atributo: verificación de asistencia mínima
    private boolean asistenciaInsuficiente;

    // constructor
    public administrador(String nombrebase, int documentobase, String areaDeEstudiobase, alumno alumno, materia materia) {
        super(nombrebase, documentobase, areaDeEstudiobase);

        // lógica: true si la asistencia del alumno < mínima, false en caso contrario
        if (alumno.getAsistencia() < materia.getminimoasistencia()) {
            this.asistenciaInsuficiente = true;
        } else {
            this.asistenciaInsuficiente = false;
        }
    }

    // Getter y Setter
    public boolean isAsistenciaInsuficiente() {
        return asistenciaInsuficiente;
    }

    public void setAsistenciaInsuficiente(boolean asistenciaInsuficiente) {
        this.asistenciaInsuficiente = asistenciaInsuficiente;
    }

    // Método para mostrar la info
    public void mostrarInformacion() {
        System.out.println("Nombre administrador: " + getNombre());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Área de estudio: " + getAreaDeEstudio());
        System.out.println("¿Asistencia insuficiente? " + asistenciaInsuficiente);
    }
}
