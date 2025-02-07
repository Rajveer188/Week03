import com.tit.week03.day04.binary_search.FindOccurrence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class FindOccurrenceTest {
    //Attribute
    static FindOccurrence findOccurrence;
    static int[] array;

    @BeforeAll
    static void setUp(){
        findOccurrence = new FindOccurrence();
        array = new int[]{1, 2, 3, 4, 5, 5, 5, 5, 6, 7, 8, 9};
    }

    @Test
    void firstLastOccurrenceTest(){
        int target = 5;
        int[] expectedIndex = {4,7};
        int[] actualIndex = findOccurrence.findFirstLastOccurrence(array, target);

        assertArrayEquals(expectedIndex, actualIndex);
    }
}
