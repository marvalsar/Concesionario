public class Registro {
    private int montVenta;
    private String codVendido;
    private String apellido;
    private String nombre;
    private int docIdent;

    //Constructor
    public Registro(int montVenta,String codVendido, String apellido, String nombre, int docIdent){
        this.montVenta = montVenta;
        this.codVendido = codVendido;
        this.apellido = apellido;
        this.nombre = nombre;
        this.docIdent = docIdent;
    }

    //Metodos o acciones de la clase Personas
    //get y set de nombre
    public int getMontVenta(){
        return montVenta;
    }
    public void setMontVenta(int montVenta){
        this.montVenta = montVenta;
    }
    public String getCodVendido(){
        return codVendido;
    }
    public void setCodVendido(String codVendido){
        this.codVendido = codVendido;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getDocIdent(){
        return docIdent;
    }
    public void segDocIdent(int docIdent){
        this.docIdent = docIdent;
    }
}
