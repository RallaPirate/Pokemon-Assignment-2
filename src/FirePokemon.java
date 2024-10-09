import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "Inferno");


public FirePokemon(String name, int level, int hp, String food, String sound){

    super(name, level, hp, food, sound);
}
    List<String> getAttacks() {
        return attacks;
    }

    void fireLash(Pokemon name, Pokemon enemy){

    }
    void flameThrower(Pokemon name, Pokemon enemy){

    }
    void pyroBall(Pokemon name, Pokemon enemy){

    }
    void inferno(Pokemon name, Pokemon enemy){

    }
}
