package My_Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;


public class Magneton extends Pokemon
{
    public Magneton(String name, int lvl)
    {
        super(name, lvl);
        setStats(50, 60, 95, 120, 70, 70);
        setType(Type.ELECTRIC, Type.STEEL);
        setMove(new Light_Screen(), new Thunder_Wave(), new Razor_Wind());
    }
}