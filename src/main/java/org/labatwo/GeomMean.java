package org.labatwo;


public class GeomMean {
    public double geomMean(int x,int y,int [][]array){
        int avg = 1;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                avg *= array[i][j];
            }
        }
        return Math.pow(avg,1.0/(x*y));
    }
}
