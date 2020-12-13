public class SetAndMaps {
    // Question 2 answers
    // {bar=earth, baz=wind, foo=air, mumble=fire}
    // {five=quatro, one=dos, three=tres}
    // {b=years, c=seven, e=ago, g=seven}

    // Question 3 answers
    public static int maxLength(Set<String> stringSet) {
        if (stringSet == null || stringSet.isEmpty()) {
            return 0;
        }
        int max = 0;
        for (String s : stringSet) {
            max = Math.max(max, s.length());
        }
        return max;
    }

}