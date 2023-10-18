package Attacks;
import ru.ifmo.se.pokemon.*;

public class Camouflage extends StatusMove
{
    public Camouflage()
    {
        super(Type.NORMAL, 0, 100); //new Thunder_Shock(), new Thunder_Wave()
    }

    @Override
    protected void applySelfEffects(Pokemon p)
    {
        ;
    }

    @Override
    protected String describe()
    {
        return "Использует Camouflage. Тип не изменился, поскольку местность отсутствует";
    }
}
