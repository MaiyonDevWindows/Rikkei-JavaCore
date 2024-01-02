package Session2.Project.Backend.Utilities;

import java.io.File;

public class DataFilePaths {
    public static String getProjectAbsolutePath(){
        File currentProject = new File(".");
        return currentProject.getAbsolutePath();
    }
    public static String getUserSaveFilePath(){
        return String.join(File.separator, getProjectAbsolutePath(),
                "src", "Session2", "Project", "Backend", "user.txt");
    }
}
