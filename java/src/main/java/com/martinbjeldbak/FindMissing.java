package com.martinbjeldbak;

import java.util.*;
import java.util.stream.Collectors;

public class FindMissing {
    public FindMissing() {
    }

    // [4, 12, 9, 5, 6]
    // [4, 9, 12, 6]
    // 5
    public int call(int[] fullSet, int[] partialSet) {
        Set<Integer> fullSetSet = Arrays.stream(fullSet).boxed().collect(Collectors.toSet());
        Set<Integer> partialSetSet = Arrays.stream(partialSet).boxed().collect(Collectors.toSet());

        fullSetSet.removeAll(partialSetSet);
        Integer[] missing = fullSetSet.toArray(new Integer[1]);

        if(missing[0] == null) {
            return -1;
        } else {
            return missing[0];
        }
    }
}
