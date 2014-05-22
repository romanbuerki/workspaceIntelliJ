package EinlesenUndAusgeben;

import java.io.*;

/**
 * Created by Roman on 22.05.2014.
 */
public class ProcessFile {

    public static void main(String[] args) {
       // new ProcessFile().crypt("text.txt", "crypt.crp", -4);
       // new ProcessFile().crypt("crypt.crp", "plain.txt", 4);
        new ProcessFile().replace("text.txt", "crypt.txt");
    }

    public void crypt(String inName, String outName, int key){
        try{
            File in = new File(inName);
            File out = new File(outName);
            if(in.exists()){
                if(!out.exists()){
                    out.createNewFile();
                }
                FileReader fin = new FileReader(inName);
                FileWriter fout = new FileWriter(outName);
                int ascii;
                while((ascii = fin.read()) > 0){
                    fout.write(ascii + key);
                }
                fin.close();
                fout.close();

            }
        }
        catch(FileNotFoundException e1)
        {
            System.out.println("Das File wurde nicht gefunden");
        }
        catch(IOException e){
            System.out.println("Das File konnte nicht gelesen werden");
        }

    }

    public void replace(String inName, String outName){
        try{
            File in = new File(inName);
            File out = new File(outName);
            if(in.exists()){
                if(!out.exists()){
                    out.createNewFile();
                }
                FileReader fin = new FileReader(inName);
                FileWriter fout = new FileWriter(outName);
                BufferedWriter bOut = new BufferedWriter(fout);
                BufferedReader bIn = new BufferedReader(fin);
                String line = bIn.readLine();
                while(line!=null){

                    line = line.replaceAll("Hallo", "Hello");
                    bOut.write(line);
                    bOut.newLine();
                    line = bIn.readLine();
                }

                bOut.flush();
                bOut.close();
                bIn.close();
                fin.close();
                fout.close();

            }
        }
        catch(FileNotFoundException e1)
        {
            System.out.println("Das File wurde nicht gefunden");
        }
        catch(IOException e){
            System.out.println("Das File konnte nicht gelesen werden");
        }
    }

}
