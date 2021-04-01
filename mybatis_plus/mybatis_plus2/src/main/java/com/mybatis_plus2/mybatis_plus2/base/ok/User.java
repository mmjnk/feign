package com.mybatis_plus2.mybatis_plus2.base.ok;


import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@TableName("user")
@Component
@Accessors(chain = true)
public class User implements Serializable {
    @TableId(value = "id")
    private int id;
    private String name;
    private String type;
    private String description;
}
