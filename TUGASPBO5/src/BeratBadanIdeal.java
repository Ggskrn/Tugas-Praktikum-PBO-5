/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class BeratBadanIdal {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();
        double bmi = beratBadan / (tinggiBadan * tinggiBadan);
        System.out.println("Nilai BMI Anda: " + bmi);
        int kategori;
        if (bmi <= 18.4) {
            kategori = 1;
        } else if (bmi <= 24.9) {
            kategori = 2;
        } else if (bmi <= 29.9) {
            kategori = 3;
        } else if (bmi <= 39.9) {
            kategori = 4;
        } else {
            kategori = 5;
        }
        switch (kategori) {
            case 1 -> System.out.println("Kategori : Berat Badan Kurang");
            case 2 -> System.out.println("Kategori : Berat Badan Ideal");
            case 3 -> System.out.println("Kategori : Berat Badan Lebih");
            case 4 -> System.out.println("Kategori : Gemuk");
            case 5 -> System.out.println("Kategori : Sangat Gemuk");
            default -> System.out.println("Error dalam perhitungan kategori.");
        }
        
        input.close();
    }
}
}
