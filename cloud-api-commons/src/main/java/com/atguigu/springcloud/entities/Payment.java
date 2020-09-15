package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data   //集成了setter、getter、toString、EqualsAndHashCode等方法
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor   //空参构造方法
//实现Serializable 分布式部署可能会用到
public class Payment implements Serializable {
    private Long id;
    private String serial;


}