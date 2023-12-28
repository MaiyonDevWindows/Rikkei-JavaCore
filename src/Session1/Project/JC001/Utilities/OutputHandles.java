package Session1.Project.JC001.Utilities;

public class OutputHandles {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\033[0;30m";
    public static final String RED = "\033[0;31m";
    public static final String GREEN = "\033[0;32m";
    public static final String YELLOW = "\033[0;33m";
    public static final String BLUE = "\033[0;34m";
    public static final String PURPLE = "\033[0;35m";
    public static final String CYAN = "\033[0;36m";
    public static final String WHITE = "\033[0;37m";
    public static String stringSuccess(String string){
        return GREEN + string + RESET;
    }
    public static String stringError(String string){
        return RED + string + RESET;
    }
    public static String stringWarning(String string){
        return YELLOW + string + RESET;
    }
}
