package JC001.Business;

import javax.swing.text.html.parser.Entity;
import java.util.List;

public interface DataManager <T> {
    public List<T> getDataList();
    public void addData(T data);
    public List<T> readDataFromFile(String filePath);
    public void writeDataToFile(String filePath);
}
