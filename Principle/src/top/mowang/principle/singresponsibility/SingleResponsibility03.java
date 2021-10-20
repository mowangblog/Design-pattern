package top.mowang.principle.singresponsibility;

/**
 * Design-pattern
 *  单一职责原则
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/20 14:52
 **/
public class SingleResponsibility03 {
    public static void main(String[] args) {
        Vehicle2 vehicle = new Vehicle2();
        vehicle.run("自行车");
        vehicle.run("跑车");
        vehicle.runSky("飞机");
        vehicle.runWater("轮船");
    }
}

//这格方法没有对原来的类的做大的修改，只是增加方法
//虽然没有在类上遵守，但是在方法级别上遵守了单一职责

//交通工具类
@SuppressWarnings("all")
class Vehicle2{
    public void run(String vehicle){
        System.out.println(vehicle+"上路了");
    }
    public void runSky(String vehicle){
        System.out.println(vehicle+"上天了");
    }
    public void runWater(String vehicle){
        System.out.println(vehicle+"下水了");
    }
}
