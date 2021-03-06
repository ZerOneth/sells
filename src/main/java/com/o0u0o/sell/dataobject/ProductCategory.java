package com.o0u0o.sell.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Author aiuiot
 * @Date 2020/2/3 1:53 下午
 * @Descripton: 类目
 * 该注解 @DynamicUpdate 用户动态更新 如时间
 **/
@Entity
@Data
@DynamicUpdate
public class ProductCategory {

    /** 类目ID. */
    @Id
    @GeneratedValue
    private Integer categoryId;

    /** 类目名称. */
    private String categoryName;

    /** 类型编号. */
    private Integer categoryType;

    /** 创建时间. */
    private Date createTime;

    /** 更新时间. */
    private Date updateTime;

    public ProductCategory() {

    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
