package Attacks;
import ru.ifmo.se.pokemon.*;


/**Light Screen reduces damage from Special attacks by 50%, for 5 turns. Its effects apply to all Pokémon on the user's side of the field.**/

public class Light_Screen extends StatusMove
{
    public Light_Screen()
    {
        super(Type.PSYCHIC, 0, 100);

    }

    @Override
    protected void applyOppEffects(Pokemon p)
    {
        Effect ls_eff = new Effect().turns(5).stat(Stat.SPECIAL_ATTACK, -2);
        p.addEffect(ls_eff);
    }

    @Override
    protected String describe()
    {
        return "использует Light_Screen и уменьшает урон от специальных атак на 50% на 5 ходов";
    }
}
