package programmer.zaman.now.app;

public class StackTraceApp {
    public static void main(String[] args) {
        try{
           sampleError();
        }catch (RuntimeException e){
            e.printStackTrace();
        }
    }
    public static void sampleError(){
        try{
            String[] name ={"eko","agung","sapi"};
            System.out.println(name[100]);
        }catch (Throwable e){
            throw new RuntimeException(e);
        }
    }
}
