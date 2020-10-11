package ch06.interface_default_function;

public interface IHorse {
    void eat();

    default void run(){
        System.out.println("horse run");
    }
}
