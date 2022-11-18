import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Main2 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream("obj.txt")){
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Human human = (Human) objectInputStream.readObject();
            System.out.println(human.getName());
            System.out.println(human.getSurname());
            System.out.println(human.getYearOfBirth());
            System.out.println(human.getMail());
            System.out.println(human.getCity());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
