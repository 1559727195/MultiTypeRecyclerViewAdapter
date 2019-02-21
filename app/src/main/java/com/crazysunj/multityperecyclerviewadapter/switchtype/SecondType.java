package com.crazysunj.multityperecyclerviewadapter.switchtype;

import com.crazysunj.multitypeadapter.entity.MultiTypeEntity;


/**
 * @author: sunjian
 * created on: 2017/10/19 上午11:16
 * description:
 */

public class SecondType implements MultiTypeEntity {

    public static final int TYPE_2 = 1;

    private long id;
    private String title;

    public SecondType(long id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int getItemType() {
        return TYPE_2;
    }

    @Override
    public long getId() {
        return id;
    }
}
