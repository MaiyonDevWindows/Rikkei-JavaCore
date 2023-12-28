package Session1.Project.JC001.Business;

import java.util.List;

public interface DataManager <T> {
    List<T> getDataList();
    void addData(T data);
    List<T> readDataFromFile(String filePath);
    void writeDataToFile(String filePath);
}
