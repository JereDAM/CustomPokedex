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
        String localizacion;
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
                    teclado.nextLine();
                    System.out.println("Introduce el tipo del pokémon");
                    tipo = teclado.nextLine();

                    Pokemon Pkmn = new Pokemon(nombre,tipo);
                    pkmnAvistados.anadirPokemon(Pkmn);

                    System.out.println("************************Pokemon avistado*************************** ");
                    break;
                
                case 2 :
                    System.out.println("Introduce el nombre del pokémon legendario");
                    nombre = teclado.nextLine();
                    System.out.println("Introduce el tipo del pokémon legendario");
                    tipo = teclado.nextLine();
                    System.out.println("Introduce la localización del pokémon legendario");
                    localizacion = teclado.nextLine();

                    PokemonLegendario pkmnLegendario = new PokemonLegendario(nombre, tipo, localizacion);

                    pkmnAvistados.anadirPokemon(pkmnLegendario);
                    System.out.println("Pokemon legendario avistado");
                    break;
                
                case 3:
                    System.out.println("Introduce el numero del pokémon capturado");
                    pkmnAvistados.mostrarPokedex();
                    numeroPokedex = teclado.nextInt();

                    Pokemon pokemonCapturado = pkmnAvistados.elPokemon(numeroPokedex);
                    pkmnCapturados.anadirPokemon(pokemonCapturado);
                    pkmnAvistados.eliminarPokemon(pokemonCapturado);
                    System.out.println("Introduce el peso del pokemon capturado");
                    peso = teclado.nextInt();
                    pokemonCapturado.setpeso(peso);
                    System.out.println("Introduce la altura del pokémon capturado");
                    altura = teclado.nextInt();
                    pokemonCapturado.setAltura(altura);
                    System.out.println("Introduce la descripción del pokémon");
                    descripcion = teclado.nextLine();
                    pokemonCapturado.setDescripcion(descripcion);
                    break;
                
                case 4:
                    pkmnAvistados.mostrarPokedex();
                    break;
                
                case 5:
                    pkmnCapturados.mostrarPokedex();
                    break;

                case  6:
                    menuRepeticion = 0;
                    break;
            
                default:
                    System.out.println("Eso no es una opción >:(");
                    break;
            }
        }
    }
}