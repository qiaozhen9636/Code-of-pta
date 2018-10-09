/**
 * Copyright (C), 2018-2018, XXX有限公司
 * FileName: Damo1
 * Author:   Administrator
 * Date:     2018/10/8 21:24
 * Description: Damo的beans
 * History:
 * <author>          <time>          <version>          <desc>
 * qiaozhen         修改时间          版本号             描述
 */
package com.qiaozhen.beans;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Damo的beans〉
 *
 * @author Administrator
 * @create 2018/10/8
 * @since 1.0.0
 */

public class Damo1 {
    private int id = -1;
    private String name = "";

    public Damo1(){}

    public Damo1(int id) {
        this.id = id;
    }

    public Damo1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Damo1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
