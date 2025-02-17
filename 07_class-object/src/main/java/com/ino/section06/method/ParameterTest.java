package com.ino.section06.method;

import com.ino.section04.dto.UserDTO;

import java.util.Arrays;
import java.util.Optional;

public class ParameterTest {
    // 매개변수로 작성 가능한 자료형
    // 1. 기본 자료형 2. 기본 자료형 배열 3. 클래스 자료형 4. 클래스 자료형 배열 5. 가변인자

    public void testPrimitiveTypeParam(int num) {
        System.out.println("delivered to parameter: " + num);
    }

    public void testArrayTypeParam(int[] arr) {
        System.out.println("parameter: " + arr);
        System.out.println("arr elements: " + Arrays.toString(arr));

        arr[0] = 100;
    }

    public void testClassTypeParam(UserDTO user) {
        System.out.println("param val: " + user);
        System.out.println("real val: " + user.getInfo());


        user.setPwd("****");
    }

    public void testVariableArgsParam(int... nums) {
        System.out.println("value : " + nums);
    }

    //public void tsetVariableArgsParam(String... hobby, String name) {}
    public void testVariableArgsParam(String name, String... hobby) {
        System.out.println("name: " + name);
        System.out.println("hobby: " + Arrays.toString(hobby));
    }
}
