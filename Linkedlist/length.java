// Given head of a singly linked list. The task is to find the length of the linked list, where length is defined as the number of nodes in the linked list.

// Examples :

// Input: head : 1->2->3->4->5

// Output: 5
// Explanation: Length of the linked list is 5, as there 
// are 5 nodes present in it.
/*
class Node{
    int data;
    Node next;
    Node(int a){  data = a; next = null; }
}*/

class Solution {
    public int getCount(Node head) {
        // code here
        int count=0;
        Node current=head;
        while(current!=null)
        {
            count++;
             current = current.next;
        }
         return count;
    }
}