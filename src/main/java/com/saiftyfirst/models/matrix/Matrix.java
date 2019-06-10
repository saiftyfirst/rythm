package com.saiftyfirst.models.matrix;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Matrix {

    private Dimensions dimensions;

    @Data
    @AllArgsConstructor
    public static class Dimensions {
        private int x;
        private int y;
    }
}