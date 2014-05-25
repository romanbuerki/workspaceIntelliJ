package SerialisierungTask;

import java.io.*;


/**
 * Created by Roman on 25.05.2014.
 */
public class test_ObjectStream {

    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("temp.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Plant p = new Plant();
        p.indoor = true;
        p.age = 3;
        p.height = 3.2;
        oos.writeObject(p);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("temp.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        try{
        p = (Plant)ois.readObject();
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        ois.close();
        fis.close();
        p.print();
    }
}
