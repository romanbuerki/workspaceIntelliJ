package ByteStreams.Uebung;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/**
 * Created by Roman on 22.05.2014.
 */
public class Plant {

    private boolean indoor;
    private int age;
    private double height;

    public void save(DataOutputStream outputStream) throws IOException {
       outputStream.writeBoolean(indoor);
       outputStream.writeInt(age);
        outputStream.writeDouble(height);
    }
    public void load(DataInputStream inputStream) throws IOException{
        indoor = inputStream.readBoolean();
        age = inputStream.readInt();
        height = inputStream.readDouble();
    }

    public void print(){
        System.out.println(indoor);
        System.out.println(age);
        System.out.println(height);
    }

    public boolean isIndoor() {
        return indoor;
    }

    public void setIndoor(boolean indoor) {
        this.indoor = indoor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }



}
