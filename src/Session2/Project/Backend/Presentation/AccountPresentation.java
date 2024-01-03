package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Business.AccountBusiness;
import Session2.Project.Backend.Entity.Account;
import Session2.Project.Backend.Entity.Product;
import Session2.Project.Backend.Utilities.CommonHandles;
import Session2.Project.Backend.Utilities.InputHandles;
import Session2.Project.Backend.Utilities.OutputHandles;

import java.util.List;
import java.util.Scanner;

public class AccountPresentation implements IManagement {
    private AccountBusiness accountBusiness;
    AccountPresentation(){
        accountBusiness = new AccountBusiness();
    }
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("""
                    |===============ACCOUNT MANAGEMENT===============|
                    1. Display all accounts data.
                    2. Create new accounts.
                    3. Change account status.
                    4. Search for accounts.
                    5. Back.
                    """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice){
                case 1:
                    displayAccounts(scanner);
                    break;
                case 2:
                    addNewAccount(scanner);
                    break;
                case 3: break;
                case 4:
                    searchAccountByUName(scanner);
                    break;
                case 5:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while(!isExit);
    }
    public void displayAccounts(Scanner scanner) {
        int pageNumber = 1;
        List<Account> accountList = accountBusiness.getAll(pageNumber);
        if(!accountList.isEmpty()){
            boolean isExit = false;
            do {
                if (pageNumber <= 0) {
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber = 1;
                } else if(accountList.isEmpty()){
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber--;
                } else accountList.forEach(System.out::println);
                System.out.print("""
                   1. Previous account page.
                   2. Next account page.
                   3. Exit account list view.
                    """);
                int choice = CommonHandles.inputChoice(scanner);
                switch (choice){
                    case 1:
                        pageNumber--;
                        break;
                    case 2:
                        pageNumber++;
                        break;
                    case 3:
                        isExit = true;
                        break;
                    default:
                        System.err.println("Your choice is not valid value, please try again.");
                }
                accountList = accountBusiness.getAll(pageNumber);
            } while (!isExit);
        }else System.err.println("There is no data to display");
    }
    public void addNewAccount(Scanner scanner) {
        Account account = new Account();
        account.inputData(scanner);
        boolean resultCreate = accountBusiness.create(account);
        if (resultCreate) {
            System.out.println(OutputHandles.stringSuccess("Create account successfully."));
        } else {
            System.err.println(OutputHandles.stringError("Create account failure."));
        }
    }
    public void searchAccountByUName(Scanner scanner){
        System.out.println("Please enter user name to search for: ");
        String findName = InputHandles.inputNormalizeString(scanner);
        int pageNumber = 1;
        List<Account> accountList = accountBusiness.search(findName, pageNumber);
        if(!accountList.isEmpty()){
            boolean isExit = false;
            do {
                if (pageNumber <= 0) {
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber = 1;
                } else if(accountList.isEmpty()){
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber--;
                } else accountList.forEach(System.out::println);
                System.out.print("""
                   1. Previous account page.
                   2. Next account page.
                   3. Exit account list view.
                    """);
                int choice = CommonHandles.inputChoice(scanner);
                switch (choice){
                    case 1:
                        pageNumber--;
                        break;
                    case 2:
                        pageNumber++;
                        break;
                    case 3:
                        isExit = true;
                        break;
                    default:
                        System.err.println("Your choice is not valid value, please try again.");
                }
                accountList = accountBusiness.getAll(pageNumber);
            } while (!isExit);
        }else System.err.println("There is no data to display");
    }
}
