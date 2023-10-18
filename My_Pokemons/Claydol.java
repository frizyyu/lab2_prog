package My_Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;


public class Claydol extends Pokemon
{
    public Claydol(String name, int lvl)
    {
        super(name, lvl);
        setStats(50, 60, 95, 120, 70, 70);
        setType(Type.ELECTRIC, Type.STEEL);
        setMove(new Light_Screen(), new Thunder_Wave(), new Razor_Wind(), new Thunderbolt());
    }
}