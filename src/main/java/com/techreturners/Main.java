package com.techreturners;

public class Main {
    public static void main(String [] args){
        Rover rover = new Rover(3,3,"E");
        System.out.println(rover.setDirection("MMRMMRMRRM"));
    }
}
