package Attacks;
import ru.ifmo.se.pokemon.*;

import java.util.logging.Level;

public class Thunder_Wave extends StatusMove {
    public Thunder_Wave()
    {
        super(Type.ELECTRIC, 0, 90);
    }
    @Override
    protected void applyOppEffects(Pokemon p)
    {
        Effect.paralyze(p);
    }

    @Override
    protected String describe()
    {
        return "покемон применяет Thunder Wave: парализует противника";
    }
}
