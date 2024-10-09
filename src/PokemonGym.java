import java.util.List;

interface PokemonGym {
    
    void enteredTheGym(PokemonTrainer player1);

    void printPokemon(List<Pokemon> pokemons);

    Pokemon selectPokemon(String pokemon, PokemonTrainer trainer);

    Pokemon choosePokemon(PokemonTrainer trainer);

    Pokemon chooseGymPokemon(PokemonGymOwner gymOwner);

    int randomAttackByGymOwner();

    String chooseAttackPlayer(Pokemon p);

    void gymOwnerAttacks(Pokemon gymPokemon, Pokemon pokemon);

    void fightRound(PokemonTrainer trainer, PokemonGymOwner owner, Pokemon pokemon, Pokemon gymPokemon);

    void performAttackPlayer(Pokemon pokemon, Pokemon gymPokemon, String attack);

    void attackOrChange(Pokemon pokemon, Pokemon gymPokemon, PokemonTrainer trainer, PokemonGymOwner gym);
}

