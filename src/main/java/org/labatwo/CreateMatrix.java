package org.labatwo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class CreateMatrix {

    int x;
    int y;
    int choice;
    private static int randomBounds = 10;

    public CreateMatrix(int x, int y, int choice) throws IOException {
        this.x=x;
        this.y=y;
        this.choice=choice;
    }

    public  int[][] setRandomMatrix(){
        Random random = new Random();
        int [][]array = new int [x][];
        for(int i =0;i<x;i++){
            array[i] = new int[y];
            for(int j=0; j<y;j++){
                array[i][j] = random.nextInt(randomBounds);
            }
        }

        return array;
    }
    public int[][] setMatrix() throws IOException {
        if(x > 20 || y > 20) {x = 20; y = 20;}
        int [][] array = new int[x][];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < x;i++){
            array[i] = new int[y];
            for(int j=0; j<y;j++){
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public int[][] getMatrix() throws IOException {
        int [][]array = new int[x][];
        if(choice==1){
            array = setRandomMatrix();
        }else{
            array = setMatrix();
        }
        return array;
    }

    public void printMatrix(int [][]array) throws IOException {

        for(int i = 0; i < x;i++){
            for(int j=0; j<y;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }


}
