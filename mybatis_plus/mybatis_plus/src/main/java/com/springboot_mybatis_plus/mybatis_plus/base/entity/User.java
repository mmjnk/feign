package com.springboot_mybatis_plus.mybatis_plus.base.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@TableName("user")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = false)
public class User implements Serializable {


    @TableId(value = "id")
    private int id;
    @TableField("type")
    private String type;
    @TableField("name")
    private String name;
    @TableField("description")
    private String description;
}
