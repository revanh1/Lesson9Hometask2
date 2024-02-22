package Lesson9.Classwork.designPatters.abstractFactory.correctAbstractFactory;

public class FactoryMain {
    public static void main(String[] args) {

    Company msiCompany = new MsiManufacturer();
    msiCompany.orderGpu();
    msiCompany.orderMonitor();


    Company asusCompany = new AsusManufacturer();
    asusCompany.orderMonitor();
    asusCompany.orderGpu();

    }
}
