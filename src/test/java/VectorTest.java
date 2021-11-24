import org.junit.jupiter.api.*;

public class VectorTest {
    private final Vector vector = new Vector();

    @Test
    public void firstElementGreaterTest(){
        int[] array = new int[]{8,2,5,3,4,-5};

        int result = vector.greater(array);
        Assertions.assertEquals(8,result);

    }

    @Test
    public void middleElementGreaterTest(){
        int[] array = new int[]{1,2,5,3,4,-5};

        int result = vector.greater(array);
        Assertions.assertEquals(5,result);

    }

    @Test
    public void lastElementGreaterTest(){
        int[] array = new int[]{1,2,20,3,4,15};

        int result = vector.greater(array);
        Assertions.assertEquals(15,result);

    }

    @Test
    public void firstElementMinorTest(){
        int[] array = new int[]{-10,2,5,3,4,-5};

        int result = vector.minor(array);
        Assertions.assertEquals(-10,result);

    }

    @Test
    public void middleElementMinorTest(){
        int[] array = new int[]{1,2,-6,3,4,-5};

        int result = vector.minor(array);
        Assertions.assertEquals(-6,result);

    }

    @Test
    public void lastElementMinorTest(){
        int[] array = new int[]{1,2,5,3,4,-5};

        int result = vector.minor(array);
        Assertions.assertEquals(-5,result);

    }

    @Test
    public void sumatoryWithNegativeNumberTest(){
        int[] array = new int[]{1,2,5,3,4,-5};

        int result = vector.sumatory(array);
        Assertions.assertEquals(10,result);

    }

    @Test
    public void sumatoryWithoutNegativeNumberTest(){
        int[] array = new int[]{1,2,5,3,4,5};

        int result = vector.sumatory(array);
        Assertions.assertEquals(20,result);

    }

    @Test
    public void firstElementIsEvenWithEvenFirstElementTest(){
        int[] array = new int[]{8,2,5,3,4,5};

        boolean result = vector.isFirstElementEven(array);
        Assertions.assertTrue(result);

    }

    @Test
    public void firstElementIsEvenWithNotEvenFirstElementTest(){
        int[] array = new int[]{1,2,5,3,4,5};

        boolean result = vector.isFirstElementEven(array);
        Assertions.assertFalse(result);

    }
}
