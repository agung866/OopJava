package programmer.zaman.now.util;

import programmer.zaman.now.anotation.NotBlank;
import programmer.zaman.now.eror.BlankException;
import programmer.zaman.now.eror.ValidationException;
import programmer.zaman.now.data.LoginRequest;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException{
        if(loginRequest.username()==null){
            throw new NullPointerException("username is null");
        }else if(loginRequest.username().isBlank()) {
            throw new ValidationException("username is blank");
        }else if(loginRequest.password()==null) {
            throw new NullPointerException("password is null");
        }else if(loginRequest.password().isBlank()) {
            throw new ValidationException("password is Blank");
        }
    }
    public static void validateRuntime(LoginRequest loginRequest){
        if(loginRequest.username()==null){
            throw new NullPointerException("username is null");
        }else if(loginRequest.username().isBlank()) {
            throw new BlankException("username is blank");
        }else if(loginRequest.password()==null) {
            throw new NullPointerException("password is null");
        }else if(loginRequest.password().isBlank()) {
            throw new BlankException("password is Blank");
        }
    }
    public static void validationReflection(Object object){
   Class aClass = object.getClass();
        Field[] fields =aClass.getDeclaredFields();

        for (var field :fields){
            field.setAccessible(true);

            if(field.getAnnotation(NotBlank.class)!=null){
                try{
                    String value =(String) field.get(object);

                    if(value==null|| value.isBlank()){
                        throw new BlankException("field "+field.getName());
                    }
                }catch(IllegalAccessException exception){
                    System.out.println("tdk bisa akses field "+field.getName());
                }
            }
        }
    }




}
