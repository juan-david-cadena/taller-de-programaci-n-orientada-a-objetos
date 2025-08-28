public class persona {
    //atributos de la clase persona, clase padre de las demas clases como estudiante,profesor,etc
    private String nombre;
    private int documento;
    private  String areaDeEstudio;
    //constructor
    public persona(String nombrebase, int documentobase, String areaDeEstudiobase){
        this.nombre = nombrebase;
        this.documento = documentobase;
        this.areaDeEstudio = areaDeEstudiobase;
    }
    public String getNombre(){
        return nombre;
    }
    public int getDocumento(){
        return documento;
    }
    public String getAreaDeEstudio(){
        return areaDeEstudio;
    }
    // metodos

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public void setAreaDeEstudio(String areaDeEstudio) {
        this.areaDeEstudio = areaDeEstudio;
    }

}
