
//Clase
public class Vehiculos {
    //Atributos de la clase Vehiculos
    private String codigo;
    private String marca;
    private String tipo;
    private int modelo;
    private int kilometraje;
    
    //Constructor
    public Vehiculos(){
    
    }

//Metodos o acciones de la clase Personas
//get y set 
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
