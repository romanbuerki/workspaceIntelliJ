/**
 * Created by Roman on 05.05.2014.
 */

public class ParentThread implements  Runnable {
    private Geschenk g;

    public ParentThread(Geschenk g) {
        this.g = g;
    }

    @Override
    public void run(){
        for(int i = 1; i <= 20; i++)
        {
            g.setText("Geschenk zum " + i + "ten Geburtstag");
            try {
                Thread.sleep(3560);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    };
}
