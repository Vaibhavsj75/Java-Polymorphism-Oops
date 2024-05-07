abstract class AeroPlane3
{
   // abstract int age;

    abstract public void takeOff();

    abstract public void fly();

    public void landing()
    {
        System.out.println("AeroPlane is landing");
    }

}
class CargoPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("CargoPlane requiers longer runway");
    }
    public void fly()
    {
        System.out.println("CargoPlane flies at lower height");
    }
    public void carryGoods()
    {
        System.out.println("CargoPlane carries Goods");
    }
    public void alert()
    {
        System.out.println("Alert...");
    }

}
class PassengerPlane3 extends AeroPlane3
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires shorter runway");
    }
    public void fly()
    {
        System.out.println("PassengerPlane flies at medium height");
    }
    public void carryPassenger()
    {
        System.out.println("PassengerPlane carries passenger");
    }

}
public class Polymorphism2
{
    public static void main(String[] args) 
    {
        AeroPlane3 ref1=new CargoPlane3();
        ref1.takeOff();
        ref1.fly();
        ref1.landing();
        ((CargoPlane3) ref1).alert();


        AeroPlane3 ref3=new PassengerPlane3();
        ref3.takeOff();
        ref3.fly();
        ref3.landing();
        
        
    }
}