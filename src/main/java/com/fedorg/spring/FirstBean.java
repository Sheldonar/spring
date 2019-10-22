package com.fedorg.spring;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {
    public int i;
    public String s;
    public FirstBean () {
        i = 10;
        s = "Hello world";
    }

    public int getI() {
        return i;
    }
}
