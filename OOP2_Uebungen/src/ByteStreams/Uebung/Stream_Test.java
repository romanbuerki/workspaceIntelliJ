package ByteStreams.Uebung;

import java.io.*;

/**
 * Created by Roman on 22.05.2014.
 */
public class Stream_Test {

    public static void main(String[] args){
        try{
            writeToFile();
            readFromFile();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile() throws IOException {
        String fileName = "test.dat";
        File file = new File(fileName);
        if(!file.exists()){
            file.createNewFile();
        }
        FileOutputStream fileOutput = new FileOutputStream(fileName);
        BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);
        DataOutputStream dataOutput = new DataOutputStream(bufferedOutput);

        dataOutput.writeBoolean(true);
        dataOutput.writeDouble(24.635276);
        dataOutput.writeFloat((float)3.14159);
        dataOutput.writeFloat(3.14159f);
        dataOutput.write(65);
        dataOutput.writeChar(65);
        dataOutput.close();
        bufferedOutput.close();
        fileOutput.close();
    }

    public static void readFromFile() throws IOException{
        String fileName = "test.dat";
        File file = new File(fileName);
        if(file.exists()){
            DataInputStream dataInput = new DataInputStream(
                            new BufferedInputStream(
                            new FileInputStream(fileName)));

            System.out.println(dataInput.readBoolean());
            System.out.println(dataInput.readDouble());
            System.out.println(dataInput.readFloat());
            System.out.println(dataInput.readFloat());
            System.out.println(dataInput.read());
            System.out.println(dataInput.readChar());
            dataInput.close();
        }
    }

}
