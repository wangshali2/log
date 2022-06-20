package day13.io;

import java.io.Serializable;

/**
 * 1.操作对象对应的类实现Serializable序列化接口
 */

public class Student implements Serializable {
    private String name;
    private transient int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
}
