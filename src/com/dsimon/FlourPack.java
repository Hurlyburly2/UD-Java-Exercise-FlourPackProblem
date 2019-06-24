package com.dsimon;

public class FlourPack {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        while (goal > 0) {
            if (goal >= 5 && bigCount > 0) {
                goal -= 5;
                bigCount -= 1;
            } else if (goal >= 1 && smallCount > 0) {
                goal -= 1;
                smallCount -= 1;
            } else {
                return false;
            }
        }
        if (goal == 0) {
            return true;
        }
        return false;
    }
}
