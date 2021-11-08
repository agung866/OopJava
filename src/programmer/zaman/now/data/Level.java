package programmer.zaman.now.data;

import programmer.zaman.now.anotation.Fancy;


public enum Level {
    @Fancy(name="AnimalApp",tags={"App","java"})

    STANDARD("standard level"),
    PREMIUM("premium level"),
    VIP("vip level");

    private String desc;
    Level(String desc){
        this.desc=desc;
    }

    public String getDesc(){
        return desc;
    }
}
