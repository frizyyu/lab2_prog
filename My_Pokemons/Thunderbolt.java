package My_Pokemons;

import ru.ifmo.se.pokemon.*;

public class Thunderbolt extends SpecialMove
{
    public Thunderbolt()
    {
        super(Type.ELECTRIC, 90, 100);
    }
    boolean fl = false;
    @Override
    protected void applyOppDamage(Pokemon def, double damage)
    {
        int ch = (int)(Math.random() * 101);
        if (ch <= 10)
        {
            Effect.paralyze(def);
            fl = true;
        }

    }

    @Override
    protected String describe()
    {
        if (fl)
            return "Использует Thunderbolt: наносит урон и парализует противника";

        return "Использует Thunderbolt: наносит урон";
    }
}
