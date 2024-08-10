//public class isPalin {
//    class Solution {
//        public boolean isPalindrome(ListNode head) {
//            ListNode middle = middleNode(head);
//            ListNode headSecond = reverseList(middle);
//            ListNode reverseHead = headSecond;
//
//            while(head!= null && headSecond != null) {
//                if(head.val != headSecond.val) {
//                    break;
//                }
//                head = head.next;
//                headSecond = headSecond.next;
//
//            }
//            // reverseList(reverseHead);
//
//            if(head == null || headSecond == null) {
//                return true;
//            }
//            return false;
//
//        }
//
//        public ListNode reverseList(ListNode head) {
//            if(head == null) {
//                return head;
//
//            }
//            ListNode prev = null;
//            ListNode present = head;
//            ListNode next = present.next;
//
//            while(present!=null) {
//                present.next= prev;
//                prev = present;
//                present = next;
//
//                if(next!=null) {
//                    next = next.next;
//                }
//            }
//            return prev;
//        }
//
//        public ListNode middleNode(ListNode head) {
//            ListNode  s= head;
//            ListNode f = head;
//            while(f != null && f.next != null) {
//                s = s.next;
//                f = f.next.next;
//            }
//            return s;
//        }
//    }
//}
