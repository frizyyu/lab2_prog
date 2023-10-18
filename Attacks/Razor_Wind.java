package Attacks;

import ru.ifmo.se.pokemon.*;

public class Razor_Wind extends SpecialMove
{
    public Razor_Wind()
    {
        super(Type.NORMAL, 80, 100);
    }
    //public static int damag;

    /*@Override
    protected void applyOppDamage(Pokemon def, double damage)
    {
        damag = (int) damage;
    }*/

    @Override
    protected String describe()
    {
        return "покемон применяет Razor_Wind и создаёт вихрь и наносит урон";
    }
}
