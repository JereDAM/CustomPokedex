package pokemon.pokemonlegendario;
import pokemon.Pokemon;

public class PokemonLegendario extends Pokemon {
    private String localizacion;

    public PokemonLegendario(String nombre, String tipo, int altura, int peso, String descripcion) {
        super(nombre, tipo, altura, peso, descripcion);
    }

    public PokemonLegendario(String nombre, String tipo, String localizacion) {
        super(nombre, tipo);
        this.localizacion = localizacion;
    }

@Override
    public String toString(){

    String mensaje = (" ");

    if(nombre != null){
        mensaje += ("Nombre: " + nombre);
    }else{
        mensaje += ("Nombre: ???" + "\n");
    }

    if (tipo != null) {
        mensaje += ("Tipo : " + tipo + "\n");
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

    if (this.descripcion != null){
        mensaje += ("Descripción : " + descripcion + "\n");
    }else{
        mensaje += ("Descripción : ??? " + "\n");
    }

    if(localizacion != null){
        mensaje += ("Localizacion : " + localizacion);
    }else{
        mensaje += ("Localizacion : ??? " + "\n");
    }

    return mensaje;
    }
}
