package Attacks;
import ru.ifmo.se.pokemon.*;

/**Удар грома наносит урон и с вероятностью 10% парализует цель.**/

public class Thunder_Shock extends SpecialMove
{
    public Thunder_Shock()
    {
        super(Type.ELECTRIC, 40, 100);
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
            return "наносит урон и парализует противника";

        return "наносит урон";
    }
}
