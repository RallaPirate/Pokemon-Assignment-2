import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {

    List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "thunder", "voltTackle");

    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
    super(name, level, hp, food, sound);
}

List<String> getAttacks(){
    return attacks;
}


    void thunderPunch(Pokemon name, Pokemon enemy){

    }
    void electroBall(Pokemon name, Pokemon enemy){

    }
    void thunder(Pokemon name, Pokemon enemy){

    }
    void voltTackle(Pokemon name, Pokemon enemy){

    }

}
