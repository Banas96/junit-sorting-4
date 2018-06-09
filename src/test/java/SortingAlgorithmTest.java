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
    public void testSortowania1000Rosnaco() throws Exception{
        double[] randomArray = new double [1000];
        boolean asc = true;
        for(int i = 0; i < randomArray.length; i++) {
            randomArray[i] = Math.random();
        algorytm.sort(randomArray,asc);
        for (int temp=0; temp<randomArray.length-1; temp++){
            Assert.assertTrue(randomArray[temp]<=randomArray[temp+1]);
        }


        }


    }
}

