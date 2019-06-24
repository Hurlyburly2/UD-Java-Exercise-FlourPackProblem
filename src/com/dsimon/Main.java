package com.dsimon;

public class Main {

    public static void main(String[] args) {
        System.out.println(FlourPack.canPack(1,0,4) == false);
        System.out.println(FlourPack.canPack(1, 0, 5) == true);
        System.out.println(FlourPack.canPack(0, 5, 4) == true);
        System.out.println(FlourPack.canPack(2, 2, 11) == true);
        System.out.println(FlourPack.canPack(-3, 2, 12) == false);
    }
}
