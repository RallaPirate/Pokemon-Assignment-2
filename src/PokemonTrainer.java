import java.util.ArrayList;
import java.util.List;

public class PokemonTrainer {

    String name;
    List<Pokemon> pokemons = Main.pokemons;


    public PokemonTrainer(String name, String pokemons) {
        this.name = name;
        this.pokemons = new ArrayList<Pokemon>();
    }
  public String getName() {
        return name;
  }

  public List<Pokemon> getPokemons() {
        return pokemons;
  }
}
