package be.pxl.h4.oef2;

public class Trainer {
    public Pokedex pokedex;
    public String naam;
    public Trainer(String naam){
        this.naam = naam;
        pokedex = new Pokedex(10);
    }

    public Pokedex getPokedex() {
        return this.pokedex;
    }

    public String getNaam() {
        return this.naam;
    }

    public void vangPokemon(Pokemon pokemon){
        if(pokemon != null){
            if(!this.pokedex.bevat(pokemon)){
                this.pokedex.voegToe(pokemon);
            }
        }
    }

    @Override
    public String toString(){
        return naam;
    }
}
