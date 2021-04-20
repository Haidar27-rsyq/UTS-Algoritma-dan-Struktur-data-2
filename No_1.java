package uts_semester2;
import java.util.Scanner;
public class No_1 {
    public static void selectionSort(int[] A){
        int smallindex;
        int pass, j , n=A.length;
        int temp;
        
        for (pass = 0; pass<n-1; pass++){
            smallindex = pass;
            for (j = pass + 1; j<n; j++){
                if (A[j]<A[smallindex]){
                    smallindex = j;
                }
            }
            temp = A[pass];
            A[pass] = A[smallindex];
            A[smallindex] = temp;           
        }
    }
    
    public static void tampil(int data[]){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        int A[] = {3, 10, 4, 2, 8, 13};
        No_1.tampil(A);
        No_1.selectionSort(A);
        No_1.tampil(A);
        No_1.Binnary(A);
    }
    
    public static void Binnary(int [] A) {
        int B[] = {3, 10, 4, 2, 8, 13};
        Scanner input = new Scanner(System.in);
        System.out.println("Manjingna data sing digoleti : ");
        int cari = input.nextInt();
        int ketemu = 0;
        int IndeksAwal = 0;
        int IndeksAkhir = A.length-1;
        int point = 0;
        
        System.out.println("njerone Data A Adalah : ");
            for (int i = 0; i<A.length; i++){
                System.out.print(A[i] + " ");
            }
        System.out.println("");
        System.out.println("");
        
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)){
            point = (IndeksAwal + IndeksAkhir)/ 2;
            System.out.println("Indeks pointer : "+point);
                 if (cari == A [point]){
                     ketemu = 1;
                     System.out.println("Data "+
                     cari + " Telah ditemukan pada indeks ke "+ point);
                 }
                 else if (cari < A[point]){
                     System.out.println("Cari di kiri ");
                     IndeksAkhir = point-1;
                 }
                 else {
                     IndeksAwal = point+1;
                     System.out.println("Cari di kanan ");
                 }
        }
        
        if (ketemu == 1)
            System.out.println("Kesimpulan : Data Ditemukan");
        else
            System.out.println("Kesimpulan : Data Tidak Ditemukan");
        
        System.out.print("Muhammad Haidar Rasyiq");
    }
}
