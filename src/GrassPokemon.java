import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound);
    }

    List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy){

    }
    public void solarBeam(Pokemon name, Pokemon enemy){

    }
    public void leechSeed(Pokemon name, Pokemon enemy){

    }
    public void leaveBlade(Pokemon name, Pokemon enemy){

    }

}
