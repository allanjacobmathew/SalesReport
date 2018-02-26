package com.example.allanjacob.salesreport.DataBase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by allan.jacob on 2/13/2018.
 */

@Entity
public class SaleDetails {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "item")
    private String item;

    @ColumnInfo(name = "number")
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
