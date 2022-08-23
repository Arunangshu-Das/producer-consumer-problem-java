import java.io.*;

class Save implements Serializable
{
    int i;
}
public class serializable {
    public static void main(String[] args) throws Exception{
        Save obj=new Save();
        obj.i=4;
        File f=new File("obj.txt");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream ob=new ObjectOutputStream(fos);
        ob.writeObject(obj);


        FileInputStream fin=new FileInputStream(f);
        ObjectInputStream obs=new ObjectInputStream(fin);
        Save s=(Save)obs.readObject();
        System.out.println(s.i);
    }
}
