import ru.ifmo.se.pokemon.*;
import My_Pokemons.*;

public class Main
{
    public static void main(String[] args)
    {
        Battle b = new Battle();
        Dratini p11 = new Dratini("(Dratini)", 10);
        Linoone p12 = new Linoone("(Linoone)", 10);
        Cresselia p13 = new Cresselia("(Cresselia)", 10);

        Magnemite p21 = new Magnemite("(Magnemite)", 1);
        Magneton p22 = new Magneton("(Magneton)", 1);
        Claydol p23 = new Claydol("(Claydol)", 1);


        b.addAlly(p11);
        b.addAlly(p12);
        b.addAlly(p13);
        b.addFoe(p23);
        b.addFoe(p22);
        b.addFoe(p21);

        b.go();
    }
}
