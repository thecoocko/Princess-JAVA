import java.io.IOException;

import org.labathree.controller.StudentCreate;
import org.labathree.models.university.Student;

public class Main {
    public static void main(String[] args) throws IOException {
        Student student=new Student("male","Mykola","Mykolayovych","124-19-2","FIT");
        System.out.println(student.getGender());
        System.out.println(student.getGender());
        StudentCreate [] students = new StudentCreate[5];
        for (int i = 0; i < 5; i++)
        {
            //get input variables;
            students[i] = new StudentCreate("male","Mykola","Mykolayovych","124-19-2","FIT");
        }
        for (int i = 0; i < 5; i++)
        {
            //get input variables;
            System.out.println(students[i].getStudent());
        }
//        LabaZero.helloWorld();
//        int[] arguments = new int[3];
//        System.out.println("\nFirst two: x, y - size of matrix. The third is your choice." +
//                "\nYou can choose between random generation matrix (1) or fill in manually (2)" +
//                "\nPlease enter 3 arguments below with \"enter\" separator.\n");
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//                arguments[i]=input.nextInt();
//            }
//        CreateMatrix matrix = new CreateMatrix(arguments[0],arguments[1],arguments[2]);
//        int [][]array = matrix.getMatrix();
//        System.out.println("Your matrix:\n");
//        matrix.printMatrix(array);
//        MinMaxSearch number = new MinMaxSearch(arguments[0],arguments[1],arguments[2]);
//        System.out.println("Minimum number:" + number.getMin(array));
//        System.out.println("Maximum number:" + number.getMax(array));
//        GeomMean ag = new GeomMean();
//        ArifMean af = new ArifMean();
//        System.out.println("Geometric mean:\t"+ag.geomMean(arguments[0], arguments[1],array));
//        System.out.println("Arithmetical mean:\t"+af.arifMean(arguments[0], arguments[1],array));

    }
}
