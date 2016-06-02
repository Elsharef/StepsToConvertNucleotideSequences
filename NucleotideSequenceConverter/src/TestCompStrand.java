

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCompStrand {
	dnaStrandInput d;

	@Test
	public void test01() {
		assertEquals("3ATCG", d.compStrand("5TAGC"));
	}
	@Test
	public void test02() {
		assertEquals("3TGCTGGA", d.compStrand("5ACGACCT"));
	}

}
