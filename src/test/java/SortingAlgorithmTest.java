import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

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
        public void testSortowaniaRosnacy() throws Exception{
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
        public void testSortowaniaMalejacy() throws Exception{
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

    @Test
    public void testSortowaniaTysiac() throws Exception {

        boolean asc = true;
        Random generator = new Random();
        double[] toSort = new double[1000];

        //LOSOWANIE KAZDEGO ELEMENTU TABLICY
        for(int i = 0; i < toSort.length; i++) {
            toSort[i] = (Math.random() * 100) + 1;
        }
        //WYWOLANIE FUNKCJI
        algorytm.sort(toSort, asc);

        for(int i = 0; i< toSort.length - 1; i++) {
                Assert.assertTrue(toSort[i] < toSort[i+1]);
        }
    }
    @Test(timeout = 100)
    public void testNaStoMiliSekund () throws Exception {

        boolean asc = true;
        Random generator = new Random();
        double[] toSort = new double[10000];

        //LOSOWANIE KAZDEGO ELEMENTU TABLICY
        for(int i = 0; i < toSort.length; i++) {
            toSort[i] = (Math.random() * 100) + 1;
        }
        //WYWOLANIE FUNKCJI
        algorytm.sort(toSort, asc);
        long start = System.currentTimeMillis();

        for(int i = 0; i < toSort.length - 1; i++) {
            Assert.assertTrue("Test zakonczony na ideksie: " + i,toSort[i] < toSort[i+1]);
        }



    }

}

