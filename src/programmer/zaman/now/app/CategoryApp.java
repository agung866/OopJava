package programmer.zaman.now.app;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {

        var category =new Category();
        System.out.println(category.isExpensive());

        category.setId("Id");
        category.setId(null);
        System.out.println(category.getId());

    }
}
