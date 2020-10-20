// travel

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

// countBinary

public static void countBinary(int x) {
    if (x == 0) {
        System.out.println();
    } else {
        countBinary(0, (int)Math.pow(2, x), x);
    }
}

public static void countBinary(int min, int max, int y) {
    if (min < max) {
        String s = Integer.toBinaryString(min);
        s = String.format("%" + y + "s", s).replace(' ', '0');
        System.out.println(s);
        countBinary(min + 1, max, y);
    }
}