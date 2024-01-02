package Session2.Project.Backend.DataManager;

import java.util.List;

public interface DataManager <T>{
    List<T> getDataList();
    void addData(T data);
    T readObjectFromFile(String filePath);
    void writeObjectToFile(String filePath, T object);
    List<T> readDataFromFile(String filePath);
    void writeDataToFile(String filePath);
}
