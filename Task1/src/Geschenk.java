/**
 * Created by Roman on 05.05.2014.
 */
public class Geschenk {
    private String text="";
    public synchronized String getText() {
        return text;
    }
    public synchronized  void setText(String text){
        this.text = text;
    }
}
