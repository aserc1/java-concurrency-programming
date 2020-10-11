package ch06.interface_default_function;

public class Mule implements IHorse,IDonkey {
    @Override
    public void eat() {
        System.out.println("Mule eat");
    }

    @Override
    public void run() {
        IHorse.super.run();
    }
}
