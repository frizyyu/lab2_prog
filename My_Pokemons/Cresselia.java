package My_Pokemons;
import ru.ifmo.se.pokemon.*;
import Attacks.*;


public class Cresselia extends Pokemon
{
    public Cresselia(String name, int lvl)
    {
        super(name, lvl);
        setStats(120, 70, 110, 75, 120, 85);
        setType(Type.PSYCHIC);
        setMove(new Thunder_Wave(), new Shadow_Punch(), new Hydro_Pump(), new Eruption());
    }
}