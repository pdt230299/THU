/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author PDT
 */
class Matrix {
    private int a , b;
    private int x[][];
    public Matrix(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void nextMatrix(Scanner sc) {
        x = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                x[i][j] = sc.nextInt();
            }
        }
    }

    public String mul(Matrix b) {
        int[][] c = new int[x.length][b.getMatrix()[0].length];
        String str = "";
        int m = x.length;
        int n = b.getMatrix()[0].length;
        int k = x[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < k; l++) {
                    c[i][j] += x[i][l] * b.getMatrix()[l][j];
                }
            }
        }
        for (int x = 0; x < c.length; x++) {
            for (int y = 0; y < c[0].length; y++) {
                str += c[x][y] + " ";
                }
                str += "\n";
            }
        return str;
    }

    public int[][] getMatrix() {
       return x;
    }
}
