package com.nishan.java.lambda_expression;

public class LamdaTest {
    public static void main(String[] args) {
        FIAnimalSound sound = () ->{
                System.out.println("Mewao");
            };

        sound.makeSound();
    }
}
