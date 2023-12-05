package sum3;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum {

    public static int[] auxArr = new int[3];
    public static  int cont = 0;

    static int sum(int triplet[], int arrayLength) {
        int length = arrayLength;
        int sum;
        if (length == 0) {
            return triplet[length];
        } else {
            sum = (triplet[length]) + sum(triplet, arrayLength - 1);
        }
        return sum;
    }

    static void combinations(int nums[], int triplet[], int startElement,
                             int endElement, int arrayIndex) {

        int resSum = 0;
        if (arrayIndex == 3) {
            resSum = sum(triplet, triplet.length - 1);
            if (resSum == 0) {

                if(cont == 0){
                    auxArr = triplet;
                    cont++;
                    System.out.print("[");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(triplet[i] + " ");
                    }
                    System.out.println("] = " + resSum);
                }
                int acum = 0;
                for(int l =0 ; l < 3; l++){
                    for (int h = 0; h < 3; h++){
                        if(auxArr[l] == triplet[h])
                            acum++;
                    }
                }


                if(acum == 3 || Arrays.stream(auxArr).allMatch(e->e==0)){
                    acum=0;
                    return;
                }else {
                    System.out.print("[");
                    for (int i = 0; i < 3; i++) {
                        System.out.print(triplet[i] + " ");
                    }
                    System.out.println("] = " + resSum);
                }
            }
            return;
        }

        for (int y = startElement; y <= endElement && endElement - y + 1 >= 3 - arrayIndex; y++) {
            triplet[arrayIndex] = nums[y];
            combinations(nums, triplet, y + 1, endElement, arrayIndex + 1);
        }
    }


    public static void result(int nums[]) {
        int triplet[] = new int[3];
        combinations(nums, triplet, 0, nums.length - 1, 0);
    }

}
