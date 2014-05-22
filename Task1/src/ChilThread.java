/**
 * Created by Roman on 05.05.2014.
 */
public class ChilThread extends Thread {
    private Geschenk g;

    public ChilThread(Geschenk g){
        this.g = g;
    }

    @Override
    public void run(){
       boolean  check = false;
        while(!check) {
            if (g.getText() != "") {
                System.out.println("Juhu, ich habe mein " + g.getText() + " bekommen");
                if (g.getText().contains("20")) {
                    check = true;
                }
                g.setText("");
            } else {
                System.out.println("Ouhhh");
            }
            try {
                Thread.sleep((int)(Math.random()*300));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
