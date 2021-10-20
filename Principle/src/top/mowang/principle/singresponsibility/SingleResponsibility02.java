package top.mowang.principle.singresponsibility;

/**
 * Design-pattern
 *  单一职责原则
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/20 14:52
 **/
public class SingleResponsibility02 {
    public static void main(String[] args) {
       new RoadVehicle().run("汽车");
       new SkyVehicle().run("飞机");
       new WaterVehicle().run("游轮");
    }
}
//遵守单一职责
//但是改动大同时修改客户端

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"上路了");
    }
}

class SkyVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"上天了");
    }
}

class WaterVehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"下水了");
    }
}


