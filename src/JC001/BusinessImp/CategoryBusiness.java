package JC001.BusinessImp;

import JC001.EntityImp.Book;
import JC001.EntityImp.Category;
import JC001.PresentationImp.UpdateCategoryMenuImp;
import JC001.Utilities.DataFilePaths;
import JC001.Utilities.InputHandles;
import JC001.Utilities.OutputHandles;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class CategoryBusiness extends DataManagerImp<Category>{
    public void addNewCategories(Scanner scanner) {
        System.out.print("Please enter n value to add new categories: ");
        int n = InputHandles.inputInteger(scanner);
        for (int i = 0; i < n; i++) {
            System.out.printf("Please enter category %d data\n", i + 1);
            Category category = new Category(dataList);
            category.input(scanner);
            addData(category);
        }
    }
    public void displayAllCategories(){
        dataList.sort(new Comparator<Category>() {
            @Override
            public int compare(Category category1, Category category2) {
                return category1.getCategoryName().compareToIgnoreCase(category2.getCategoryName());
            }
        });
        displayAllData();
    }
    public void statisticsByEachCategory(BookBusiness bookBusiness){
        Category.printTableHeaderWithBoundaryAndIdStatistics();
        dataList.forEach(element -> element.statisticsNumberOfBooksByCategory(bookBusiness));
        Category.printTableFooterWithBoundary();

    }
    public void updateCategoryById(CategoryBusiness categoryBusiness, Scanner scanner){
        // Hiển thị list categories để chọn id và update data.
        System.out.println("List categories in system: ");
        displayAllCategories();
        // Nhập category id để update data.
        System.out.print("Please enter category id to update data: ");
        int categoryUpdateId = InputHandles.inputInteger(scanner);
        // Kiểm tra xem category ấy có tồn tai không.
        if (isExistCategoryId(categoryUpdateId)){
            UpdateCategoryMenuImp updateCategoryMenu = new UpdateCategoryMenuImp();
            updateCategoryMenu.displayMenu(categoryBusiness, categoryUpdateId, scanner);
        }else System.err.print("Your update category id is not exist!");
    }
    public void updateCategoryNameById(int categoryId, Scanner scanner){
        Category category = new Category(dataList);
        String newName = category.inputCategoryName(scanner);
        dataList.forEach(element -> {
            if(element.getCategoryId() == categoryId){
                element.setCategoryName(newName);
                System.out.println(OutputHandles.stringSuccess("Category name updated successfully"));
            }
        });
    }
    public void changeCategoryStatusById(int categoryId){
        dataList.forEach(element -> {
            if(element.getCategoryId() == categoryId){
                element.setCategoryStatus(!element.isCategoryStatus());
                System.out.println(OutputHandles.stringSuccess("Category status updated successfully"));
            }
        });
    }
    public void deleteCategoryById(Scanner scanner){
        // Hiển thị list categories để chọn id và xoá.
        System.out.println("List categories in system: ");
        displayAllCategories();
        // Nhập category id để xoá.
        System.out.print("Please enter category id to delete: ");
        int categoryDeleteId = InputHandles.inputInteger(scanner);
        // Kiểm tra xem category ấy có tồn tại không.
        if (isExistCategoryId(categoryDeleteId)){
            System.out.print(OutputHandles.stringWarning("Are you sure want to delete (Yes/No): "));
            if(InputHandles.inputConfirmValue(scanner)){
                BookBusiness bookBusiness = new BookBusiness();
                bookBusiness.readDataFromFile(DataFilePaths.booksDataFile);
                List<Book> bookList = bookBusiness.getDataList();
                boolean canDel = true;
                for(Book book : bookList){
                    if(book.getCategoryId() == categoryDeleteId){
                        canDel = false;
                        break;
                    }
                }
                if(canDel){
                    dataList.removeIf(category -> category.getCategoryId() == categoryDeleteId);
                    System.out.println(OutputHandles.stringSuccess("Delete category successfully!"));
                }else{
                    System.err.println("Category has books, can not delete category.");
                }
            }
        }else System.err.println("Can not delete element cause category id is not exist!");
    }
    public boolean isExistCategoryId(int categoryId){
        for (Category category : dataList) {
            if (category.getCategoryId() == categoryId)
                return true;
        }
        return false;
    }
    public void displayAllData(){
        Category.printTableHeaderWithBoundaryAndId();
        for(Category category : dataList){
            category.printTableRowWithBoundaryAndId();
        }
        Category.printTableFooterWithBoundary();
    }
}