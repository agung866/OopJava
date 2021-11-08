package programmer.zaman.now.app;

import programmer.zaman.now.eror.ValidationException;
import programmer.zaman.now.util.ValidationUtil;
import programmer.zaman.now.data.LoginRequest;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest=new LoginRequest("","");
        try{
            ValidationUtil.validate(loginRequest);
            System.out.println("DataValid");
        }catch(ValidationException | NullPointerException e){
            System.out.println("data tdk valid "+e.getMessage());
        }finally{
            System.out.println("selalu di eksekusi");
        }

        LoginRequest loginRequest2 =new LoginRequest(null,null);
        ValidationUtil.validateRuntime(loginRequest2);
    }

}
