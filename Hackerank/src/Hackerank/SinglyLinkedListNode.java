package Hackerank;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class SinglyLinkedListNode {
	     int data;
	     SinglyLinkedListNode next;
	// Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode t1 = head1, t2 = head2; 
        SinglyLinkedListNode head = null, tail = null; 
        if(head1 == null){
            head = head2;
            return head;
        }
        else if(head2== null){
            head = head1;
            return head;
        } 
        if(t1.data<=t2.data) {
           head = t1; 
           tail = t1; 
           t1= t1.next;
        } else {
           head = t2; 
           tail = t2; 
           t2 =  t2.next;
        } 
        while(t1!=null && t2!=null) { 
            if(t1.data<=t2.data) {
               tail.next = t1;  
               tail = t1;
               t1 = t1.next; 
            } else {
               tail.next = t2;  
               tail = t2;
               t2 = t2.next;
            }
        } 
        if(t1!=null) {
           tail.next = t1; 
        } else {
           tail.next = t2; 
       } 
       return head; 
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int rear = -1;
        int front = 0;
        int num = 0;
        for(int i=0; i<n; i++){
            int operation = in.nextInt();
            if(operation ==1){
                num = in.nextInt();
                arr[++rear] = num;
            } else if (operation == 2){
                num = arr[front++];
            } else  {
                System.out.println(arr[front]);
            }
        }  
    }
    
    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
    // Write your code here
    String result = "";
    char open1 = '(';
    char close1 = ')';
    char open2 = '[';
    char close2 = ']';
    char open3 = '{';
    char close3 = '}';

    List<Character> openList = Arrays.asList(open1, open2, open3);
    Map<Character, Character> pairMap = new HashMap<>();
    {
        pairMap.put(open1, close1);
        pairMap.put(open2, close2);
        pairMap.put(open3, close3);
    }
     Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (openList.contains(c)) {
                deque.push(c);
            } else {
                if (deque.isEmpty()) {
                    result = "NO";
                    return result;
                }
                char pop = deque.pop();
                if (pairMap.get(pop) != c) {
                    result = "NO";
                    return result;
                }
            }
        }
        if(deque.isEmpty()== true){
            result = "YES";
        }
        else{
            result = "NO";
        }
        return result;
    }


}

