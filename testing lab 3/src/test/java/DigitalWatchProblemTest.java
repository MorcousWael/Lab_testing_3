import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitalWatchProblemTest {

    public static DigitalWatch_problem digital_Watch;
    public static AlarmModule alarm_Module;

    // Make sure class DigitalWatch extends AlarmModStub
    @Nested
    class TopDown{
        @BeforeAll
        public static void init(){
            digital_Watch = new DigitalWatch_problem();
            alarm_Module = new AlarmModule();
        }

        @Test
        public void testdigital_Watch1(){
            assertTrue(digital_Watch.input('t'));
        }

        @Test
        public void testdigital_Watch2(){
            assertTrue(digital_Watch.input('a'));
        }

        @Test
        public void testdigital_Watch3(){
            assertTrue(digital_Watch.input('u'));
        }

        @Test
        public void testdigital_Watch4(){
            assertTrue(digital_Watch.input('s'));
        }

        @Test
        public void testdigital_Watch5(){
            assertTrue(digital_Watch.input('c'));
        }

        @Test
        public void testdigital_Watch6(){
            assertTrue(digital_Watch.input('t'));
        }

        @Test
        public void testdigital_Watch7(){
            assertTrue(digital_Watch.input('s'));
        }

        @Test
        public void testdigital_Watch8(){
            assertTrue(digital_Watch.input('s'));
        }

        @Test
        public void testdigital_Watch9(){
            assertTrue(digital_Watch.input('m'));
        }

        @Test
        public void testdigital_Watch10(){
            assertTrue(digital_Watch.input('D'));
        }

        @Test
        public void testdigital_Watch11(){
            assertTrue(digital_Watch.input('M'));
        }

        @Test
        public void testdigital_Watch12(){
            assertTrue(digital_Watch.input('Y'));
        }

        @Test
        public void testdigital_Watch13(){
            assertTrue(digital_Watch.input('t'));
        }

        @Test
        public void testam(){
            assertFalse(alarm_Module.checkA());
            assertFalse(alarm_Module.unsetA());
            assertTrue(alarm_Module.setA());
            assertTrue(alarm_Module.checkA());
            assertTrue(alarm_Module.setA());
            assertFalse(alarm_Module.setA());
            assertTrue(alarm_Module.unsetA());
        }

    }


    // Make sure class DigitalWatch extends AlarmMod
    @Nested
    class BottomUp {
        @BeforeAll
        public static void init() {
            digital_Watch = new DigitalWatch_problem();
            alarm_Module = new AlarmModule();
        }

        @Test
        public void testalarm_Module() {
            assertFalse(alarm_Module.checkA());
            assertFalse(alarm_Module.unsetA());
            assertTrue(alarm_Module.setA());
            assertTrue(alarm_Module.checkA());
            assertTrue(alarm_Module.setA());
            assertFalse(alarm_Module.setA());
            assertTrue(alarm_Module.unsetA());
        }


        @Test
        public void testdigital_Watch1(){
            assertTrue(digital_Watch.input('t'));
        }

        @Test
        public void testdw2(){
            assertTrue(digital_Watch.input('a'));
        }

        @Test
        public void testdw3(){
            assertTrue(digital_Watch.input('s'));
        }

        @Test
        public void testdw4(){
            assertTrue(digital_Watch.input('c'));
        }

        @Test
        public void testdw5(){
            assertTrue(digital_Watch.input('s'));
        }

        @Test
        public void testdw6(){
            assertTrue(digital_Watch.input('u'));
        }

        @Test
        public void testdw7(){
            assertTrue(digital_Watch.input('t'));
        }

        @Test
        public void testdw8(){
            assertTrue(digital_Watch.input('s'));
        }

        @Test
        public void testdw9(){
            assertTrue(digital_Watch.input('s'));
        }

        @Test
        public void testdw10(){
            assertTrue(digital_Watch.input('m'));
        }

        @Test
        public void testdw11(){
            assertTrue(digital_Watch.input('D'));
        }

        @Test
        public void testdw12(){
            assertTrue(digital_Watch.input('M'));
        }

        @Test
        public void testdw13(){
            assertTrue(digital_Watch.input('Y'));
        }

        @Test
        public void testdw14(){
            assertTrue(digital_Watch.input('t'));
        }
    }

}
