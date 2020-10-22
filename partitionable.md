public static boolean partitionable(List list) {
    return partitionableHelper(list, 0, 0, 0);
}

public static boolean partitionableHelper(List list, int curr, int index, int total) {
    if (index >= list.size()) {
         if (total % 2 == 1) {
             return false;
         }
         if (curr == total / 2) {
             return true;
         }
    } else {
        int num = (int) list.get(index);
        total += num;
        if (partitionableHelper(list, curr, index + 1, total) || 
            partitionableHelper(list, curr + num, index + 1, total)) {
            return true;
        }
    }    
    return false;
}