package com.zipcodewilmington.assessment1.part4;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        // k = how high the jump
        //j is jump height
        int counter = 0;
        for (int i = 0; i < k; i++) {
            if (k == j) {
                break;
            }
            else if (k != j){
                counter++;
            }
        }
        return counter;
    }

}
