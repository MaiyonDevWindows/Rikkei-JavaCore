package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Business.LoginBusiness;
import Session2.Project.Backend.Entity.Account;
import Session2.Project.Backend.Utilities.CommonHandles;
import Session2.Project.Backend.Utilities.DataFilePaths;
import Session2.Project.Backend.Utilities.InputHandles;
import Session2.Project.Backend.Utilities.OutputHandles;

import java.util.Scanner;

public class LoginPresentation implements IManagement{
    private LoginBusiness loginBusiness = null;
    private AdminPresentation adminPresentation = null;
    private UserPresentation userPresentation= null;
    public LoginPresentation(){
        loginBusiness = new LoginBusiness();
        adminPresentation = new AdminPresentation();
        userPresentation = new UserPresentation();
    }
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            Account account = loginBusiness.checkExistsSessionUser();
            System.out.printf("""
                    |===============LOGIN===============|
                    1. Login.
                    2. Login as (%s).
                    3. Clear user session.
                    4. Exit.
                    """, account != null ? account.getUserName() : "Null");
            choice = CommonHandles.inputChoice(scanner);
            switch (choice){
                case 1:
                    System.out.print("Please enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Please enter password: ");
                    String password = scanner.nextLine();
                    account = loginBusiness.login(userName, password);
                    if(account != null){
                        if (account.isActive()){
                            System.out.println(OutputHandles.stringSuccess("Login successfully."));
                            System.out.print(
                                    OutputHandles.stringWarning("Are you save user session for next login (Yes/No): "));
                            if(InputHandles.inputConfirmValue(scanner)){
                                System.out.println(OutputHandles.stringSuccess("Save user login session successfully."));
                                loginBusiness.writeObjectToFile(DataFilePaths.getUserSaveFilePath(), account);
                            }
                            displayMainMenu(account, scanner);
                        }else System.err.println("Account has been locked, please try login another account.");
                    }else System.err.println("User name or password is incorrect, please try again.");
                    break;
                case 2:
                    if(account != null) {
                        if(account.isActive()){
                            System.out.println(OutputHandles.stringSuccess("Welcome back, " + account.getUserName()));
                            displayMainMenu(account, scanner);
                        }
                        else System.err.println("Account has been locked, please try login another account.");
                    } else System.err.println("Account is not available, please try again.");
                    break;
                case 3:
                    System.out.print(
                            OutputHandles.stringWarning("Are you save user session for next login (Yes/No): "));
                    if(InputHandles.inputConfirmValue(scanner)){
                        System.out.println(OutputHandles.stringSuccess("Clear user session successfully."));
                        loginBusiness.clearUserSession();
                    }
                    break;
                case 4:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while(!isExit);
    }
    public void displayMainMenu(Account account, Scanner scanner){
        if(account.isAdmin()) adminPresentation.displayMenu(scanner);
        else userPresentation.displayMenu(scanner);
    }
}
