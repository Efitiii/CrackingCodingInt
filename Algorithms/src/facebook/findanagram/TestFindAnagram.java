package facebook.findanagram;

import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestFindAnagram extends TestCase{
	
	@Test
	public void testAnagram(){
		
		String[] input= new String[] {"eat", "tea", "tan", "ate", "nat", "bat"};
		FindAnagram findAnagram= new FindAnagram();
		findAnagram.findAnagramPairs(input);
	}

}
