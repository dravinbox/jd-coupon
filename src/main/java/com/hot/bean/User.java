package com.hot.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @ClassName User
 * @Description TODO
 * @Author Dravin
 * @Date 2018/11/9 下午3:43
 * @Version 1.0
 */
@ApiModel(value = "用户对象")
public class User {
    @ApiModelProperty(value = "用户的id")
    private Integer userId;
    @ApiModelProperty(value = "用户名称")
    private String username;
    @ApiModelProperty(value = "用户密码")
    private String password;
    @ApiModelProperty(value = "用户年龄")
    private String age;
    @ApiModelProperty(value = "电子邮件")
    private String email;

    public User(){

    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
