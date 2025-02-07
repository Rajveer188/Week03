import com.tit.week03.day04.challenge_problems.FindMissingNumber;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class FindMissingNumberTest {
    //Attributes
    static FindMissingNumber findMissingNumber;
    int[] array = {1,2,3,4,5,6,7,9};

    @BeforeAll
    static void setUp(){
        findMissingNumber = new FindMissingNumber();
    }
    //test for find first positive missing number
    @Test
    void findMissingTest(){
        int expectedResult = 8;
        int actualResult = findMissingNumber.firstMissingNumber(array);
        assertEquals(expectedResult, actualResult);
    }
    //Test for find target number index
    @Test
    void findTargetTest(){
        //define target
        int target = 4;

        int expectedIndex = 3;
        int actualIndex = findMissingNumber.findTarget(array, target);
        assertEquals(expectedIndex, actualIndex);
    }
}
