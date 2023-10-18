package My_Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;


public class Dratini extends Pokemon
{
    public Dratini(String name, int lvl)
    {
        super(name, lvl);
        setStats(41, 64, 45, 50, 50, 50);
        setType(Type.DRAGON);
        setMove(new Light_Screen(), new Thunder_Shock(), new Thunder_Wave(), new Camouflage());
    }
}