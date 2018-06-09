import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortingAlgorithmTest {


    private SortingAlgorithms algorytm;

    @Before
    public void setUp() throws Exception {
        algorytm = new SortingAlgorithms();

    }


    @After
    public void tearDown() {
        System.out.println("Metoda zostanie wykonana po kazdym tescie");
    }


    @Test
    public void testSorting() throws Exception {

        double[] toSort = {3, 12, 2, 5, 14, 43.56};
        double[] posortowana = {2, 3, 5, 12, 14, 43.56};
        boolean asc = true;

        algorytm.sort(toSort, asc);

        for(int i = 0; i < toSort.length; i++) {

            Assert.assertEquals("Test nieudany", posortowana[i], toSort[i], 0.01);

        }













    }



}
