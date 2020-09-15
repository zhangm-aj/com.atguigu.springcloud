package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    //利用泛型，可以传任何实体类

    private  T data;
    //由于传的data可能为空，所以要加一个构造方法
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

}