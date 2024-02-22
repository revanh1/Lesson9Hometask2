package Lesson9.Classwork.designPatters.abstractFactory.correctAbstractFactory;

public class MsiGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Msi gpu is assembled");
    }
}
