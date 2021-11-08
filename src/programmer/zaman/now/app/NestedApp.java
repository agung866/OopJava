package programmer.zaman.now.app;

import programmer.zaman.now.data.Company;

public class NestedApp {
    public static void main(String[] args) {

        Company company = new Company();
        company.setName("Programmer");

        Company.Employee employee =company.new Employee();
        company.setName("Eko");
    }
}
