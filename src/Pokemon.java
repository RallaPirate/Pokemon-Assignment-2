public class Pokemon {

    String name;
    int level;
    int hp;
    String food;
    String sound;
    String type;

public Pokemon(String name, int level, int hp, String food, String sound) {

    this.name = name;
    this.level = level;
    this.hp = hp;
    this.food = food;
    this.sound = sound;
}

public String getName(){
    return name;
}
public int getLevel(){
    return level;
}
public int getHp(){
    return hp;
}
public String getFood(){
    return food;
}
public String getSound(){
    return sound;
}
public String getType(){
    return type;
}
}
