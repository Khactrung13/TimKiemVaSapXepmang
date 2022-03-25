/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimKiemvaSapXepmang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai4 {
    static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
     public static void MangNgauNhien(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
    }
    public static void NhanMang(int[] arr){
        System.out.println("Cac phan tu cua mang la:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
     public static void SapxepTangDan(int[] arr){
        int temp =arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {                
                if(arr[i]>arr[j]){
                    temp =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;                    
                }
                
            }
        }
        System.out.println("\nMang sap xep tang dan:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void SapxepGiamDan(int[] arr){
        int temp =arr[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {                
                if(arr[i]<arr[j]){
                    temp =arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;                    
                }
                
            }
        }
        System.out.println("\nMang sap xep giam dan:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void TimKiemViTriDauTien(int[] arr,int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                System.out.println("vi tri xuat hien dau tien : " + i);
                break;
            }
       
        }
    }
     public static void TimKiemTatCaCacViTri(int[] arr,int k ){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == k){
                System.out.println("vi tri xuat hien cua so can tim  la: " + i);                
            }

        }
    }
    public static void main(String[] args) {
        System.out.print("Nhap cac phan tu cua mang:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        MangNgauNhien(arr);
        NhanMang(arr);
        SapxepTangDan(arr);
        SapxepGiamDan(arr);
        System.out.print("\nNhap so can tim kiem:");
        int k = sc.nextInt();
        TimKiemViTriDauTien(arr,k);
        TimKiemTatCaCacViTri(arr,k);
        
    }
}
