package Session2.Project.Backend.Business;

import Session2.Project.Backend.DataManager.DataManagerImp;
import Session2.Project.Backend.Entity.Account;

import java.io.File;

public class AccountBusiness extends DataManagerImp <Account> {
    public void writeData() {
        File currentDirectory = new File(".");
        String currentPath = currentDirectory.getAbsolutePath();
        String fileSavePath =
                String.join(File.separator, currentPath, "src", "Session2", "Project", "Backend", "user.txt");
        Account account = new Account("Admin", "Admin");
        addData(account);
        writeDataToFile(fileSavePath);
        System.out.println("Write data successfully.");
    }
    public void readData(){
        File currentDirectory = new File(".");
        String currentPath = currentDirectory.getAbsolutePath();
        String fileSavePath =
                String.join(File.separator, currentPath, "src", "Session2", "Project", "Backend", "user.txt");
        readDataFromFile(fileSavePath);
        System.out.println(getDataList().get(0).toString());
    }
}
