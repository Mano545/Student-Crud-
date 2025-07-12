package com.example.demo.models;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CommonResponse {
    private enumeration status;
    private String success;
    private String error;
    private Object data;
    private int code;
}
