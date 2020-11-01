package br.dev.wiu.challange.microsoft.linkedlist.solution;

import org.junit.Assert;
import org.junit.Test;

import br.dev.wiu.challange.microsoft.linkedlist.def.ListNode;

public class SumNumbersTest {

	
	@Test
	public void sumTwoNumbers342And465EqualsTo807ResultInvertedExpected708() throws Exception {
		 
			SumNumbers sn = new SumNumbers();
			ListNode<Integer> ln1 = new ListNode<Integer>();
			ListNode<Integer> ln2 = new ListNode<Integer>();
			ListNode<Integer> ret = new ListNode<Integer>();
			

			ln1.addFirst(2).addFirst(4).addFirst(3);
			ln2.addFirst(5).addFirst(6).addFirst(4);
			
			ret = sn.resolve(ln1, ln2);
						
			Assert.assertEquals(342, sn.getWholeNumber(ln1));
			Assert.assertEquals(465, sn.getWholeNumber(ln2));
			Assert.assertEquals(708, sn.getWholeNumber(ret));
	}
	
}
