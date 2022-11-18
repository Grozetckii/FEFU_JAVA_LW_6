import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**–азработать класс дл€ хранени€ данных о человеке (им€, фамили€, год рождени€, адрес и т.п.).
 *  –еализовать методы сохранени€ данных о человеке в файл и загрузки данных о человеке из файла,
 *  использу€ механизм сериализации. ƒл€ демонстрации создать два приложени€: одно дл€ записи данных,
 *  другое - дл€ чтени€.**/

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Denis", "Grozetskiy", 200,
                "grozetckii.ds@students.dvfu.ru", "Vladivostok");

        try(FileOutputStream outputStream = new FileOutputStream("obj.txt")){
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(human);
            objectOutputStream.close();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
