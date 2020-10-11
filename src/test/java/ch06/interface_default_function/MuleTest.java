package ch06.interface_default_function;

import org.junit.Test;

import static org.junit.Assert.*;

public class MuleTest {
    @Test
    public void testMuleEat(){
        Mule m = new Mule();
        m.eat();
        m.run();
    }

}