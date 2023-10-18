package Attacks;

import ru.ifmo.se.pokemon.*;
/**точно готово**/
public class Eruption extends SpecialMove
{
    public Eruption()
    {
        super(Type.FIRE, 150, 100);
    }
    int dmg;
    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def)
    {
        //System.out.println((150 * att.getHP() / att.getStat(Stat.HP)) + " " + att.getStat(Stat.HP));
        dmg = (int) Math.round(150 * att.getHP() / att.getStat(Stat.HP));
        return (int) Math.round(150 * att.getHP() / att.getStat(Stat.HP));
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage)
    {
        def.setMod(Stat.HP, dmg);
    }

    @Override
    protected String describe()
    {
        return "покемон применяет Eruption и наносит урон";
    }
}
