package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
//        throw new UnsupportedOperationException("You should implement this method.");
        return list -> {
            List<Integer> result = new ArrayList<>();
            for (int x: list){
                result.add(x/divider);
            }
            return result;
        };
        }
}
