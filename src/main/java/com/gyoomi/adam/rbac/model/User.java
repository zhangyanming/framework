package com.gyoomi.adam.rbac.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/12/11 14:37
 */
@Data
public class User implements Serializable {

    /**
     * 主键
     */
    private Long id;

    /**
     * 登录名
     */
    private String loginName;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户头像url链接地址
     */
    private String headImg;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 电子邮箱
     */
    private String email;

    /**
     * 用户状态：1 - 启用；其他 - 停用
     */
    private Integer status;

    /**
     * 创建人id
     */
    private Long createUser;

    /**
     * 创建时间
     */
    private Date createDate;

    /**
     * 修改人id
     */
    private Long updateUser;

    /**
     * 修改时间
     */
    private Date updateDate;

    /**
     * 备注
     */
    private String remark;

}