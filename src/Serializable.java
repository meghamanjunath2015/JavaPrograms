//java serialization and de-serialization of java object
import java.io.*;

public class Serializable implements java.io.Serializable {

    public int a;
    public String b;

    //default constructor
    public Serializable(int a, String b){
        this.a = a;
        this.b = b;
    }
}

class convertJavaObject {

    public static void main(String[] args) {
        Serializable s = new Serializable(5, "Try this to convert");
        String filename = "fileForConversion.ser";

        try{

            //This is an outputStream to write data to a file
            FileOutputStream file = new FileOutputStream(filename);
            //java objects to convert to outputStream
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(s);
            out.close();
            file.close();

            System.out.println(s + " This has been serialized");
        }
        catch (IOException e) {
            System.out.println("IO Exception has been caught");
        }

        //Deserialization

        Serializable s1 = null;

        try{

            //convert data in file to inputStream
            FileInputStream infile = new FileInputStream(filename);
            //convert inputStream to java object
            ObjectInputStream in = new ObjectInputStream(infile);

            s1 = (Serializable)in.readObject();

            System.out.println("a : " + s1.a);
            System.out.println("b : " + s1.b);

            in.close();
            infile.close();

        }
        catch (IOException e) {
            System.out.println("IO Exception has been caught");
        }
        catch (ClassNotFoundException e){
            System.out.println("Class not found exception has been caught");
        }
    }
}
