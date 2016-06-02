


import static org.junit.Assert.*;

import org.junit.Test;

public class TestmRNATranscript {
	dnaStrandInput d;
	@Test
	public void test01() {
		assertEquals("3ATCG", d.mRNATranscript("3AUCG"));
	}
	@Test
	public void test02() {
		assertEquals("3TGCTGGA", d.mRNATranscript("3UGCUCCA"));
	}


}
