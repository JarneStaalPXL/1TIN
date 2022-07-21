package be.pxl.h4.oef2;

public class Pokedex {
    private Pokemon[] pokemons;

    public Pokedex(int aantalPokemon) {
        pokemons = new Pokemon[aantalPokemon];
    }

    public Pokemon[] getPokemon() {
        return pokemons;
    }

    public boolean bevat(Pokemon pokemon) {
        for (Pokemon value : this.pokemons) {
            if (value != null) {
                if (value.getNaam().equals(pokemon.getNaam())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void voegToe(Pokemon pokemon) {
        if (pokemon != null) {
            if (!bevat(pokemon)) {
                boolean foundAPlace = false;


                //find next null value in pokemons array
                for (int i = 0; i < pokemons.length; i++) {
                    if (pokemons[i] == null) {
                        pokemons[i] = pokemon;
                        foundAPlace = true;
                        break;
                    }
                }

                if(!foundAPlace){
                    throw new IllegalArgumentException("Pokedex is full");
                }
            }
        }
    }


    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        for (Pokemon pokemon : this.pokemons) {
            if (pokemon != null) {
                output.append("- ").append(pokemon.toString()).append("(").append(pokemon.getType()).append("\n");
            }
        }
        return output.toString();
    }
}
