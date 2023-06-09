package pokemon;

public class Pokemon {
    protected String nombre;
    protected String tipo;
    protected int altura;
    protected int peso;
    protected String descripcion;
    
    public  Pokemon(String nombre, String tipo, int altura, int peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public Pokemon(String nombre, String tipo){
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre(){
        return nombre;
    }

    public String getTipo(){
        return tipo;
    }

    public void setAltura(int altura){

    }

    public int getAltura(){
        return altura;
    }

    public void setpeso(int peso){

    }

    public int getPeso(){
        return peso;
    }

    public void setDescripcion(String descripcion){
        
    }

    public String getDescripcion(){
        return descripcion;
    }

    
@Override
    public String toString(){

    String mensaje = (" ");

    if (nombre == null) {
        mensaje += ("Nombre : ??? " + "\n");
    } else{
        mensaje += ("Nombre : " + nombre + "\n"); //No sé por qué no se muestra por consola
    }

    if (tipo != null) {
        mensaje += ("Tipo : " + this.tipo + "\n");
    } else{
        mensaje += ("Tipo : ??? " + "\n");
    }

    if (altura <= 0) {
        mensaje += ("Altura : ??? " + "\n");
    } else {
        mensaje += ("Altura : " + altura + "\n");
    }

    if (peso <= 0) {
        mensaje += ("Peso : ??? " + "\n");
    } else {
        mensaje += ("Peso : " + peso + "\n");
    }

    if (descripcion != null){
        mensaje += ("Descripción : " + descripcion + "\n");
    }else{
        mensaje += ("Descripción : ??? " + "\n");
    }

    return mensaje;
    }
    
}

