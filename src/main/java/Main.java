import org.labazero.LabaZero;
import org.labatwo.InputOutputArray;
import org.labatwo.MinMaxSearch;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        LabaZero.helloWorld();
        InputOutputArray numbers = new InputOutputArray(2,2,2);
        numbers.printMatrix();
        MinMaxSearch min = new MinMaxSearch(2,2,2);
        min.getMin();


    }
}
