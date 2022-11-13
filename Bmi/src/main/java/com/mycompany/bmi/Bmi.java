package com.mycompany.bmi;
public class Bmi {
    public static void main(String[] args) {
        int beratbadan = 90;
        float tinggibadan =1.70f;
        float bmi=(beratbadan/(tinggibadan*tinggibadan));
        
        System.out.println("BMI ANDA ADALAH\t:"+bmi);
        if (bmi<18.85) {
            System.out.println("BERAT BADAN ANDA KURANG");
        }
        else if (bmi<24.9){
            System.out.println("BERAT BADAN ANDA NORMAL");
        }
        else if (bmi<29.9){
            System.out.println("BERAT BADAN ANDA LEBIH");
        }
        else {
            System.out.println("OBESITAS");
        }
    }
}
