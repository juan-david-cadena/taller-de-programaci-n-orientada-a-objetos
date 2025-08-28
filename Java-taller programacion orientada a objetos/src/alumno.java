public class alumno extends persona{
    //atributos propios de la clase alumno
    private int asistencia;
    //constructor
    public alumno(String nombrebase, int documentobase, String areaDeEstudiobase, int asistencia) {
        super(nombrebase, documentobase, areaDeEstudiobase);
        this.asistencia = asistencia;
    }

    public int getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }
    // Método para mostrar toda la info
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Área de estudio: " + getAreaDeEstudio());
        System.out.println("Asistencia: " + asistencia);
    }
}
