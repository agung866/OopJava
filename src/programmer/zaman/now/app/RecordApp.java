package programmer.zaman.now.app;

import programmer.zaman.now.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {

        LoginRequest login = new LoginRequest("eko", "rahasia");
        System.out.println(login.username());
        System.out.println(login.password());
        System.out.println(login);
    }
}
