package org.labatwo;

public class ArifMean {
    public double arifMean(int x,int y,int [][]array){
        float avg = 1.0F;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                avg += array[i][j];
            }
        }
        return avg/(x*y);
    }
}
