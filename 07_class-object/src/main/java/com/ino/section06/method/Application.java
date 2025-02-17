package com.ino.section06.method;

import com.ino.section04.dto.UserDTO;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        ParameterTest pt = new ParameterTest();

        pt.testPrimitiveTypeParam(10);
        pt.testPrimitiveTypeParam(20);

        System.out.println("====================");

        int[] iArr = {1, 2, 3, 4, 5};
        System.out.println("arr to deliver: " + iArr);
        System.out.println("elements to deliver: " + Arrays.toString(iArr));
        pt.testArrayTypeParam(iArr);

        UserDTO user = new UserDTO("user01", "pass01", "홍길동");
        System.out.println("instance : " + user);
        System.out.println("instance info : " + user.getInfo());

        pt.testClassTypeParam(user);
        pt.testVariableArgsParam(1,2,3);
        pt.testVariableArgsParam(1);
        pt.testVariableArgsParam(1,2);

        pt.testVariableArgsParam("ino", "hi", "hello", "my", "name");
    }

}


