// travel. returns all paths in N, E, NE from the origin to the given coordinates
   // x + y levels of recursion
   // for each decision, there is 3 branching factors: N, E, NE. 
   // order is O(3^n), as it tests out all possibilities and has 3 brancges 
   // recursive so uses a stack in the memory.
   public static void travel(int x, int y) {
    travelHelp(x, y, "");
   }

    public static void travelHelp(int x, int y, String out) {
      if (x == 0 && y == 0) System.out.println(out);
      
      else if (x > 0 && y > 0) {
         travelHelp(x, y - 1, "N " + out);
         travelHelp(x - 1, y, "E " + out);
         travelHelp(x - 1, y -1, "NE " + out);
      } else if (x > 0) {
         travelHelp(x - 1, y, "E " + out);
      } else if (y > 0) {
         travelHelp(x, y - 1, "N " + out);
      }
   }


   /*
     * recursion tree
     * if n = 2:
     *       ""
         /    \
        0         1
       / \       / \
     00  01  10  11
     
     * the number of levels is n and there are 2 states/branches - add 0 or 1
     * time complexity - O(2^n)


     * countBinary1 passes in the parameter n and string str into the method CountBinary2
      */

    public static void countBinary1(int x) {
        String str = "";
        countBinary2(str, x);
    }
     
    /* @parameter str  stores the binary numbers with n digits
     * @parameter x the length of a binary digit
     * 
     * method countBinary2 recursively calls itself to build a binary digit  length n
     * after first call second recursive call is then executed and it performs similarly to the first recursive call but adds 1 to the 
     * string and executes until n is 0.
     */
        
    public static void countBinary2(String str, int n) {
        //base case
        if(n == 0) {
            System.out.println(str);
            return;
        }
        
        //recursive call adds zero
        countBinary2(str + "0", n - 1);

 

        //recursive call adds 1
        countBinary2(str + "1", n - 1);
    }