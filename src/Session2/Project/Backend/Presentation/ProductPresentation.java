package Session2.Project.Backend.Presentation;

import Session2.Project.Backend.Business.ProductBusiness;
import Session2.Project.Backend.Entity.Product;
import Session2.Project.Backend.Utilities.CommonHandles;
import Session2.Project.Backend.Utilities.InputHandles;
import Session2.Project.Backend.Utilities.OutputHandles;

import java.util.List;
import java.util.Scanner;

public class ProductPresentation implements IManagement {
    private ProductBusiness productBusiness;
    ProductPresentation(){
        productBusiness = new ProductBusiness();
    }
    @Override
    public void displayMenu(Scanner scanner) {
        boolean isExit = false;
        int choice;
        do {
            System.out.print("""
                    |===============PRODUCT MANAGEMENT===============|
                    1. Display all products data.
                    2. Add new products.
                    3. Update product data.
                    4. Search for products.
                    5. Change product status.
                    6. Back.
                    """);
            choice = CommonHandles.inputChoice(scanner);
            switch (choice){
                case 1:
                    displayProducts(scanner);
                    break;
                case 2:
                    addNewProduct(scanner);
                    break;
                case 3:
                    updateProduct(scanner);
                    break;
                case 4:
                    searchProductByName(scanner);
                    break;
                case 5:
                    updateProductStatus(scanner);
                    break;
                case 6:
                    isExit = true;
                    break;
                default:
                    System.err.println("Your choice is not valid value, please try again.");
            }
        }while (!isExit);
    }
    public void displayProducts(Scanner scanner) {
        int pageNumber = 1;
        List<Product> productList = productBusiness.getAll(pageNumber);
        if(!productList.isEmpty()){
            boolean isExit = false;
            do {
                if (pageNumber <= 0) {
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber = 1;
                } else if(productList.isEmpty()){
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber--;
                } else productList.forEach(System.out::println);
                System.out.print("""
                   1. Previous product page.
                   2. Next product page.
                   3. Exit product list view.
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
                productList = productBusiness.getAll(pageNumber);
            } while (!isExit);
        }else System.err.println("There is no data to display");

    }
    public void addNewProduct(Scanner scanner) {
        Product product = new Product();
        product.inputData(scanner);
        boolean resultCreate = productBusiness.create(product);
        if (resultCreate) {
            System.out.println(OutputHandles.stringSuccess("Create product successfully."));
        } else {
            System.err.println(OutputHandles.stringError("Create product failure."));
        }
    }
    public void updateProduct(Scanner scanner) {
        System.out.print("Please enter product id to update data: ");
        String updateId = InputHandles.inputNormalizeString(scanner);
        if (updateId.length() != 5) {
            System.err.println("Product id length must be 5 characters.");
        }else{
            Product product = productBusiness.findById(updateId);
            if (product != null) {
                product.updateData(scanner);
                boolean result = productBusiness.update(product);
                if (result) {
                    System.out.println(OutputHandles.stringSuccess("Update product successfully."));
                } else {
                    System.err.println(OutputHandles.stringError("Update product failure."));
                }
            } else {
                System.err.println("Product is not exists.");
            }
        }
    }
    public void updateProductStatus(Scanner scanner) {
        System.out.print("Please enter product id to update status: ");
        String updateId = InputHandles.inputNormalizeString(scanner);
        if (updateId.length() != 5) {
            System.err.println("Product id length must be 5 characters.");
        }else{
            Product product = productBusiness.findById(updateId);
            if (product != null) {
                product.updateStatus(scanner);
                boolean result = productBusiness.update(product);
                if (result) {
                    System.out.println(OutputHandles.stringSuccess("Update product successfully."));
                } else {
                    System.err.println(OutputHandles.stringError("Update product failure."));
                }
            } else {
                System.err.println("Product is not exists.");
            }
        }
    }
    public void searchProductByName(Scanner scanner) {
        System.out.println("Please enter product name to search for: ");
        String findName = InputHandles.inputNormalizeString(scanner);
        int pageNumber = 1;
        List<Product> productList = productBusiness.search(findName, pageNumber);
        if(!productList.isEmpty()){
            boolean isExit = false;
            do {
                if (pageNumber <= 0) {
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber = 1;
                } else if(productList.isEmpty()){
                    System.out.println(OutputHandles.stringWarning("Can't move previous page anymore."));
                    pageNumber--;
                } else productList.forEach(System.out::println);
                System.out.print("""
                   1. Previous product page.
                   2. Next product page.
                   3. Exit product list view.
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
                productList = productBusiness.search(findName, pageNumber);
            } while (!isExit);
        }else System.err.println("There is no data to display");
    }
}
