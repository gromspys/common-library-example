package com.example.database;

import com.example.core.exception.MyException;

public class DemoApplication {

    public static void main(String[] args) {
        throw new MyException("Exception from core submodule");
    }

}
