package My_Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;


public class Linoone extends Pokemon
{
    public Linoone(String name, int lvl)
    {
        super(name, lvl);
        setStats(78, 70, 61, 50, 61, 100);
        setType(Type.NORMAL);
        setMove(new Thunder_Wave(), new Shadow_Punch(), new Hydro_Pump());
    }
}