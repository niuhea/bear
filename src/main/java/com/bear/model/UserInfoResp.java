package com.bear.model;

/**
 * Created by nick on 2017/5/26.
 */
public class UserInfoResp {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserInfoResp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
