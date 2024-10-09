import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCannon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {

        super(name, level, hp, food, sound);

    }

    List<String> getAttacks() {
        return attacks;
    }

    void surf(Pokemon name, Pokemon enemy){

    }
    void hydroPump(Pokemon name, Pokemon enemy){

    }
    void hydroCanon(Pokemon name, Pokemon enemy){

    }
    void rainDance(Pokemon name, Pokemon enemy){

    }
}
