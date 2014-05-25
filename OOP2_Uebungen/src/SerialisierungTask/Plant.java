package SerialisierungTask;

import java.io.Serializable;

/**
 * Created by Roman on 25.05.2014.
 */
public class Plant implements Serializable{
    boolean indoor = false;
    int age = 0;
    double height = 0;

    public void print(){
        System.out.println(indoor + " / " + age + " / " + height);
    }
}
