/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimKiemvaSapXepmang;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {
      static Scanner sc = new Scanner(System.in);
    static Random rd = new Random();
    public static void MangNgauNhien(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Cac phan tu cua mang la:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void TimKiem(int[] arr ,int n){
        System.out.print("\nNhap so can tim kiem:");
        int k = sc.nextInt();
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
        TimKiem(arr,n);
    }
}
