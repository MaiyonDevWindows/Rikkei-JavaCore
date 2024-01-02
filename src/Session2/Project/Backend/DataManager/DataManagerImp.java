package Session2.Project.Backend.DataManager;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataManagerImp<T> implements DataManager<T>{
    List<T> dataList;
    public DataManagerImp() {
        this.dataList = new ArrayList<>();
    }
    @Override
    public List<T> getDataList(){
        return this.dataList;
    }
    @Override
    public void addData(T data) {
        dataList.add(data);
    }
    @Override
    public T readObjectFromFile(String filePath) {
        T object = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            object = (T) ois.readObject();
        } catch (ClassNotFoundException e){
            System.err.println("Entity does not have Serializable yet");
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            System.err.println("Can not read file.");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return object;
    }

    @Override
    public void writeObjectToFile(String filePath, T object) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(object);
            oos.flush();
        } catch (FileNotFoundException e) {
            System.err.println("File not found.");
        } catch (IOException e) {
            System.err.println("Can not read file.");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
    @Override
    public List<T> readDataFromFile(String filePath) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            dataList = (List<T>) ois.readObject();
        } catch (FileNotFoundException e) {
            return new ArrayList<T>();
        } catch (IOException e) {
            return new ArrayList<T>();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return dataList;
    }

    @Override
    public void writeDataToFile(String filePath) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(dataList);
            oos.flush();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
