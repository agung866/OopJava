package programmer.zaman.now.data;

import programmer.zaman.now.anotation.Fancy;


public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Jumlah Processor");
        PROCESSORS=Runtime.getRuntime().availableProcessors();
    }
}
