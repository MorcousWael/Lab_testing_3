import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeMachineProblemTest {

    public static CoffeeMachine_problem coffeeMachine;
    public static CoffeeOrder coffeeOrder;





    @Nested
    class BottomUp{
        @BeforeAll
        public static void init(){
            coffeeMachine = new CoffeeMachine_problem();
            coffeeOrder = new CoffeeOrder();
        }

        @Test
        public void testCr(){
            assertFalse(coffeeOrder.useBeans());
            assertFalse(coffeeOrder.useWater());
            assertFalse(coffeeOrder.useMilk());
            assertFalse(coffeeOrder.useChoco());
            coffeeOrder.refillBeans(1);
            coffeeOrder.refillWater(1);
            coffeeOrder.refillMilk(1);
            coffeeOrder.refillChoco(1);
            assertTrue(coffeeOrder.useBeans());
            assertTrue(coffeeOrder.useWater());
            assertTrue(coffeeOrder.useMilk());
            assertTrue(coffeeOrder.useChoco());
        }


        @Test
        public void testCm1(){
            assertFalse(coffeeMachine.input('c'));
        }

        @Test
        public void testCm2(){
            assertFalse(coffeeMachine.input('l'));
        }

        @Test
        public void testCm3(){
            assertFalse(coffeeMachine.input('m'));
        }

        @Test
        public void testCm4(){
            assertTrue(coffeeMachine.input('r'));
        }

        @Test
        public void testCm5(){
            assertTrue(coffeeMachine.input('c'));
        }

        @Test
        public void testCm6(){
            assertTrue(coffeeMachine.input('m'));
        }

        @Test
        public void testCm7(){
            assertTrue(coffeeMachine.input('w'));
        }

        @Test
        public void testCm8(){
            assertTrue(coffeeMachine.input('b'));
        }

        @Test
        public void testCm9(){
            assertTrue(coffeeMachine.input('v'));
        }

        @Test
        public void testCm10(){
            assertTrue(coffeeMachine.input('c'));
        }

    }

}