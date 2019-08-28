package com.chenfeng.javassist;

/**
 * @author 陈枫 on 2019-05-12.
 */
public class Emp {
    private Integer empno;
    private String ename;

    public Emp() {
    }

    public Emp(Integer empno, String ename) {
        this.empno = empno;
        this.ename = ename;
    }

    public void sayHello(int a) {
        System.out.println("sayHello," + a);
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }
}
