/**
 * Main
 */

import java.util.Scanner;
import pokemon.*;
import pokemon.pokemonlegendario.PokemonLegendario;
import pokedex.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        String nombre;
        String tipo;
        int peso;
        int altura;
        String descripcion;
        String localizasion;
        int numeroPokedex;
        int menuRepeticion = -1;
        int opcion;

        ListaPokemon pkmnAvistados = new ListaPokemon();
        ListaPokemon pkmnCapturados = new ListaPokemon();

        System.out.println("Buenas DON que quieres hacer");


        while (menuRepeticion != 0) {
            
            System.out.println("1.- Añadir pokemon avistado");
            System.out.println("2.- Añadir avistamiento legendario");
            System.out.println("3.- Pasar a capturados");
            System.out.println("4.- Mostrar lista de avistados");
            System.out.println("5.- Mostrar lista de capturados");
            System.out.println("6.- Cerrar pokedex");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1 :
                    System.out.println("Introduce el nombre del pokémon");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce el tipo del pokémon");
                    tipo = teclado.nextLine();

                    Pokemon Pkmn = new Pokemon(nombre,tipo);
                    pkmnAvistados.anadirPokemon(Pkmn);

                    System.out.println("\n" + "Pokemon avistado " + "\n");
                    break;
                
                case 2 :
                    System.out.println("Introduce el nombre del pokémon legendario");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce el tipo del pokémon legendario");
                    tipo = teclado.nextLine();
                    System.out.println("Introduce la localización del pokémon legendario");
                    localizasion = teclado.nextLine();

                    PokemonLegendario pkmnLegendario = new PokemonLegendario(nombre, tipo, localizacion);
                    break;
            
                default:
                    break;
            }
        }
    }
}