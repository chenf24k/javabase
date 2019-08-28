package com.chenfeng.enumtest;

/**
 * @author 陈枫 on 2019-06-18.
 */
public enum ErrorCodeEn {
    OK(0, "成功"),
    ERROR_A(100, "错误A"),
    ERROR_B(200, "错误B");

    ErrorCodeEn(int number, String description) {
        this.code = number;
        this.description = description;
    }

    private int code;
    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static void main(String[] args) {
        for (ErrorCodeEn s : ErrorCodeEn.values()) {
            System.out.println("code:" + s.getCode() + ",description:" + s.getDescription());
        }
    }
}
