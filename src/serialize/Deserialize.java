package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.function.ObjIntConsumer;

/**
 * @author 重新做人idea基础学习
 * @date 2020-12-02
 */
public class Deserialize {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("student.ser");
        ObjectInputStream in =new ObjectInputStream(fileInputStream);
        Student e=(Student)in.readObject();
        in.close();
        fileInputStream.close();
        System.out.println(e);
    }
}
