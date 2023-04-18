package Pokemon;

public class Pokemon {
    private String nombre;
    private String tipo;
    private int altura;
    private int peso;
    private String descripcion;
    
    public  Pokemon(String nombre, String tipo, int altura, int peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public Pokemon(String nombre, String tipo){

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
    };
}

