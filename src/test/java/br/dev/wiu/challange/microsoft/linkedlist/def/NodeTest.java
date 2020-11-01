package br.dev.wiu.challange.microsoft.linkedlist.def;

import org.junit.Assert;
import org.junit.Test;

public class NodeTest {

	
	@Test
	public void validationAddLast3Integer() {
		ListNode<Integer> list = new ListNode<Integer>();
		list.addLast(2);
		list.addLast(5);
		list.addLast(8);
		
		ListNode<Integer> n = list;
		Assert.assertEquals(2, n.getNode().intValue());
		n = n.getNextNode();
		Assert.assertEquals(5, n.getNode().intValue());
		n = n.getNextNode();
		Assert.assertEquals(8, n.getNode().intValue());
		n = n.getNextNode();
		Assert.assertEquals(null, n.getNode());	
	}
	
	
	@Test
	public void validationAddFirst3Integer() {
		ListNode<Integer> list = new ListNode<Integer>();
		list.addFirst(2);
		list.addFirst(5);
		list.addFirst(8);
		
		ListNode<Integer> n = list;
		
		Assert.assertEquals(8, n.getNode().intValue());
		n = n.getNextNode();
		Assert.assertEquals(5, n.getNode().intValue());
		n = n.getNextNode();
		Assert.assertEquals(2, n.getNode().intValue());
		n = n.getNextNode();
		Assert.assertEquals(null, n);	
	}
	
	@Test
	public void validationAddFirstNInteger() {
		
		int values[] = new int[(int)(Math.random() * 101)];
		ListNode<Integer> list = new ListNode<Integer>();
		
		for(int i = 0; i < values.length; i++) {
			values[i] = (int)(Math.random() * 1001);
			list.addFirst(values[i]);
		}
		
		ListNode<Integer> n = list;
		
		for(int i = values.length - 1; i > -1 ; i--) {
			Assert.assertEquals(values[i], n.getNode().intValue());
			n = n.getNextNode();
		}
		
		Assert.assertEquals(null, n);	
	}
	
}
