# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def addTwoNumbers(self, l1, l2):
        temp = ListNode(-1)
        curr = temp
        carry = 0
        t1 = l1
        t2 = l2

        while t1 or t2:
            Sum = carry

            if t1:
                Sum += t1.val
            if t2:
                Sum += t2.val
            
            new_node = ListNode(Sum % 10)
            curr.next = new_node
            curr = curr.next
            carry = Sum // 10

            if t1:
                t1 = t1.next
            if t2:
                t2 = t2.next
        
        if carry:
            curr.next = ListNode(carry)
            curr = curr.next
        
        return temp.next