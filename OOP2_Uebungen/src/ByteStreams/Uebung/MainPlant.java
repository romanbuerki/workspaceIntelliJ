package ByteStreams.Uebung;

import java.io.*;

/**
 * Created by Roman on 22.05.2014.
 */
public class MainPlant {

    public static void main(String[] args){
        Plant[] p = new Plant[10];
        for(int i= 0; i<p.length; i++)
        {
            p[i] = new Plant();
            p[i].setAge((int)(Math.random()*10));
            p[i].setHeight(Math.random()*10);
        }
        File fout = new File("test.dat");
        try{
            fout.createNewFile();
            DataOutputStream dataOutput = new DataOutputStream(
                                    new BufferedOutputStream(
                                    new FileOutputStream("test.dat")));
            for(int i = 0; i<p.length; i++){
                p[i].save(dataOutput);
                p[i].print();
            }
            dataOutput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Laden ");
        try{
            DataInputStream dataInput = new DataInputStream(
                            new BufferedInputStream(
                            new FileInputStream("test.dat")));
            for(int i = 0; i<p.length; i++)
            {
                p[i].load(dataInput);
                p[i].print();
            }
            dataInput.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
