import java.time.LocalDate;

//Clase
public class Vehiculos {
    //Atributos de la clase Vehiculos
    private String codigo;
    private String marca;
    private String tipo;
    private int modelo;
    private int kilometraje;
    
    //Constructor
    public Vehiculos(String codigo, String marca, String tipo, int modelo, int kilometraje, int precio){
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

//Metodos o acciones de la clase Personas
//get y set de nombre
public String getCodigo(){
    return codigo;
}
public void setCodigo(String codigo){
    this.codigo = codigo;
}
public String getMarca(){
    return marca;
}
public void setMarca(String marca){
    this.marca = marca;
}
public String getTipo(){
    return tipo;
}
public void setTipo(String tipo){
    this.tipo = tipo;
}
public int getModelo(){
    return modelo;
}
public void setModelo(int modelo){
    this.modelo = modelo;
}
public int getKilometraje(){
    return kilometraje;
}
public void setKilometraje(int kilometraje){
    this.kilometraje  = kilometraje;
}

}
