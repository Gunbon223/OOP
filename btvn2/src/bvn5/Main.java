package bvn5;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhập ma trận đầu tiên: ");
        int input[] = getColumnRow();
        int columnFirst=input[1] , rowFirst=input[0];
        double[][] arrMatrix1 = new double[columnFirst][rowFirst];
        matrixInput(arrMatrix1,columnFirst,rowFirst);
        System.out.println("Nhập ma trận thứ hai: ");
        int input2[] = getColumnRow();
        int columnSecond=input2[1] , rowSecond=input2[0];
        double[][] arrMatrix2 = new double[columnSecond][rowSecond];
        matrixInput(arrMatrix2,columnSecond,rowSecond);
        matrixPlus(arrMatrix1, arrMatrix2, columnFirst, rowFirst, columnSecond, rowSecond);
//Bai 2
        int[] arr = {1,2,4,0,1,3};
        arr = add(arr);
        sort(arr);
        arrayPrint(arr);
    }

    public static int[] getColumnRow() {
        int input[] =new int[2];
        System.out.print("Nhập số hàng của ma trận: ");
        input[0] = Integer.parseInt(scan.nextLine());
        System.out.print("Nhập số cột của ma trận: ");
        input[1] = Integer.parseInt(scan.nextLine());
        return input;
    }
    public static void matrixPrint(double[][] arr, int column, int row) {
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(arr[i][j] + "\t\t");
            }
            System.out.println("");
        }
    }
    public static double[][] matrixInput(double[][] arr,int column,int row) {
        for(int i=0;i<column;i++) {
            for (int j=0;j<row;j++) {
                System.out.print("Nhap phan tu ma tran thu ["+(i+1)+"]["+(j+1)+"] :");
                arr[i][j] = Double.parseDouble(scan.nextLine());
            }
        }
        return arr;
    }

    public static void matrixPlus(double[][] arr, double[][] arr2, int column, int row, int column2, int row2) {
        double[][] arrSum = new double[column][row];
        if (column == column2 && row == row2) {
            for (int i = 0; i < column; i++) {
                for (int j = 0; j < row; j++) {
                    arrSum[i][j] = arr[i][j] + arr2[i][j];
                }
            }
            System.out.printf("Tổng 2 ma trận vừa nhập là: ");
            matrixPrint(arrSum, column, row);
        } else {
            System.out.println("Hàng và cột 2 ma trận không bằng nhau, nhập lại");
        }
    }

    public static int[] add(int[] arr)  {
        int arrPreLength = arr.length;
        System.out.print("Bạn muốn thêm mấy phần tử vào mảng: ");
        int n = Integer.parseInt(scan.nextLine());
        arr = new int[arr.length+n];
            for (int i=arrPreLength;i<arr.length;i++) {
                System.out.print("Nhập giá trị phần tử mới ở "+(i+1)+" :");
                arr[i] = Integer.parseInt(scan.nextLine());
            }
        int temp =arr[2];
        arr[2] = arr[1];
        arr[1] = temp;
        return arr;
    }
    public static void arrayPrint(int[] arr) {
        System.out.println("Mảng là:");
        for (int i: arr) {
            System.out.print("\t"+ i);
        }
    }

    public static int[] sort(int[] array) {

        for (int i = 0 ; i< array.length;i++) {
            if(array[i] >array[i+1]) {
                int temp = array[i];
                array[i+1] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }


}