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

        for (int i = 0; i < toSort.length; i++) {

            Assert.assertEquals("Test nieudany", posortowana[i], toSort[i], 0.01);

        }
    }
        @Test
        public void testSortowania() throws Exception{
            boolean asc = true;
            double[] toSort = {3,5,3,4,5,7};
            double[] posortowana = {3,3,4,5,5,7};

            int i = 0;
            algorytm.sort(toSort,asc);
            while(i< toSort.length){
                Assert.assertEquals("Błąd sortowania na pozycji " + i,posortowana[i],toSort[i],0.01);
                i++;
            }
            System.out.println("Test zaliczony");
        }

        @Test
        public void testSortowania2() throws Exception{
            boolean asc = false;
            double[] toSort = {3,5,3,4,5,7};
            double[] posortowana = {7,5,5,4,3,3};

            int i = 0;
            algorytm.sort(toSort,asc);
            while(i< toSort.length){
                Assert.assertEquals("Błąd sortowania na pozycji " + i,posortowana[i],toSort[i],0.01);
            }
            System.out.println("Test2 zaliczony");
    }
    //Radek1
    //Radek
    @Test
    public void testSortowania4() throws Exception {
        double[] toSort = {3,7,4,2,6};
        double[] posortowana = {2,3,4,6,7};

        algorytm.sort(toSort,true);

        for (int i = 0; i < toSort.length; i++) {


            Assert.assertEquals("Blad przy sortowaniu na pozycji: "+ i,
                    posortowana[i],toSort[i],0.01);

        }
}

