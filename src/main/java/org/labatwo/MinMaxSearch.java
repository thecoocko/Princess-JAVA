package org.labatwo;

import java.io.IOException;

public class MinMaxSearch extends  InputOutputArray{

    public MinMaxSearch(int x, int y ,int choice) {
        super(x, y,choice);
    }

    public void getMin() throws IOException {
        int [][] array = getMatrix();
        System.out.print("adasdasdasdasdsad\n");
        for(int i = 0; i < x;i++){
            for(int j=0; j<y;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

    public void getMax(){
        System.out.print("pusto");

    }
}
