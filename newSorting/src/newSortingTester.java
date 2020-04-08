import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class newSortingTester {

    @Test
    /*
    Case will test basic functionality of newSorting() method. A unsorted array of 8 elements will be created. Method
    should be able to arrange the elements of the array in increasing order. Size at which method will perform
    quickSort is 3 so the array is divided unevenly and we can test if dividing the array and later merging it is
    working as expected.
     */
    public void newSortingTest1() {
        int[] unsorted = {7, 98, 23, 11, 0, 15, 42};
        int[] sorted = {0, 7, 11, 15, 23, 42, 98};

        newSorting test = new newSorting();
        test.newSorting(unsorted, 3);

        assertArrayEquals(sorted, unsorted);
    }
    /*
    Result:
    Test passed. Array was sorted correctly.
     */

    @Test
    /*
    Case will test how method handles negative number. An unsorted array will be created with 10 randomly selected elements
    some of which will be negative numbers. Negative elements should be sorted at the start of array.
    Size at which method will perform quickSort is 4.
     */
    public void newSortingTest2() {
        int[] unsorted = {204, 5, 76, -34, 122, 83, -6, -84, 74, -1};
        int[] sorted = {-84, -34, -6, -1, 5, 74, 76, 83, 122, 204};

        newSorting test = new newSorting();
        test.newSorting(unsorted, 4);

        assertArrayEquals(sorted, unsorted);
    }
    /*
    Result:
    Test passed. Array was sorted correctly. Negative numbers were sorted at the beginning of array before positive numbers.
     */

    @Test
    /*
    Case will test how method deals with large arrays. An unsorted array of 30 elements will be created using randomly
    selected elements. Method should work the same as with previous test cases and should return a sorted array regardless
    of length but will be tested to see if big arrays break something in the code.
    Size at which method will perform quickSort is 7.
     */
    public void newSortingTest3() {
        int[] unsorted = {305, -3, 0, 85, 39, 90, 104, 278, 56, -11, -76, 8, 189, -96, 3, 41, -7, 504, 67, -1, 25, 208, -691, 82, 711, 84, 0, 1, 7, -3, 100};
        int[] sorted = {-691, -96, -76, -11, -7, -3, -3, -1, 0, 0, 1, 3, 7, 8, 25, 39, 41, 56, 67, 82, 84, 85, 90, 100, 104, 189, 208, 278, 305, 504, 711};

        newSorting test = new newSorting();
        test.newSorting(unsorted, 7);

        assertArrayEquals(sorted, unsorted);
    }
    /*
    Result:
    Test passed. Array was sorted correctly. Array with many elements was sorted without issues.
     */

    @Test
    /*
    Case will test how the method handles arrays that go straight to the quickSort() method without passing through
    the recursive newSorting() methods. An unsorted array of size 5 will be created with random elements in it.
    Size at which method will perform quickSort is 6 so code goes directly into the base case.
     */
    public void newSortingTest4() {
        int[] unsorted = {76, 104, 0, 2, 24};
        int[] sorted = {0, 2, 24, 76, 104};

        newSorting test = new newSorting();
        test.newSorting(unsorted, 6);

        assertArrayEquals(sorted, unsorted);
    }
    /*
    Result:
    Test passed. Array was sorted correctly.
     */

    @Test
    /*
    Case will test newSorting method with an already sorted array with duplicate elements in it. A sorted array of size 11
    will be created with some elements in it being duplicates. Method should iterate through the array but no elements should
    change position since it is already sorted. Duplicate elements should also remain in place.
    Size at which method will perform quickSort is 5.
     */
    public void newSortingTest5() {
        int[] unsorted = {-4, -4, 0, 23, 35, 59, 59, 63, 97, 150, 205};
        int[] sorted = {-4, -4, 0, 23, 35, 59, 59, 63, 97, 150, 205};

        newSorting test = new newSorting();
        test.newSorting(unsorted, 5);

        assertArrayEquals(sorted, unsorted);
    }
    /*
    Result:
    Test passed. Array was sorted correctly. Array remained sorted and duplicate elements remained on the same spot.    
     */
}
