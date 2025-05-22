package org.example.springdemo01.Entity;


import lombok.Data;

//该实体对象是用来返回响应数据的对象
@Data
public class Result {

    private Integer code;//状态码
    private String msg;//设置返回信息
    private Object data;//设置返回数据

    public static Result success(){
        Result result = new Result();
        result.code = 1;
        result.msg = "success";
        return result;

    }

    public static Result success(Object data){
        Result result = new Result();
        result.data = data;
        result.code = 1;
        result.msg = "success";
        return result;

    }

    public static Result error(){
        Result result = new Result();
        result.code = 0;
        result.msg = "error";
        return result;

    }




}
