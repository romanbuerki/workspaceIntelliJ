/**
 * Created by Roman on 05.05.2014.
 */
public class main {

    public static void main(String[] args)
    {
        Geschenk g = new Geschenk();
        ParentThread p = new ParentThread(g);
        ChilThread c = new ChilThread(g);
        Thread parent = new Thread(p);
        parent.start();
        c.start();

    }


}
