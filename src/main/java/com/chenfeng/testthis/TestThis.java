package com.chenfeng.testthis;

/**
 * @author 陈枫 on 2019-06-02.
 */
public class TestThis {
    private int id;
    private int age;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestThis() {
    }

    public TestThis(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public TestThis(int id, int age, String name) {
        this(age, name);
        this.id = id;
    }

    public static void print(){
        System.out.println("我是静态方法");
    }

    @Override
    public String toString() {
        return "TestThis{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        TestThis testThis = new TestThis();
        testThis.setId(1);
        testThis.setAge(25);
        testThis.setName("陈枫");
        System.out.println(testThis.toString());
        print();
    }


}
