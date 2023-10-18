package My_Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;


public class Magnemite extends Pokemon
{
    public Magnemite(String name, int lvl)
    {
        super(name, lvl);
        setStats(25, 35, 70, 95, 55, 45);
        setType(Type.ELECTRIC, Type.STEEL);
        setMove(new Light_Screen(), new Thunder_Wave());
    }
}