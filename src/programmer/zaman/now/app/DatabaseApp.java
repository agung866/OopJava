package programmer.zaman.now.app;

import programmer.zaman.now.eror.DatabaseEror;

public class DatabaseApp {
    public static void main(String[] args) {
        connectDatabase("eko", "rahasia");
        System.out.println("sukses");
    }
    public static void connectDatabase(String username, String password){
        if(username==null|password==null){
            throw  new DatabaseEror("tdk konek database");
        }
    }
}
