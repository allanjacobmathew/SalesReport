package com.example.allanjacob.salesreport.DataBase;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.paging.PagedList;

import com.example.allanjacob.salesreport.RoomApplication;

/**
 * Created by allan.jacob on 2/14/2018.
 */

public class SaleDetailsViewModel extends ViewModel {

    public LiveData<PagedList<SaleDetails>> getAllSale(){
        return RoomApplication.getInstance().getDb().saleDao().getAll()
                .create(0,new PagedList.Config.Builder()
                        .setPageSize(30).setPrefetchDistance(30).build());
    }

//    public LiveData<PagedList<SaleDetails>> getFilterResult(String filterString) {
//         return RoomApplication.getInstance().getDb().saleDao().getFilterResult(filterString)
//                .create(0,new PagedList.Config.Builder()
//                        .setPageSize(30).setPrefetchDistance(30).build());
//    }
}
