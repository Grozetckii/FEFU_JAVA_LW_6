import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**����������� ����� ��� �������� ������ � �������� (���, �������, ��� ��������, ����� � �.�.).
 *  ����������� ������ ���������� ������ � �������� � ���� � �������� ������ � �������� �� �����,
 *  ��������� �������� ������������. ��� ������������ ������� ��� ����������: ���� ��� ������ ������,
 *  ������ - ��� ������.**/

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
