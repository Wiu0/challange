package br.dev.wiu.challange.microsoft.linkedlist.solution;

import br.dev.wiu.challange.microsoft.linkedlist.def.ListNode;

/**
 * Hi, here's your problem today. This problem was recently asked by Microsoft:
 * 
 * You are given two linked-lists representing two non-negative integers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * 
 *  Add the two numbers and return it as a linked list.
 * 
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * @author wiu
 *
 */	
public class SumNumbers {

	
	public ListNode<Integer> resolve(ListNode<Integer> l1, ListNode<Integer> l2) throws Exception{
		ListNode<Integer> result = new ListNode<Integer>();
		//We could do a loop here and resolve differently
		String number = String.valueOf(getWholeNumber(l1) + getWholeNumber(l2)); 
		for(int i = 0; i < number.length(); i++) {
			result.addFirst(Integer.parseInt(number.substring(i, i+1)));
		}
		return result;
	}

	public int getWholeNumber(ListNode<Integer> list) throws Exception {
		StringBuilder s = new StringBuilder();
		if(list.getNode() == null) throw new Exception("ERROR"); //TODO refactor later
		ListNode<Integer> n = list;
		do {
			s.append(n.getNode());
		}while((n = n.getNextNode()) != null);
		
		return Integer.valueOf(s.toString());
	}
}
