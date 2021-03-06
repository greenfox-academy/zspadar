import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by zsuzsanna.padar on 2017. 04. 06..
 */
public class FileHelper {

  private String filePath;

  FileHelper(String aFilePath) {
    filePath = aFilePath;
  }

  public void save(String content) {
    try {
      Files.write(Paths.get(filePath), content.getBytes());
    } catch(Exception e) {}
  }

  public void saveAll(List<Task> taskList) {
    try {
      FileOutputStream fos = new FileOutputStream(filePath);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(taskList);
      oos.close();
    }catch (Exception e) {}
  }

  List<String> load() {
    try {
      return Files.readAllLines(Paths.get(filePath));
    } catch(Exception e) {
      List<String> list = new ArrayList<>();
      return list;
    }
  }
  public void loadAll() {
    try {
      FileInputStream fis = new FileInputStream(filePath);
      ObjectInputStream ois = new ObjectInputStream(fis);
      List<Task> taskList = (List<Task>) ois.readObject();
      ois.close();
    } catch (Exception e) {}
  }

}
