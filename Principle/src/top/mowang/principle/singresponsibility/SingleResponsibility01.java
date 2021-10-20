package top.mowang.principle.singresponsibility;

/**
 * Design-pattern
 *  单一职责原则
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/20 14:52
 **/
public class SingleResponsibility01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("自行车");
        vehicle.run("跑车");
        vehicle.run("飞机");
    }
}

//交通工具类
//违反了单一职责原则
//解决方案：根据不同的交通工具分为不同的类
@SuppressWarnings("all")
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"上路了");
    }
}
