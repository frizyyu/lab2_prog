package Attacks;

import ru.ifmo.se.pokemon.*;

public class Hydro_Pump extends SpecialMove
{
    public Hydro_Pump()
    {
        super(Type.WATER, 110, 80);
    }


    @Override
    protected String describe()
    {
        return "покемон применяет Hydro Pump и наносит урон";
    }
}
