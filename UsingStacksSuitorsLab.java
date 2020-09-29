import java.util.*;

/* 
 * Group 5: Masa Nakura, Aaron Xie
 * Period 7
 *
 * UsingStacksSuitorsLab
 * 
 * This class is mostly a driver for playing with Strings as palindromes, 
 * both iteratively and recursively.  The UsingStacksSuitorsLab class itself is
 * a runnable object, so it can be passed to a thread in our Queue demo
 * 
 * 
 */

public class UsingStacksSuitorsLab implements Runnable {
   private static int threadCount = 0;
   private String name;
	
   public UsingStacksSuitorsLab() {
      name = "#" + threadCount++ + "Thread";
   }
	
   public static void main(String[] args) {
      String s1 = "food";		    //not a palindrome
      String s2 = "racecar";      //a palindrome
   		
      System.out.println("String1 is \"" + s1 + "\"");
      System.out.println("String2 is \"" + s2 + "\"");
   	
      /*System.out.println(s1 + " reversed is: ");
   	printReverse(s1);
   	System.out.println(s2 + " reversed is: ");
   	printReverse(s2);
      
      recPrintReverse(s1);
   	System.out.println();
   	recPrintReverse(s2);
   	System.out.println();
   	System.out.println(s1 + " is a palindrome: " + isPalindrome(s1));
   	System.out.println(s2 + " is a palindrome: " + isPalindrome(s2));
      
   	System.out.println(s1 + " is a palindrome(recursively): " + isPalindromeRec(s1));
   	System.out.println(s2 + " is a palindrome(recursively): " + isPalindromeRec(s2));	
   	*/
   	System.out.println("Did we build a Queue of Threads and start them? " + buildThreadQueue());
   	
   	int n = 6;
   	System.out.println("For " + n + " suitors, stand in place:" + findPlaceToStand(n));
   	
   	n = 10;
   	System.out.println("For " + n + " suitors, stand in place:" + findPlaceToStand(n));
   }
		
	
	
	// prints the given String in a reverse order using iteration
   public static void printReverse(String target) {
   	//todo: use a stack
      Stack<Character> reverse = new Stack<>();
      int size = target.length();
      for (int i = 0; i < size; i++) {
         reverse.push(target.charAt(i));
      }
      for (int i = 0; i < size; i++) {
         System.out.print(reverse.pop());
      }
      System.out.println();
   }
	
   // prints the given String in a reverse order using recursion
   public static void recPrintReverse(String target) {
   	//todo
      if (target.length() == 1) {
         System.out.print(target);
      } else if (target.length() > 1){
         System.out.print(target.charAt(target.length() - 1));
         recPrintReverse(target.substring(0, target.length() - 1));
      }
   }
	
   // returns true if the given String is a palindrome and false if otherwise using iteration
   public static boolean isPalindrome(String input) {
   	//todo: use a stack
      Stack<Character> reverse = new Stack<>();
      int size = input.length();
      String reversed = "";
      for (int i = 0; i < size; i++) {
         reverse.push(input.charAt(i));
      }
      for (int i = 0; i < size; i++) {
         reversed += Character.toString(reverse.pop());
      }
      return input.equals(reversed);
      
   }

   // returns true if the given String is a palindrome and false if otherwise by using recursion
   public static boolean isPalindromeRec(String sentence)	{
     	//todo
      if (sentence.length() <= 1) {
         return true;
      } else {
         char first = sentence.charAt(0);
         char last = sentence.charAt(sentence.length() - 1);
         if (first == last) {
            return isPalindromeRec(sentence.substring(1, sentence.length() - 1));
         }
         return false;        
      }   
   }
	
   // finds what number from 1 to the given number that will be chosen if every 3 counted off
   // is removed
   public static int findPlaceToStand(int numSuitors) {
      Queue<Integer> queue = new LinkedList<>();
      for(int i = 0; i < numSuitors; i++) {
         queue.add(i+1);
      }
      int modulus = 3;
      int i = 1;
      while(queue.size() > 1) { 
         int candidate = queue.poll();
         if(i != modulus) {
            queue.add(candidate);
         }
      
         i = (i % modulus) + 1; 
      }
      return queue.poll();
   }	
   /*
   // finds what number from 1 to the given number that will be chosen if every 3 counted off
   // is removed. When the counting reaches the maximum number, it recounts the current max
   // and removes every 3 counted off downwards. 
   public static int findPlaceToStand(int numSuitors) {
      Stack<Integer> s1 = new Stack<>();
      Stack<Integer> s2 = new Stack<>();
      for (int i = numSuitors; i >= 1; i--) {
         s1.push(i);
      }
      int i = 1;
      int count = numSuitors;
      Stack<Integer> other = s2;
      Stack<Integer> using = s1;
      while (count > 1) {
         if (i == 3) {
            using.pop();
            count--;
            i = 1;
         } else {
            other.push(using.pop());
            i++;
         }
         if (using.isEmpty()) {
            Stack<Integer> temp = using;
            using = other;
            other = temp;         
         }
      }
      if (using.isEmpty()) {
         return other.peek();
      } else {
         return using.peek();
      }
   }
   */

   public static boolean buildThreadQueue() {	//returns true upon success
      Queue<Thread> q = new LinkedList<Thread>(); 
   	
   	//when our program starts up, it might create multiple threads to use
      q.add(new Thread(new UsingStacksSuitorsLab()));
      q.add(new Thread(new UsingStacksSuitorsLab()));
      q.add(new Thread(new UsingStacksSuitorsLab()));
   	
      System.out.println("Initial Thread order:");
      q.toString();  
   	
   	//We need to iterate over our pool of threads and call start() on each one
   	//Make a loop that dequeues a thread, calls start on it, and //enqueues it again
   	//to do:
   	//current = get a thread
   	//current.start();
   	//put the thread back
   
      for (int i = 0; i < q.size(); i++) {
         Thread current = q.poll();
         current.start();
         q.add(current);
      }
   	
      System.out.println("Thread order after start()ing:");
      q.toString();  
   	
      return true;  //on successful start
   }
	
	
	/*
	 * No need to edit anything below here, 
	 * unless you'd like to change the 
	 * behaviour of each thread in the thread pool above
	 */
	
   @Override
   public void run() {
      for(int i = 0; i < 1; i++) {
         System.out.println(name + ": " + i + "th iteration");
         try {
            Thread.sleep(10);
         } catch (InterruptedException e) {
         	//do nothing here
         }
      }
   }
}
