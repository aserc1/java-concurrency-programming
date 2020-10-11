package ch06.interface_default_function;

public interface IDonkey {
    void eat();
    default void run(){
        System.out.println("Donkey run");
    }
}
