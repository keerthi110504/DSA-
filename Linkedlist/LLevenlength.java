// Input: Linked list: 12->52->10->47->95->0

// Output: true
// Explanation: The length of the linked list is 6 which is even, hence returned true.
// Input: Linked list: 9->4->3

// Output: false
// Explanation: The length of the linked list is 3 which is odd, hence returned false.



class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        int count = 0;
        Node temp = head;

        // Traverse the linked list
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        // Return true if count is even, otherwise false
        return (count % 2 == 0);
    }
}