public class Registro {
    private int montVenta;
    private String codVendido;
    private String apellido;
    private String nombre;
    private int docIdent;
    private Vehiculos autoVendido;
    
    //Constructor
    public Registro(){
        
    }

    //Metodos o acciones de la clase Registro
    //get y set  
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
    public void setDocIdent(int docIdent){
        this.docIdent = docIdent;
    }
    public Vehiculos getAutoVendido(){
        return autoVendido;
    }
    public void setAutoVendido(Vehiculos autoVendido){
        this.autoVendido = autoVendido;
    }
}
