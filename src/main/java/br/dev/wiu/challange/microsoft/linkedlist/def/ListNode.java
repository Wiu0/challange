package br.dev.wiu.challange.microsoft.linkedlist.def;

public class ListNode <T> {

		private T node;
		private ListNode<T> next;
		
		public ListNode<T> addLast(T value) {
			if(node == null) {
				node = value;
				next = new ListNode<T>();
				return this;
			}
			
			ListNode<T> newNode = next;
			while(newNode.next != null) newNode = newNode.next;
			newNode.node = value;
			newNode.next = new ListNode<T>();
			
			return this;
		}
		
		public ListNode<T> addFirst(T value) {
			if(node == null) {
				node = value;
				return this;
			}
			
			ListNode<T> newNode = new ListNode<T>();
			newNode.node = node;
			newNode.next = next;
			
			node = value;
			next = newNode;
			return this;
		}
		
		public T getNode() {
			return node;
		}
		
		public ListNode<T> getNextNode(){
			return next;
		}
		
}
