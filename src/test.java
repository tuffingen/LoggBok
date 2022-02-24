import java.io.*;

/*
Enkelt test
Skrivet av Magnus
Den 3/9 2020
*/
public class test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        save();
        load();
        model m = new model();
    }


    private static void load() throws IOException, ClassNotFoundException {
        ObjectInputStream ins=new ObjectInputStream(new FileInputStream(new File("testSave")));
        Entry l = (Entry) ins.readObject();
        ins.close();
        System.out.println(l);

    }

    private static void save() throws IOException {
        Entry l = new Entry("test");
        ObjectOutputStream outs=new ObjectOutputStream(new FileOutputStream(new File("testSave")));
        outs.writeObject(l);
        outs.flush();
        outs.close();
    }

}