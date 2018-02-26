package com.example.allanjacob.salesreport.DataBase;

import android.arch.paging.LivePagedListProvider;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

/**
 * Created by allan.jacob on 2/13/2018.
 */

@Dao
public interface SaleDao {
    @Insert
    long insertContact(SaleDetails contactDetails);
    @Query("SELECT * FROM SaleDetails")
    LivePagedListProvider<Integer, SaleDetails> getAll();

//    @Query("SELECT * FROM saledetails")
//    LivePagedListProvider<Integer, SaleDetails> getFilterResult(String filterString);
}
