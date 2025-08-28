public class maestro extends persona {
    //atributos propios de la clase maestro
    private String materiaQueEnseña;

    //constructor
    public maestro(String nombrebase, int documentobase, String areaDeEstudiobase, String materiaQueEnseña) {
        super(nombrebase, documentobase, areaDeEstudiobase);
        this.materiaQueEnseña = materiaQueEnseña;
    }

    public String getMateriaQueEnseña() {
        return materiaQueEnseña;
    }

    public void setMateriaQueEnseña(String materiaQueEnseña) {
        this.materiaQueEnseña = materiaQueEnseña;
    }
    // Método para mostrar toda la info
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Documento: " + getDocumento());
        System.out.println("Área de estudio: " + getAreaDeEstudio());
        System.out.println("Materia que enseña: " + materiaQueEnseña);
    }
}
