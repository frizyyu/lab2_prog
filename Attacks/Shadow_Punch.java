package Attacks;

import ru.ifmo.se.pokemon.*;

public class Shadow_Punch extends PhysicalMove
{
    public Shadow_Punch()
    {
        super(Type.GHOST, 60, 100);
    }
    @Override
    protected void applyOppDamage(Pokemon def, double damage)
    {
        // System.out.println(damage + " " + def.getHP());
        def.setMod(Stat.HP, (int)Math.round(damage));
        // System.out.println(damage + " " + def.getHP());
    }

    @Override
    protected String describe()
    {
        return "покемон применяет Shadow Punch и наносит урон";
    }
}
