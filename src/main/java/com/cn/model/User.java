package com.cn.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.*;
import java.util.Date;

//@Data的作用：可以代替set和get，以及toString方法；需要添加lombok这个插件和依赖
@Data
public class User {
    //主键
    private int id;

    @Size(min = 3,max=5,message = "{user.username.size}")
    private String username;

    @NotNull(message = "{user.psw.notnull}")
    @Pattern(regexp = "^[a-zA-Z][0-9a-zA-Z_]{5,17}",message = "{user.psw.pattern}")
    private String psw;

    @Size(min = 3,max=5,message = "{user.username.size}")
    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date created;

    private int status;

    @Min(value = 0,message = "{user.sex.size}")
    @Max(value=1,message = "{user.sex.size}")
    private int sex;


}
