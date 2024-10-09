import java.util.List;

public class PokemonGymOwner {
   List<Pokemon> pokemons = Main.pokemons;
    String name;
    String town;

   public PokemonGymOwner(String name, String town, List<Pokemon> pokemons){
       this.name = name;
       this.town = town;
   }

    public String getTown() {
        return town;
    }
    public String getName() {
       return name;
    }

    public List<Pokemon> getPokemons() {
       return pokemons;
    }

}
