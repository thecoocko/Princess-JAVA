package org.labatwo;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;

public class MinMaxSearch extends CreateMatrix {

    public MinMaxSearch(int x, int y ,int choice) throws IOException {
        super(x, y,choice);
    }

    public int getMin(int[] @NotNull []array) throws IOException {
        int minimum=array[0][0];
        for(int i = 0; i < x;i++){
            for(int j=0; j<y;j++){
                minimum=Math.min(minimum,array[i][j]);
            }
        }
        return minimum;
    }

    public int getMax(int [] @NotNull [] array ) throws IOException{
        int maximum=array[0][0];
        for(int i = 0; i < x;i++){
            for(int j=0; j<y;j++){
                maximum=Math.max(maximum,array[i][j]);
            }
        }
        return maximum;
    }
}
