package top.mowang.principle.interfacesegregation;

/**
 * Design-pattern
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021/10/20 16:01
 **/
public class Segregation {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend3(new B());
        a.depend2(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());
    }


}
interface Interface1{
    void method1();
}
interface Interface2{
    void method2();
    void method3();
}
interface Interface3{
    void method4();
    void method5();
}
class B implements Interface1,Interface2{

    @Override
    public void method1() {
        System.out.println("方法1");
    }

    @Override
    public void method2() {
        System.out.println("方法2");
    }

    @Override
    public void method3() {
        System.out.println("方法3");
    }
}
class D implements Interface1,Interface3{


    @Override
    public void method1() {
        System.out.println("方法1");
    }


    @Override
    public void method4() {
        System.out.println("方法4");
    }

    @Override
    public void method5() {
        System.out.println("方法5");
    }
}

class A{
    public void depend1(Interface1 interface1){
        interface1.method1();
    }
    public void depend2(Interface2 interface2){
        interface2.method2();
    }
    public void depend3(Interface2 interface2){
        interface2.method3();
    }
}
class C{
    public void depend1(Interface1 interface1){
        interface1.method1();
    }
    public void depend4(Interface3 interface3){
        interface3.method4();
    }
    public void depend5(Interface3 interface3){
        interface3.method5();
    }
}
