package uts_semester2;
import java.util.Scanner;
public class No_3 {
    public static void main (String[]args){
        int i, j, m, n;
        int matriks[][] = new int [10][10];
        int transpose[][] = new int [10][10];
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan Jumlah baris matriks A: ");
        m = scan.nextInt();
        System.out.print("Masukan Jumlah kolom matriks A: ");
        n = scan.nextInt();
        System.out.println("Masukan Elemen matriks A : ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks A : ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
    }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                transpose[j][i]=matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose matriks A : ");
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                System.out.print(transpose[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.print("Masukan Jumlah baris matriks B : ");
        m = scan.nextInt();
        System.out.print("Masukan Jumlah kolom matriks B : ");
        n = scan.nextInt();
        System.out.println("Masukan Elemen matriks B: ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                matriks[i][j] = scan.nextInt();
            }
        }
        System.out.println("Hasil matriks B : ");
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
    }
        for(i=0; i<m; i++){
            for(j=0; j<n; j++){
                transpose[j][i]=matriks[i][j];
            }
        }
        System.out.println("Hasil Transpose matriks B : ");
        for(i=0; i<n; i++){
            for(j=0; j<m; j++){
                System.out.print(transpose[i][j]+ "\t");
            }
            System.out.println();
            
            System.out.print("Muhammad Haidar Rasyiq");
        }
        }
}
