import org.junit.Assert;
import org.junit.Test;

public class CountLettersTest {

    /* 
     * "a" and 'a' returns 1
     * "aaaaabbbaa" and 'a' returns 7
     * "bbacbaaa" and 'c' returns 1
     * "bbcc" and 'a' returns 0
     * null and 'a' returns -1    * 
     */
	
	@Test
    public void testCase1() throws Exception {
        Assert.assertEquals(1, CountLetters.countLetters("a", 'a'));
    }

	@Test
    public void testCase2() throws Exception {
        Assert.assertEquals(7, CountLetters.countLetters("aaaaabbbaa", 'a'));
    }

	@Test
    public void testCase3() throws Exception {
        Assert.assertEquals(1, CountLetters.countLetters("bbacbaaa", 'c'));
    }

	@Test
    public void testCase4() throws Exception {
        Assert.assertEquals(0, CountLetters.countLetters("bbcc", 'a'));
    }
	
	@Test
    public void testCase5() throws Exception {
        Assert.assertEquals(-1, CountLetters.countLetters(null, 'a'));
    }
    
	@Test
    public void testCase6() throws Exception {
        Assert.assertEquals(0, CountLetters.countLetters("", 'a'));
    }

}
