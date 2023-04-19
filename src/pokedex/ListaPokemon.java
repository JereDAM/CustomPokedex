package pokedex;
import pokemon.Pokemon;

public class ListaPokemon {
    private Pokemon []listaPokemon;
    int tamanoPokedex = 0;

    public ListaPokemon() {
        this.listaPokemon = new Pokemon[1];
    }

    public void anadirPokemon(Pokemon miPokemon){
        Pokemon [] listaTemporal = new Pokemon[this.tamanoPokedex + 1];

        for (int i = 0; i < this.listaPokemon.length; i++) {
            listaTemporal[i] = this.listaPokemon[i];
        }

        listaTemporal[this.tamanoPokedex] = miPokemon;
        this.listaPokemon = listaTemporal;
        this.tamanoPokedex++;
    }

    public void eliminarPokemon(Pokemon miPokemon){
        int pokemonTotales = 0;

        for (int i = 0; i < listaPokemon.length; i++) {
            if(this.listaPokemon[i].equals(miPokemon)){
                this.listaPokemon[i] = null;
            }else{
                pokemonTotales++;
            }
        }
        
        Pokemon[] listaTemporal = new Pokemon [pokemonTotales];
        int nuevoIndice = 0;

        for (int i = 0; i < listaPokemon.length; i++) {
            if(this.listaPokemon[i] != null) {
                listaTemporal[nuevoIndice] = this.listaPokemon[i];
                nuevoIndice++;
            }
        }

        this.listaPokemon = listaTemporal;
        this.tamanoPokedex = pokemonTotales;
    }

    public Pokemon elPokemon(int numeroPokemon){
        return (listaPokemon[numeroPokemon - 1]);
    }

    public void mostrarPokedex(){
        int numeroPokemon = 1;
        for(Pokemon miPokemon : this.listaPokemon){
            System.out.println(numeroPokemon + "-->" + miPokemon);
            numeroPokemon++;
        }
    }

}
