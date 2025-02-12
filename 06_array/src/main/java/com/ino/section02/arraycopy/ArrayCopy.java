package com.ino.section02.arraycopy;

import java.util.Arrays;

public class ArrayCopy {
    public void testShArrCopy() {
        int[] org = {1, 2, 3, 4, 5};
        System.out.println("org arr : " + Arrays.toString(org));
        int[] cp = org;
        System.out.println("cp arr : " + Arrays.toString(cp));

        cp[0] = 100;
        System.out.println("after mod cp arr, org arr : " + Arrays.toString(org));
        System.out.println("after mod cp arr : " + Arrays.toString(cp));
    }

    public void testCopy() {
        int num1 = 10;
        int num2 = num1;
        System.out.println(num1 + " " + num2);
        num2 = 20;
        System.out.println("after chage" + " " + num1 + " " + num2);

    }

    public void testDeepArrCopy1() {
        int[] org = {1, 2, 3, 4, 5};
        int[] cp = new int[5];
        for (int i = 0; i < 5; i++) {
            cp[i] = org[i];
        }
    }

    public void testDeepArrCopy2() {
        int[] org = {1, 2, 3, 4, 5};
        int[] cp = new int[5];

        System.arraycopy(org, 1, cp, 3, 3);
    }

    public void testDeepArrCopy3() {
        int[] org = {1, 2, 3, 4, 5};
        int[] cp = new int[5];

        System.arraycopy(org, 1, cp, 3, 3);
    }

    public void testDeepArrCopy4() {
        int[] org = {1, 2, 3, 4, 5};
        int[] cp = new int[5];

        System.arraycopy(org, 1, cp, 3, 3);
    }

    public void testArrayParameter(int[] arr) {
        arr[0] = 100;
    }
}
