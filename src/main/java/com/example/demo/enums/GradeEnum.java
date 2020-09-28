package com.example.demo.enums;

import com.baomidou.mybatisplus.annotation.IEnum;
import com.fasterxml.jackson.annotation.JsonValue;

public enum GradeEnum implements IEnum<Integer> {

    PRIMARY(1, "小学"),
    SECONDORY(2, "中学"),
    HIGH(3, "高中");

    GradeEnum(int code, String descp) {
        this.code = code;
        this.descp = descp;
    }


    private int code;
    @JsonValue
    private String descp;

    @Override
    public Integer getValue() {
        return this.code=code;
    }
}