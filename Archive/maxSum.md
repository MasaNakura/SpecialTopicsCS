public static int maxSum(List L, int n) {
    return maxSumHelper(L, n, 0, 0, 0);
}

public static int maxSumHelper(List list, int limit, int max, int index, int currMax) {
    if (index >= list.size()) {
        return compare(max, currMax, limit);  
    } else {
        if (max > limit) {
            return currMax;
        }
        currMax = compare(max, currMax, limit);
        int tempMaxOne = maxSumHelper(list, limit, max, index + 1, currMax);
        currMax = compare(tempMaxOne, currMax, limit);
        int tempMaxTwo = maxSumHelper(list, limit, max + (int) list.get(index), index + 1, currMax);  
        currMax = compare(tempMaxTwo, currMax, limit);
        return currMax;  
    } 
}
public static int compare(int newMax, int currMax, int limit) {
    if (newMax > currMax && newMax <= limit) {
        currMax = newMax;
    }
    return currMax;
}